package org.project.Strive.dal.models;

import jakarta.persistence.*;

@Entity
@Table(name = "DaysExercises")
public class DaysExercise {
    @Id
    @ManyToOne
    @JoinColumn(name = "DayId")
    private Day day;

    @Id
    @ManyToOne
    @JoinColumn(name = "ExerciseId")
    private Exercise exercise;

    @Column(name = "ExerciseOrder", nullable = false)
    private int exerciseOrder;

    @Column(name = "SetNumber", nullable = false)
    private int setNumber;

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