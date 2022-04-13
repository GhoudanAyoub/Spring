package spring.cours.mvc.services;

import java.util.List;

import spring.cours.mvc.model.Projet;

public interface ProjetService {
	public void ajouter(Projet projet);

	public List<Projet> lesProjets();

	public void supprimer(long idProjet);

	public void modifier(Projet projet);

	public Projet getProjet(long idProjet);

}
