package org.project.Strive.dal.models;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "Programs")
public class Program {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ProgramId")
    private int programId;
    @ManyToOne
    @JoinColumn(name = "ClientId", nullable = false)
    private Client client; // This needs to be added to establish the relationship


    @Column(name = "Name", nullable = false, length = 50)
    private String name;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "DayId")
    private List<Day> days;

    public int getProgramId() {
        return programId;
    }

    public void setProgramId(int programId) {
        this.programId = programId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Day> getDays() {
        return days;
    }

    public void setDays(List<Day> days) {
        this.days = days;
    }

    // Getters and setters
}