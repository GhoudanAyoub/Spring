package spring.cours.springjpa2.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "projectRes")
public class projectRes extends project {

    private String budget;

    public String getbudget() {
        return budget;
    }

    public void setbudget(String budget) {
        this.budget = budget;
    }
}
