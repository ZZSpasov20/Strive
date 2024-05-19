package org.project.Strive.models;

import jakarta.persistence.*;


@Entity
@Table(name = "Records")
public class Record {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "RecordId")
    private int recordId;

    @ManyToOne
    @JoinColumn(name = "DayId", nullable = false)
    private Day day;

    @ManyToOne
    @JoinColumn(name = "ExerciseId", nullable = false)
    private Exercise exercise;

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
    private String date;

    @Column(name = "DeteledAt", nullable = true)
    @Temporal(TemporalType.DATE)
    private String deteledAt;

    public int getRecordId() {
        return recordId;
    }

    public void setRecordId(int recordId) {
        this.recordId = recordId;
    }

    public Exercise getExercise() {
        return exercise;
    }


    public Day getDay() {
        return day;
    }

    public void setDay(Day day) {
        this.day = day;
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

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDeteledAt() {
        return deteledAt;
    }

    public void setDeteledAt(String deteledAt) {
        this.deteledAt = deteledAt;
    }
}