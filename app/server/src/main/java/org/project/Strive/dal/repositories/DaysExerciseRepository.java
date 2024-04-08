package org.project.Strive.dal.repositories;

import org.project.Strive.dal.models.Day;
import org.project.Strive.dal.models.DaysExercise;
import org.project.Strive.dal.models.Exercise;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DaysExerciseRepository extends JpaRepository<Day, Exercise> {
}
