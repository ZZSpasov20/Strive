package org.project.Strive.bll.services;

import org.project.Strive.dal.models.Client;
import org.project.Strive.dal.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("userDetailsService")
public class ClientService {
    BCryptPasswordEncoder passwordEncoder;
    private ClientRepository clientRepository;

    @Autowired
    public ClientService(ClientRepository clientRepository){
        this.passwordEncoder = new BCryptPasswordEncoder();
        this.clientRepository = clientRepository;
    }

    public List<Client> listClients(){
        return clientRepository.findAll();
    }

    public Client findByUsername(String username){
        return clientRepository.findByUsername(username);
    }

    public Client saveClient(Client client) {
        client.setPassword(passwordEncoder.encode(client.getPassword()));
        return clientRepository.save(client);
    }
}
