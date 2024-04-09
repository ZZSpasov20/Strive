package org.project.Strive.bll.controllers;

import org.project.Strive.bll.services.AuthService;
import org.project.Strive.bll.services.ClientService;
import org.project.Strive.dal.models.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("client")
public class ClientController {
    private ClientService clientService;
    private AuthService authService;

    @Autowired
    public ClientController(ClientService clientService, AuthService authService) {
        this.clientService = clientService;
        this.authService = authService;
    }


    @GetMapping("/current")
    public Client getClient(Authentication authentication) {
        Client client = authService.getClientByToken(authentication);

        return client;
    }

    @PostMapping("/create")
    public Client createClient(@RequestBody Client client, Authentication authentication) {
        Client savedClient = clientService.saveClient(client);

        return savedClient;
    }

    @PutMapping("/update")
    public Client updateClient(@RequestBody Client client, Authentication authentication) {
        Client savedClient = clientService.saveClient(client);

        return savedClient;
    }


}
