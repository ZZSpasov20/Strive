package org.project.Strive.dal.models;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Records")
public class Record {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "RecordId")
    private int recordId;

    @Column(name = "ExerciseId", nullable = false)
    private int exerciseId;  // Direct reference to Exercise ID

    @Column(name = "ExerciseOrder", nullable = false)
    private int exerciseOrder;

    @Column(name = "SetNumber", nullable = false)
    private int setNumber;

    @Column(name = "Reps", nullable = false)
    private int reps;

    @Column(name = "Weight", nullable = false)
    private int weight;

    @Column(name = "Date", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date date;

    public int getRecordId() {
        return recordId;
    }

    public void setRecordId(int recordId) {
        this.recordId = recordId;
    }

    public int getExerciseId() {
        return exerciseId;
    }

    public void setExerciseId(int exerciseId) {
        this.exerciseId = exerciseId;
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

    public int getReps() {
        return reps;
    }

    public void setReps(int reps) {
        this.reps = reps;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}