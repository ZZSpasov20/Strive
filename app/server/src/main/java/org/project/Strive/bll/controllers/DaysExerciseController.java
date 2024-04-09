package org.project.Strive.bll.controllers;

import org.project.Strive.bll.services.DaysExerciseService;
import org.project.Strive.dal.models.Day;
import org.project.Strive.dal.models.DaysExercise;
import org.project.Strive.dal.models.Exercise;
import org.project.Strive.dal.models.Program;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("daysExercise")
public class DaysExerciseController {
    private final DaysExerciseService daysExerciseService;

    @Autowired
    public DaysExerciseController(DaysExerciseService daysExerciseService) {
        this.daysExerciseService = daysExerciseService;
    }

    @GetMapping("/getAll")
    public List<DaysExercise> getAllDaysExercise(@RequestBody Day day) {
        return daysExerciseService.getAll(day);
    }

    @PostMapping("/create")
    public DaysExercise createDaysExercise(@RequestBody DaysExercise daysExercise, Day day, Exercise exercise) {
        daysExercise.setDay(day);
        daysExercise.setExercise(exercise);
        return daysExerciseService.createDaysExercise(daysExercise);
    }

    @PutMapping("/update")
    public DaysExercise updateDaysExercise(@RequestBody DaysExercise daysExercise) {
        return daysExerciseService.createDaysExercise(daysExercise);
    }
}
