package iir4.g5.cours.springjpa1.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "projet")
public class projet {
    @Id
    private int idProjet;
    @Column(length = 10,unique = true)
    private String nom;
    @Column(length = 100)
    private String description;

    public int getIdProjet() {
        return idProjet;
    }

    public void setIdProjet(int idProjet) {
        this.idProjet = idProjet;
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
