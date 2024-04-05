package org.project.Strive.dal.repositories;

import org.project.Strive.dal.models.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends JpaRepository<Client, Integer> {
    Client findByUsername(String username);
}
