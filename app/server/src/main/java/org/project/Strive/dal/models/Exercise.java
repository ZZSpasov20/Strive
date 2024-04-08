package org.project.Strive.dal.models;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "Exercises")
public class Exercise {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ExerciseId")
    private int exerciseId;

    @Column(name = "Name", nullable = false, length = 50)
    private String name;

    @Column(name = "Description", nullable = false, columnDefinition = "VARCHAR(MAX)")
    private String description;

    @OneToMany(mappedBy = "exercise")
    private List<DaysExercise> daysExercises;

    @OneToMany(mappedBy = "exercise")
    private List<Record> records;

    // Getters and setters


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

    public List<DaysExercise> getDaysExercises() {
        return daysExercises;
    }

    public void setDaysExercises(List<DaysExercise> daysExercises) {
        this.daysExercises = daysExercises;
    }

    public List<Record> getRecords() {
        return records;
    }

    public void setRecords(List<Record> records) {
        this.records = records;
    }
}