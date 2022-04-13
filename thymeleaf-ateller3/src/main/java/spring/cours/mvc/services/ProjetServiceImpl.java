package spring.cours.mvc.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import spring.cours.mvc.model.Projet;
import spring.cours.mvc.repository.ProjetRepository;

@Service
public class ProjetServiceImpl implements ProjetService {
	@Autowired
	ProjetRepository projetRepository;

	@Override
	public List<Projet> lesProjets() {
		return projetRepository.findAll();

	}

	@Override
	public void supprimer(long idProjet) {
		projetRepository.deleteById(idProjet);

	}

	@Override
	public void ajouter(Projet projet) {
		projetRepository.save(projet);

	}

	@Override
	public void modifier(Projet projet) {
		Projet p = getProjet(projet.getIdProjet());
		if (p != null) {
			p.setDescription(projet.getDescription());
			projetRepository.save(p);
		}
	}

	@Override
	public Projet getProjet(long idProjet) {
		if (projetRepository.existsById(idProjet))
			return projetRepository.findById(idProjet).get();
		else
			return null;

	}

}
