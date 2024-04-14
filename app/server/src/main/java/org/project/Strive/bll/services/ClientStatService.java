package org.project.Strive.bll.services;

import org.project.Strive.dal.models.Client;
import org.project.Strive.dal.models.ClientStat;
import org.project.Strive.dal.repositories.ClientStatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientStatService {
    private final ClientStatRepository clientStatRepository;

    @Autowired
    public ClientStatService(ClientStatRepository clientStatRepository){
        this.clientStatRepository = clientStatRepository;
    }

    public List<ClientStat> getAllClients(Client client){
        return clientStatRepository.findAllByClient(client);
    }

    public ClientStat createClientStat(ClientStat clientStat){
        return clientStatRepository.save(clientStat);
    }
}
