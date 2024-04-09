package org.project.Strive.bll.services;


import org.project.Strive.dal.models.Exercise;
import org.project.Strive.dal.models.Record;
import org.project.Strive.dal.repositories.RecordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class RecordService {
    private final RecordRepository recordRepository;

    @Autowired
    public RecordService(RecordRepository recordRepository) {
        this.recordRepository = recordRepository;
    }

    public List<Record> getAllRecords(Exercise exercise) {
        return recordRepository.findAllByExercise(exercise);
    }

    public Record createRecord(Record record) {
        return recordRepository.save(record);
    }
}
