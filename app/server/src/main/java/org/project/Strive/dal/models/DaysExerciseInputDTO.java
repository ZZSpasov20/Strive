package org.project.Strive.dal.models;

public class DaysExerciseInputDTO {
    private Day day;
    private Exercise exercise;

    private DaysExercise daysExercise;


    public DaysExercise getDaysExercise() {
        return daysExercise;
    }

    public void setDaysExercise(DaysExercise daysExercise) {
        this.daysExercise = daysExercise;
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
}
