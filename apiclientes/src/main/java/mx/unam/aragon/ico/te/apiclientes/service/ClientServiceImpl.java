package mx.unam.aragon.ico.te.apiclientes.service;

import mx.unam.aragon.ico.te.apiclientes.entity.Client;
import mx.unam.aragon.ico.te.apiclientes.repository.ClientRepository;
import mx.unam.aragon.ico.te.apiclientes.service.interfaces.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class ClientServiceImpl implements ClientService {
    @Autowired
    private ClientRepository clientRepository;

    @Override
    public ArrayList<Client> getClients() {
        ArrayList<Client> clients = new ArrayList<>();
        clientRepository.findAll().forEach(clients::add);
        return clients;
    }

    @Override
    public Client getClient(Integer id) {
        return clientRepository.findById(id).orElse(null);
    }

    @Override
    public Client saveClient(Client client) {
        return clientRepository.save(client);
    }

    @Override
    public Client deleteClient(Integer id) {
        Client client = clientRepository.findById(id).orElse(null);
        assert client != null;
        clientRepository.delete(client);
        return client;
    }

    @Override
    public Client updateClient(Integer id, Client client) {
        return null;
    }

    @Override
    public Client updateClientFull(Integer id, Client client) {
        return null;
    }

    //TODO: Completar el resto
}
