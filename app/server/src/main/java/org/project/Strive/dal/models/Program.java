package org.project.Strive.dal.models;

import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "Programs")
public class Program {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer programId;

    @ManyToOne
    @JoinColumn(name = "clientId")
    private Client client;

    private String name;

    @OneToMany(mappedBy = "program", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Day> days;

    // Getters and setters
}
