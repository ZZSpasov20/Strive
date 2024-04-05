package org.project.Strive.bll.services;
import org.project.Strive.dal.models.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.oauth2.jwt.*;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.Optional;

@Service
public class AuthService {
    private final ClientService clientService;
    private final JwtEncoder encoder;
    //private JwtDecoder decoder;

    @Autowired
    public AuthService(ClientService clientService, JwtEncoder encoder){
        this.clientService = clientService;
        this.encoder = encoder;
    }

    private final BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

    public boolean authenticate(String username, String password){
        Optional<Client> optionalUser = Optional.ofNullable(clientService.findByUsername(username));
        if(optionalUser.isEmpty()) return false;
        return passwordEncoder.matches(password, optionalUser.get().getPassword());
    }

    public String generateToken(String username) {
        Instant now = Instant.now();
        JwtClaimsSet claims = JwtClaimsSet.builder()
                .issuer("self")
                .issuedAt(now)
                .expiresAt(now.plus(1, ChronoUnit.HOURS))
                .subject(username)
                .build();
        return this.encoder.encode(JwtEncoderParameters.from(claims)).getTokenValue();
    }

    public Client getClientByToken(Authentication authentication) {
        Jwt jwt = (Jwt) authentication.getPrincipal();
        return clientService.findByUsername(jwt.getClaim("sub"));
    }
}