package org.project.Strive.models;

import jakarta.persistence.*;

@Entity
@Table(name = "DaysExercises")
public class DaysExercise {
    @EmbeddedId
    private DaysExerciseId daysExerciseId;

    @MapsId("dayId") // Maps dayId in DaysExerciseId to the day entity
    @ManyToOne
    @JoinColumn(name = "DayId") // This should match the column name in the database
    private Day day;

    @MapsId("exerciseId") // Maps exerciseId in DaysExerciseId to the exercise entity
    @ManyToOne
    @JoinColumn(name = "ExerciseId") // This should match the column name in the database
    private Exercise exercise;

    @Column(name = "ExerciseOrder", nullable = false)
    private int exerciseOrder;

    @Column(name = "SetNumber", nullable = false)
    private int setNumber;

    @Column(name = "DeteledAt", nullable = true)
    @Temporal(TemporalType.DATE)
    private String deteledAt;

    public String getDeteledAt() {
        return deteledAt;
    }

    public void setDeteledAt(String deteledAt) {
        this.deteledAt = deteledAt;
    }

    public Day getDay() {
        return day;
    }

    public void setDay(Day day) {
        this.day = day;
    }

    public Exercise getExercise() {
        return exercise;
    }

    public void setExercise(Exercise exercise) {
        this.exercise = exercise;
    }

    public int getExerciseOrder() {
        return exerciseOrder;
    }

    public void setExerciseOrder(int exerciseOrder) {
        this.exerciseOrder = exerciseOrder;
    }

    public int getSetNumber() {
        return setNumber;
    }

    public void setSetNumber(int setNumber) {
        this.setNumber = setNumber;
    }
}