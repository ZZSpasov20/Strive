package org.project.Strive.bll.services;

import org.project.Strive.dal.models.Day;
import org.project.Strive.dal.models.DaysExercise;
import org.project.Strive.dal.models.Exercise;
import org.project.Strive.dal.models.Program;
import org.project.Strive.dal.repositories.DayRepository;
import org.project.Strive.dal.repositories.DaysExerciseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Service
public class DaysExerciseService {
    private final DaysExerciseRepository daysExerciseRepository;

    @Autowired
    public DaysExerciseService(DaysExerciseRepository daysExerciseRepository) {
        this.daysExerciseRepository = daysExerciseRepository;
    }

    public List<DaysExercise> getAll(Day day) {
        return daysExerciseRepository.findAllWhereDay(day);
    }


    public DaysExercise createDaysExercise(DaysExercise daysExercise) {
        return daysExerciseRepository.save(daysExercise);
    }
}
