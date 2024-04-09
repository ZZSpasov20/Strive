package org.project.Strive.bll.controllers;

import org.project.Strive.bll.services.AuthService;
import org.project.Strive.bll.services.ClientStatService;
import org.project.Strive.bll.services.ProgramService;
import org.project.Strive.dal.models.Client;
import org.project.Strive.dal.models.ClientStat;
import org.project.Strive.dal.models.Program;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("program")
public class ProgramController {
    private final ProgramService programService;

    private final AuthService authService;

    @Autowired
    public ProgramController(ProgramService programService, AuthService authService) {
        this.programService = programService;
        this.authService = authService;
    }

    @GetMapping("/getAll")
    public List<Program> getAllPrograms(Authentication authentication) {
        Client client = authService.getClientByToken(authentication);
        return programService.getAllPrograms(client);
    }

    @PostMapping("/create")
    public Program createProgram(@RequestBody Program program, Authentication authentication) {
        Client client = authService.getClientByToken(authentication);
        program.setClient(client);
        return programService.createProgram(program);
    }

    @PutMapping("/update")
    public Program updateProgram(@RequestBody Program program) {
        return programService.createProgram(program);
    }
}
