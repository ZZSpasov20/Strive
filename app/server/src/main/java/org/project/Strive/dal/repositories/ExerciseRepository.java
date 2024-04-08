package org.project.Strive.dal.repositories;

import org.project.Strive.dal.models.Exercise;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExerciseRepository  extends JpaRepository<Exercise, Integer> {
}
