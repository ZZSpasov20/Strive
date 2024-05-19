package org.project.Strive.models;

import jakarta.persistence.Embeddable;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class DaysExerciseId implements Serializable {
    private int dayId;
    private int exerciseId;

    public DaysExerciseId() {}

    public DaysExerciseId(int dayId, int exerciseId) {
        this.dayId = dayId;
        this.exerciseId = exerciseId;
    }

    public int getDayId() {
        return dayId;
    }

    public void setDayId(int dayId) {
        this.dayId = dayId;
    }

    public int getExerciseId() {
        return exerciseId;
    }

    public void setExerciseId(int exerciseId) {
        this.exerciseId = exerciseId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DaysExerciseId that = (DaysExerciseId) o;
        return dayId == that.dayId && exerciseId == that.exerciseId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(dayId, exerciseId);
    }

}