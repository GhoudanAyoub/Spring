package spring.cours.springjpa2.model;


import javax.persistence.*;

@Entity
@Table(name = "taches")
public class taches {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int idtache;
    private int developpeurID;
    @Column(length = 10)
    private String nom;
    @Column(length = 100)
    private String description;

    @ManyToOne(targetEntity=project.class)
    private project project;

    public project getProject() {
        return project;
    }

    public int getDeveloppeurID() {
        return developpeurID;
    }

    public void setDeveloppeurID(int developpeurID) {
        this.developpeurID = developpeurID;
    }

    public void setProject(project project) {
        this.project = project;
    }

    public int getIdtache() {
        return idtache;
    }

    public void setIdtache(int idtache) {
        this.idtache = idtache;
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
