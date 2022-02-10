package cigma.pfe.application.controller;

import cigma.pfe.application.model.Client;
import cigma.pfe.application.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller("clientCtr")
public class ClientController {

    @Autowired
    private ClientService clientService;

    public void save (Client client) {
    }

    public ClientController () {
    }
}
