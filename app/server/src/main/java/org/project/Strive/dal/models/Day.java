package org.project.Strive.dal.models;

import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "Days")
public class Day {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer dayId;

    @ManyToOne
    @JoinColumn(name = "programId")
    private Program program;

    private String name;

    @OneToMany(mappedBy = "day", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<DaysExercises> daysExercises;

    // Getters and setters
    // ...
}
