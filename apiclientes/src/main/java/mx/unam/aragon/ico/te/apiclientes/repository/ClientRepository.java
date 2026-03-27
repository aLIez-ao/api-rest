package mx.unam.aragon.ico.te.apiclientes.repository;

import mx.unam.aragon.ico.te.apiclientes.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Integer> {

}
