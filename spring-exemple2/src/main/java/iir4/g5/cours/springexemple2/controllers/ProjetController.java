package iir4.g5.cours.springexemple2.controllers;

import iir4.g5.cours.springexemple2.models.Projet;
import iir4.g5.cours.springexemple2.services.ProjetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProjetController {
    @Autowired
    ProjetService projetService;


    @GetMapping("/projets")
    public List<Projet> get() {
        return projetService.get();
    }

    @GetMapping("/projets/{id}")
    public Projet get(@PathVariable int id) {
        return projetService.get(id);
    }

    @PostMapping("/projets")
    public void ajouter(@RequestBody Projet projet) {
        projetService.ajouter(projet);
    }

    @PutMapping("/projets")
    public void modifier(@RequestBody Projet projet) {
        projetService.modifier(projet);
    }


    @DeleteMapping("/projets/{id}")
    public void supprimer(@PathVariable int id) {
        projetService.supprimer(id);
    }


}
