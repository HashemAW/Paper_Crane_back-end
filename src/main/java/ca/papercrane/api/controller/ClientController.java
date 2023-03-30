package ca.papercrane.api.controller;

import ca.papercrane.api.entity.Client;
import ca.papercrane.api.exception.ResourceNotFoundException;
import ca.papercrane.api.service.impl.ClientServiceImpl;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/clients/")
public class ClientController {

    @Autowired
    private ClientServiceImpl clientService;

    @PostConstruct
    public void init() {
        createFakeClients();
        System.out.println("Fake clients created view at: http://localhost:8080/api/v1/clients/1");
    }

    @GetMapping("{id}")
    public ResponseEntity<Client> getUser(@PathVariable Integer id) {
        try {
            final Client client = clientService.getByUserId(id);
            return new ResponseEntity<>(client, HttpStatus.OK);
        } catch (ResourceNotFoundException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    /**
     * Just to test for now.
     */
    public void createFakeClients() {
        clientService.addNewClient(new Client("client1@email.com", "123456", "Client Name 1", "Website"));
        clientService.addNewClient(new Client("client2@email.com", "123456", "Client Name 2", "Website"));
        clientService.addNewClient(new Client("client3@email.com", "123456", "Client Name 3", "Website"));
        clientService.addNewClient(new Client("client4@email.com", "123456", "Client Name 4", "Website"));
    }

}