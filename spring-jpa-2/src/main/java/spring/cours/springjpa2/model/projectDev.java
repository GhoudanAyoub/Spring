package spring.cours.springjpa2.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "projectDev")
public class projectDev extends project {

    private String langage;

    public String getLangage() {
        return langage;
    }

    public void setLangage(String langage) {
        this.langage = langage;
    }
}
