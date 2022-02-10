package cigma.pfe.application.model;

import lombok.Data;

import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@Data
@PrimaryKeyJoinColumn(name = "normal_id")
//@DiscriminatorValue("normal")
public class ClientNormal extends Client {

    private int importanceLevel;

    public ClientNormal () {
    }

    public ClientNormal (String nom, int importanceLevel) {
        super(nom);
        this.importanceLevel = importanceLevel;
    }

}
