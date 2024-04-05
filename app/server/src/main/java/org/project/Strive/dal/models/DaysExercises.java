package org.project.Strive.dal.models;

import jakarta.persistence.*;
import org.project.Strive.dal.models.Day;
import org.project.Strive.dal.models.Exercise;

@Entity
@Table(name = "DaysExercises")
public class DaysExercises {
    @Id
    private Integer dayId;

    @Id
    private Integer exerciseId;

    private Integer exerciseOrder;
    private Integer setNumber;

    @ManyToOne
    @JoinColumn(name = "dayId", insertable = false, updatable = false)
    private Day day;

    @ManyToOne
    @JoinColumn(name = "exerciseId", insertable = false, updatable = false)
    private Exercise exercise;

    // Getters and setters
    // ...
}