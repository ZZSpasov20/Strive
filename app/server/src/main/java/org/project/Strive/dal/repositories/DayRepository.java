package org.project.Strive.dal.repositories;

import org.project.Strive.dal.models.Client;
import org.project.Strive.dal.models.ClientStat;
import org.project.Strive.dal.models.Day;
import org.project.Strive.dal.models.Program;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DayRepository extends JpaRepository<Day, Integer> {
    List<Day> findAllByProgram(Program program);
}
