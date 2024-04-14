package org.project.Strive.dal.repositories;

import org.project.Strive.dal.models.*;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DaysExerciseRepository extends JpaRepository<DaysExercise, DaysExerciseId> {

    List<DaysExercise> findAllByDay(Day day);
}