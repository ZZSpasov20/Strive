package org.project.Strive.bll.controllers;

import org.project.Strive.bll.services.ExerciseService;
import org.project.Strive.dal.models.Day;
import org.project.Strive.dal.models.DaysExercise;
import org.project.Strive.dal.models.Exercise;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("exercise")
public class ExerciseController {
    private final ExerciseService exerciseService;

    @Autowired
    public ExerciseController(ExerciseService exerciseService) {
        this.exerciseService = exerciseService;
    }

    @GetMapping("/getAll")
    public List<Exercise> getAllExercise() {
        return exerciseService.findAllExercises();
    }

    @PostMapping("/create")
    public Exercise createExercise(@RequestBody Exercise exercise) {
        return exerciseService.createExercise(exercise);
    }

    @PutMapping("/update")
    public Exercise updateExercise(@RequestBody Exercise exercise) {
        return exerciseService.createExercise(exercise);
    }
}
