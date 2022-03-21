package iir4.g5.cours.springexemple2.services;

import iir4.g5.cours.springexemple2.models.Projet;
import iir4.g5.cours.springexemple2.repository.ProjetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjetServiceImpl implements ProjetService{

    @Autowired
    ProjetRepository projetRepository;

    @Override
    public void ajouter(Projet projet) {
        projetRepository.ajouter(projet);
    }

    @Override
    public void modifier(Projet projet) {
        projetRepository.modifier(projet);
    }

    @Override
    public void supprimer(int idProjet) {
        projetRepository.supprimer(idProjet);
    }

    @Override
    public Projet get(int idProjet) {
        return projetRepository.get(idProjet);
    }

    @Override
    public List<Projet> get() {
        return projetRepository.get();
    }
}
