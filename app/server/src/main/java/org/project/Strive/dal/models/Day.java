package org.project.Strive.dal.models;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "Days")
public class Day {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "DayId")
    private int dayId;

    @ManyToOne
    @JoinColumn(name = "ProgramId", nullable = false)
    private Program program;

    @Column(name = "Name", nullable = false, length = 50)
    private String name;

    @OneToMany(mappedBy = "day")
    private List<DaysExercise> daysExercises;

    // Getters and setters


    public int getDayId() {
        return dayId;
    }

    public void setDayId(int dayId) {
        this.dayId = dayId;
    }

    public Program getProgram() {
        return program;
    }

    public void setProgram(Program program) {
        this.program = program;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<DaysExercise> getDaysExercises() {
        return daysExercises;
    }

    public void setDaysExercises(List<DaysExercise> daysExercises) {
        this.daysExercises = daysExercises;
    }
}