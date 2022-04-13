package spring.cours.springjpa2.model;

import javax.persistence.*;

@Entity
@Table(name = "project")
public class project {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int idProject;
    @Column(length = 100)
    private String description;

    public int getIdProject() {
        return idProject;
    }

    public void setIdProject(int idProjet) {
        this.idProject = idProjet;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


}
