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
    private Client client;

    @Column(name = "Name", nullable = false, length = 50)
    private String name;

    @OneToMany(mappedBy = "program")
    private List<Day> days;

    public int getProgramId() {
        return programId;
    }

    public void setProgramId(int programId) {
        this.programId = programId;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
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
}