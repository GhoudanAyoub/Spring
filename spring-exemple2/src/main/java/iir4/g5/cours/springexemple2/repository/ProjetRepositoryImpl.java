package iir4.g5.cours.springexemple2.repository;

import iir4.g5.cours.springexemple2.models.Projet;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ProjetRepositoryImpl implements ProjetRepository{
   static private List<Projet> projets = new ArrayList<>();

    @Override
    public void ajouter(Projet projet) {
        projets.add(projet);
    }

    @Override
    public void modifier(Projet projet) {
        int id = projet.getId();
        for (Projet p :projets)
            if(p.getId()==id){
                p.setDescription(projet.getDescription());
                break;
            }
    }

    @Override
    public void supprimer(int idProjet) {
        for (Projet p :projets)
            if(p.getId()==idProjet){
                projets.remove(p);
                break;
            }
    }

    @Override
    public Projet get(int idProjet) {
        for (Projet p :projets)
            if(p.getId()==idProjet)
               return p;
        return null;
    }

    @Override
    public List<Projet> get() {
        return projets;
    }
}
