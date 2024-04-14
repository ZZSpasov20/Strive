package org.project.Strive.dal.models;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "ClientStats")
public class ClientStat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ClientStatsId")
    private int clientStatsId;

    @ManyToOne
    @JoinColumn(name = "ClientId", nullable = false)
    private Client client; // This needs to be added to establish the relationship

    @Column(name = "Weight", nullable = false)
    private double weight;

    @Column(name = "Height", nullable = false)
    private double height;

    @Temporal(TemporalType.DATE)
    @Column(name = "DateOfTheStats", nullable = false)
    private String dateOfTheStats; // Ensure this is Date type if using @Temporal

    public int getClientStatsId() {
        return clientStatsId;
    }

    public void setClientStatsId(int clientStatsId) {
        this.clientStatsId = clientStatsId;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getDateOfTheStats() {
        return dateOfTheStats;
    }

    public void setDateOfTheStats(String dateOfTheStats) {
        this.dateOfTheStats = dateOfTheStats;
    }

    // Getters and setters
}