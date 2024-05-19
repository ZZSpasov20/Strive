package org.project.Strive.controllers;

import org.project.Strive.services.AuthService;
import org.project.Strive.models.Client;
import org.project.Strive.models.LoginRequest;
import org.project.Strive.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {
    private final ClientService clientService;
    private final AuthService authService;

    @Autowired
    public AuthController(ClientService clientService, AuthService authService) {
        this.clientService = clientService;
        this.authService = authService;
    }

    @PostMapping(value = "/signup", consumes = "application/json", produces = "application/json")
    public Client register(@RequestBody Client client) {
        return clientService.saveClient(client);
    }

    @PostMapping(value = "/login", consumes = "application/json", produces = "application/json")
    public String login(@RequestBody LoginRequest loginRequest) {
        if(authService.authenticate(loginRequest.getUsername(), loginRequest.getPassword())){
            String token = authService.generateToken(loginRequest.getUsername());
            return token;
        }
        return "Login unsuccessful";
    }
}