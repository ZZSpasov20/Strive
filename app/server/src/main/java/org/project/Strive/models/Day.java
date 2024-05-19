package org.project.Strive.models;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "Days")
public class Day {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "DayId")
    private int dayId;

    @Column(name = "Name", nullable = false, length = 50)
    private String name;

    @ManyToOne
    @JoinColumn(name = "ProgramId", nullable = false)
    private Program program; // This needs to be added to establish the relationship

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "DaysExerciseId")
    private List<DaysExercise> daysExercises;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "RecordId")
    private List<Record> records;

    @Column(name = "DeteledAt", nullable = true)
    @Temporal(TemporalType.DATE)
    private String deteledAt;

    public int getDayId() {
        return dayId;
    }

    public void setDayId(int dayId) {
        this.dayId = dayId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Record> getRecords() {
        return records;
    }

    public void setRecords(List<Record> records) {
        this.records = records;
    }

    public Program getProgram() {
        return program;
    }

    public void setProgram(Program program) {
        this.program = program;
    }

    public List<DaysExercise> getDaysExercises() {
        return daysExercises;
    }

    public void setDaysExercises(List<DaysExercise> daysExercises) {
        this.daysExercises = daysExercises;
    }

    public String getDeteledAt() {
        return deteledAt;
    }

    public void setDeteledAt(String deteledAt) {
        this.deteledAt = deteledAt;
    }
}