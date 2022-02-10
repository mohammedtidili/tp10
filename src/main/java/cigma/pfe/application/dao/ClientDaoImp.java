package cigma.pfe.application.dao;

import cigma.pfe.application.model.Client;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class ClientDaoImp implements ClientDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void save (Client client) {

    }

    public ClientDaoImp () {
    }
}
