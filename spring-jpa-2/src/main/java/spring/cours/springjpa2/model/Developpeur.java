package spring.cours.springjpa2.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name = "developpeur")
public class Developpeur {
    @Id
    private int developpeurID;
    @Column(length = 10)
    private String nom;
    @Column(length = 100)
    private String description;
    @Column(length = 50, unique = true)
    private String email;

    private List<taches> tachesList;

    public List<taches> getTachesList() {
        return tachesList;
    }

    public void setTachesList(List<taches> tachesList) {
        this.tachesList = tachesList;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getDeveloppeurID() {
        return developpeurID;
    }

    public void setDeveloppeurID(int developpeurID) {
        this.developpeurID = developpeurID;
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
