package org.project.Strive.bll.controllers;

import org.project.Strive.bll.services.RecordService;
import org.project.Strive.dal.models.RecordInputDTO;
import org.project.Strive.dal.models.Record;
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
    public List<Record> getAllRecord(@RequestBody RecordInputDTO recordInputDTO) {
        return recordService.getAllRecords(recordInputDTO.getExercise(), recordInputDTO.getDay());
    }

    @PostMapping("/create")
    public Record createRecord(@RequestBody RecordInputDTO recordInputDTO) {
        Record record = recordInputDTO.getRecord();
        record.setExercise(recordInputDTO.getExercise());
        record.setDay(recordInputDTO.getDay());

        return recordService.createRecord(record);
    }

    @PutMapping("/update")
    public Record updateRecord(@RequestBody Record record) {
        return recordService.createRecord(record);
    }
}
