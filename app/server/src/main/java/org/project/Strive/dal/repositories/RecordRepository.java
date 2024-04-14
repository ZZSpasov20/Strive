package org.project.Strive.dal.repositories;


import org.project.Strive.dal.models.Day;
import org.project.Strive.dal.models.Exercise;
import org.project.Strive.dal.models.Record;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RecordRepository  extends JpaRepository<Record, Integer> {
    List<Record> findByDayAndExercise(Day day, Exercise exercise);
}
