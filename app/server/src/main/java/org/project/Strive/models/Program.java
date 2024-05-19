package org.project.Strive.models;

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
    @Column(name = "CreatedAt", nullable = true)
    @Temporal(TemporalType.DATE)
    private String CreatedAt;

    @Column(name = "DeteledAt", nullable = true)
    @Temporal(TemporalType.DATE)
    private String deteledAt;

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

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public String getCreatedAt() {
        return CreatedAt;
    }

    public void setCreatedAt(String createdAt) {
        CreatedAt = createdAt;
    }

    public String getDeteledAt() {
        return deteledAt;
    }

    public void setDeteledAt(String deteledAt) {
        this.deteledAt = deteledAt;
    }

    // Getters and setters
}