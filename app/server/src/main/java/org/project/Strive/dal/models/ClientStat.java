package org.project.Strive.dal.models;

import jakarta.persistence.*;
import org.project.Strive.dal.models.Client;

import java.math.BigDecimal;
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
    private Client client;

    @Column(name = "Weight", nullable = false, precision = 6, scale = 2)
    private BigDecimal  weight;

    @Column(name = "Height", nullable = false, precision = 6, scale = 2)
    private BigDecimal height;

    @Column(name = "DateOfTheStats", nullable = false)
    private Date dateOfTheStats;

    public int getClientStatsId() {
        return clientStatsId;
    }

    public void setClientStatsId(int clientStatsId) {
        this.clientStatsId = clientStatsId;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public BigDecimal getWeight() {
        return weight;
    }

    public void setWeight(BigDecimal weight) {
        this.weight = weight;
    }

    public BigDecimal getHeight() {
        return height;
    }

    public void setHeight(BigDecimal height) {
        this.height = height;
    }

    public Date getDateOfTheStats() {
        return dateOfTheStats;
    }

    public void setDateOfTheStats(Date dateOfTheStats) {
        this.dateOfTheStats = dateOfTheStats;
    }
}