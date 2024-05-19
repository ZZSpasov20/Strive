package org.project.Strive.models;

import jakarta.persistence.*;

@Entity
@Table(name = "Exercises")
public class Exercise {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ExerciseId")
    private int exerciseId;

    @Column(name = "Name", nullable = false, length = 50)
    private String name;

    @Column(name = "Description")
    private String description;



    public int getExerciseId() {
        return exerciseId;
    }

    public void setExerciseId(int exerciseId) {
        this.exerciseId = exerciseId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }



    // Getters and setters
}