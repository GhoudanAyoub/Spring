package spring.cours.mvc.services;

import java.util.List;

import spring.cours.mvc.model.Developpeur;

public interface DevService {

	List<Developpeur> getDevs();

	void ajouter(Developpeur dev);


	void supprimer(int idDev);

	void modifier(Developpeur dev);

	Developpeur getDeveloppeur(int idDev);
	
	
}
