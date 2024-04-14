package org.project.Strive.bll.controllers;

import org.project.Strive.bll.services.RecordService;


import org.project.Strive.dal.models.Exercise;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("record")
public class RecordController {
    private final RecordService recordService;

    @Autowired
    public RecordController(RecordService recordService) {
        this.recordService = recordService;
    }

    @GetMapping("/getAll")
    public List<Record> getAllRecord(@RequestBody Exercise exercise) {

        return recordService.getAllRecords(exercise);
    }

    @PostMapping("/create")
    public Record createRecord(@RequestBody Record record, Exercise exercise) {
        return recordService.createRecord(record);
    }

    @PutMapping("/update")
    public Record updateRecord(@RequestBody Record record) {
        return recordService.createRecord(record);
    }
}
