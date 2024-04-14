package org.project.Strive.bll.controllers;

import org.project.Strive.bll.services.DayService;
import org.project.Strive.dal.models.Day;
import org.project.Strive.dal.models.Program;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("day")
public class DayController {
    private final DayService dayService;

    @Autowired
    public DayController(DayService dayService) {
        this.dayService = dayService;
    }

    @GetMapping("/getAll")
    public List<Day> getAllDays(@RequestBody Program program) {
        return dayService.getAllDays(program);
    }

    @PostMapping("/create")
    public Day createDay(@RequestBody Day day,  Program program) {
        return dayService.createDay(day);
    }

    @PutMapping("/update")
    public Day updateDay(@RequestBody Day day) {
        return dayService.createDay(day);
    }
}
