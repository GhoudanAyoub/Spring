package spring.cours.springjpa2.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "developpeur")
public class developpeur {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int developpeurID;
    @Column(length = 10,nullable = false)
    private String nom;
    @Column(length = 100)
    private String description;
    @Column(length = 50, unique = true)
    private String email;

    @ManyToMany(targetEntity=taches.class)
    private List<taches> tachesList = new ArrayList<>();

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
