package iir4.g5.cours.springexemple2.services;

import iir4.g5.cours.springexemple2.models.Projet;

import java.util.List;

public interface ProjetService {
    void ajouter(Projet projet);
    void modifier(Projet projet);
    void supprimer(int idProjet);
    Projet get(int idProjet);
    List<Projet> get();
}
