package org.project.Strive.dal.repositories;

import org.project.Strive.dal.models.Client;
import org.project.Strive.dal.models.Program;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProgramRepository extends JpaRepository<Program, Integer> {
    List<Program> findAllByClient(Client client);
}
