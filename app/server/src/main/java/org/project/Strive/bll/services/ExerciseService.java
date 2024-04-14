package org.project.Strive.bll.services;

import org.project.Strive.dal.models.Exercise;
import org.project.Strive.dal.repositories.ExerciseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExerciseService {
    private final ExerciseRepository exerciseRepository;

    @Autowired
    public ExerciseService(ExerciseRepository exerciseRepository) {
        this.exerciseRepository = exerciseRepository;
    }


    public List<Exercise> findAllExercises() {
        return exerciseRepository.findAll();
    }

    public Exercise createExercise(Exercise exercise) {
        return exerciseRepository.save(exercise);
    }
}
