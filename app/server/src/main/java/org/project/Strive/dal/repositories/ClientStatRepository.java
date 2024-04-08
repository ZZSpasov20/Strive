package org.project.Strive.dal.repositories;

import org.project.Strive.dal.models.ClientStat;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientStatRepository extends JpaRepository<ClientStat, Integer> {
}
