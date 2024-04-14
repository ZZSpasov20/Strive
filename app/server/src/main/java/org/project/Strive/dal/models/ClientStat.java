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

    @Column(name = "Weight", nullable = false)
    private double weight;

    @Column(name = "Height", nullable = false)
    private double height;

    @Column(name = "DateOfTheStats", nullable = false)
    @Temporal(TemporalType.DATE)
    private String dateOfTheStats;

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