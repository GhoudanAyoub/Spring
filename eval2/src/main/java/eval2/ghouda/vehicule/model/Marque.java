package eval2.ghouda.vehicule.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Marque {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idMarque;
	private String libelle;
	public int getIdMarque() {
		return idMarque;
	}
	public void setIdMarque(int idMarque) {
		this.idMarque = idMarque;
	}
	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	
}
