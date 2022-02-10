package cigma.pfe.application.service;

import cigma.pfe.application.dao.ClientDao;
import cigma.pfe.application.model.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class ClientServiceImp implements ClientService {

    @Autowired
    private ClientDao clientDao;

    @Override
    public void save (Client client) {

    }

    public ClientServiceImp () {
    }
}
