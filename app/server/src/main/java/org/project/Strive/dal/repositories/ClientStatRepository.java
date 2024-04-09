package org.project.Strive.dal.repositories;

import org.project.Strive.dal.models.Client;
import org.project.Strive.dal.models.ClientStat;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ClientStatRepository extends JpaRepository<ClientStat, Integer> {
    List<ClientStat> findAllByClient(Client client);
}
