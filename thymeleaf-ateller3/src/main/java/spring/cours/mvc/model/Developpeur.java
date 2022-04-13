package spring.cours.mvc.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Developpeur {
	
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idDev;
	private String nom;
	@ManyToMany
	@JoinTable(name="taches_dev",
	joinColumns = @JoinColumn(name="dev_id"),
	inverseJoinColumns = @JoinColumn(name="tache_id")
)
	List<Tache> taches;
	
	public int getIdDev() {
		return idDev;
	}
	public void setIdDev(int idDev) {
		this.idDev = idDev;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public List<Tache> getTaches() {
		return taches;
	}
	public void setTaches(List<Tache> taches) {
		this.taches = taches;
	}

	
	
	

}
