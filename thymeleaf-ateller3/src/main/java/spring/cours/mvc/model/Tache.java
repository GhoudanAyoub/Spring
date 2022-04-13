package spring.cours.mvc.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Tache {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idTache;
	private double duree;

	@ManyToOne
	private Projet projet;

	public int getIdTache() {
		return idTache;
	}

	public void setIdTache(int idTache) {
		this.idTache = idTache;
	}

	public double getDuree() {
		return duree;
	}

	public void setDuree(double duree) {
		this.duree = duree;
	}

	public Projet getProjet() {
		return projet;
	}

	public void setProjet(Projet projet) {
		this.projet = projet;
	}
}
