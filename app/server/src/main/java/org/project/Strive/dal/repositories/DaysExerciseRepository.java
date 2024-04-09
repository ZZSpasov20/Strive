package org.project.Strive.dal.repositories;

import org.project.Strive.dal.models.Day;
import org.project.Strive.dal.models.DaysExercise;
import org.project.Strive.dal.models.Exercise;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DaysExerciseRepository extends JpaRepository<DaysExercise, Exercise> {
    List<DaysExercise> findAllWhereDay(Day day);
}
