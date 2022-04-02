package spring.cours.springjpa2.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "project")
public class project {
    @Id
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
