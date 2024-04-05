package org.project.Strive.dal.models;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "records")
public class Record {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer recordId;

    @ManyToOne
    @JoinColumn(name = "exerciseId")
    private Exercise exercise;

    private Integer exerciseOrder;
    private Integer setNumber;
    private Integer reps;
    private Integer weight;

    @Temporal(TemporalType.DATE)
    private Date date;

    // Getters and setters
    // ...
}