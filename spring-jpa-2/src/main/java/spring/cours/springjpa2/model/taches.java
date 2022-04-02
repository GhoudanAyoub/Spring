package spring.cours.springjpa2.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "taches")
public class taches {
    @Id
    private int idtache;
    private int clientID;
    @Column(length = 10)
    private String nom;
    @Column(length = 100)
    private String description;

    public int getIdtache() {
        return idtache;
    }

    public void setIdtache(int idtache) {
        this.idtache = idtache;
    }

    public int getClientID() {
        return clientID;
    }

    public void setClientID(int clientID) {
        this.clientID = clientID;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
