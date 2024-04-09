package org.project.Strive.bll.services;

import org.project.Strive.dal.models.Day;
import org.project.Strive.dal.models.Program;
import org.project.Strive.dal.repositories.DayRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class DayService {
    private final DayRepository dayRepository;

    @Autowired
    public DayService(DayRepository dayRepository) {
        this.dayRepository = dayRepository;
    }

    public List<Day> getAllDays(Program program) {
        return dayRepository.findAllByProgram(program);
    }

    public Day createDay(Day day) {
        return dayRepository.save(day);
    }
}
