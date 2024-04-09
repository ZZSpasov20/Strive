package org.project.Strive.bll.services;

import org.project.Strive.dal.models.Client;
import org.project.Strive.dal.models.ClientStat;
import org.project.Strive.dal.models.Program;
import org.project.Strive.dal.repositories.ProgramRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
@Service
public class ProgramService {
    private final ProgramRepository programRepository;

    @Autowired
    public ProgramService(ProgramRepository programRepository) {
        this.programRepository = programRepository;
    }

    public List<Program> getAllPrograms(Client client){
        return programRepository.findAllByClient(client);
    }

    public Program createProgram(Program program) {
        return programRepository.save(program);
    }
}
