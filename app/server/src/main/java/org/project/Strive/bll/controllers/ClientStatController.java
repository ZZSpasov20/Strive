package org.project.Strive.bll.controllers;

import org.project.Strive.bll.services.AuthService;
import org.project.Strive.bll.services.ClientStatService;
import org.project.Strive.dal.models.Client;
import org.project.Strive.dal.models.ClientStat;
import org.project.Strive.dal.repositories.ClientStatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("clientStats")
public class ClientStatController {
    private final ClientStatService clientStatService;

    private final AuthService authService;

    @Autowired
    public ClientStatController(ClientStatService clientStatService, AuthService authService){
        this.clientStatService = clientStatService;
        this.authService = authService;
    }

    @GetMapping("/getAll")
    public List<ClientStat> getAllClientStats(Authentication authentication) {
        Client client = authService.getClientByToken(authentication);
        return clientStatService.getAllClients(client);
    }

    @PostMapping("/create")
    public ClientStat createClientStat(@RequestBody ClientStat clientStat, Authentication authentication) {
        Client client = authService.getClientByToken(authentication);
        clientStat.setClient(client);

        return clientStatService.createClientStat(clientStat);
    }

    @PutMapping("/update")
    public ClientStat updateClientStat(@RequestBody ClientStat clientStat) {
        return clientStatService.createClientStat(clientStat);
    }
}
