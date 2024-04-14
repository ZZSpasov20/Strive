package org.project.Strive.bll.controllers;

import org.project.Strive.bll.services.AuthService;
import org.project.Strive.bll.services.DaysExerciseService;
import org.project.Strive.dal.models.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("daysExercise")
public class DaysExerciseController {
    private final DaysExerciseService daysExerciseService;
    private final AuthService authService;

    @Autowired
    public DaysExerciseController(DaysExerciseService daysExerciseService, AuthService authService) {
        this.daysExerciseService = daysExerciseService;
        this.authService = authService;
    }

    @GetMapping("/getAll")
    public List<DaysExercise> getAllDaysExercise(@RequestBody Day day) {
        return daysExerciseService.getAll(day);
    }

    @PostMapping("/create")
    public DaysExercise createDaysExercise(@RequestBody DaysExerciseInputDTO daysExerciseInputDTO)  {
        DaysExercise daysExercise = daysExerciseInputDTO.getDaysExercise();
        daysExercise.setDay(daysExerciseInputDTO.getDay());
        daysExercise.setExercise(daysExerciseInputDTO.getExercise());
        return daysExerciseService.createDaysExercise(daysExercise);
    }

    @PutMapping("/update")
    public DaysExercise updateDaysExercise(@RequestBody DaysExercise daysExercise) {
        return daysExerciseService.createDaysExercise(daysExercise);
    }
}
