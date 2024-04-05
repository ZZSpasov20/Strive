package org.project.Strive.dal.models;

import jakarta.persistence.*;
import org.project.Strive.dal.models.Client;

import java.util.Date;

@Entity
@Table(name = "ClientStats")
public class ClientStats {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer clientStatsId;

    @ManyToOne
    @JoinColumn(name = "clientId")
    private Client client;

    private double weight;
    private double height;

    @Temporal(TemporalType.DATE)
    private Date dateOfTheStats;

    // Getters and setters
}