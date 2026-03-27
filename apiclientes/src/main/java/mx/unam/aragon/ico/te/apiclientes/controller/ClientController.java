package mx.unam.aragon.ico.te.apiclientes.controller;

import mx.unam.aragon.ico.te.apiclientes.entity.Client;
import mx.unam.aragon.ico.te.apiclientes.service.interfaces.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("/client")
public class ClientController {

    @Autowired
    private ClientService clientService;


    @GetMapping("/")
    public ResponseEntity<ArrayList<Client>> index() {
        return ResponseEntity.ok(clientService.getClients());
    }

    //TODO: Completar el resto
}
