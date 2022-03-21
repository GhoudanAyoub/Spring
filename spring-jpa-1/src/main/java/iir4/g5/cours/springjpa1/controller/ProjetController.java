package iir4.g5.cours.springjpa1.controller;


import iir4.g5.cours.springjpa1.model.projet;
import iir4.g5.cours.springjpa1.model.utilisateur;
import iir4.g5.cours.springjpa1.repository.ProjetRepository;
import iir4.g5.cours.springjpa1.repository.UtilisateurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Projets")
public class ProjetController {

    @Autowired
    ProjetRepository projetRepository;

    @GetMapping
    public List<projet> get(){
        return projetRepository.findAll();
    }

    @GetMapping("/{id}")
    public projet get(@PathVariable int id){
        return projetRepository.findById(id).get();
    }

    @PostMapping
    public void ajouter(@RequestBody projet u){
        projetRepository.save(u);
    }

    @DeleteMapping("/{id}")
    public void suppr(@PathVariable int id){
        projetRepository.deleteById(id);
    }

    @PutMapping
    public void modif(@RequestBody projet projet) {
        projet u = projetRepository.findById(projet.getIdProjet()).get();
        u.setNom(projet.getNom());
        u.setDescription(projet.getDescription());
    }

}
