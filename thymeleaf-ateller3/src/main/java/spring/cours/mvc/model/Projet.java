package spring.cours.mvc.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
@Inheritance
public class Projet {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private long idProjet;
	private String description;
	
	@OneToMany
	@JoinColumn(name="projet_id_projet")
	private List<Tache> taches;

	public long getIdProjet() {
		return idProjet;
	}

	public void setIdProjet(long idProjet) {
		this.idProjet = idProjet;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
