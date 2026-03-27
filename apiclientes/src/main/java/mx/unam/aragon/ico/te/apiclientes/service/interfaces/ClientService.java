package mx.unam.aragon.ico.te.apiclientes.service.interfaces;

import mx.unam.aragon.ico.te.apiclientes.entity.Client;

import java.util.ArrayList;

public interface ClientService {
    ArrayList<Client> getClients();
    Client getClient(Integer id);
    Client saveClient(Client client);
    Client deleteClient(Integer id);
    Client updateClient(Integer id, Client client);
    Client updateClientFull(Integer id, Client client);


}
