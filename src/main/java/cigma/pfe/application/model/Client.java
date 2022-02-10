package cigma.pfe.application.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
/*@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "client_type")
@DiscriminatorValue("client")*/
//@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;

    public Client () {
    }

    public Client (String nom) {
        this.nom = nom;
    }

}
