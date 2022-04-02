package spring.cours.springjpa2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import spring.cours.springjpa2.model.project;
import spring.cours.springjpa2.repository.ProjetRepository;

import java.util.List;

@RestController
@RequestMapping("/Projets")
public class ProjetController {

    @Autowired
    ProjetRepository projetRepository;

    @GetMapping
    public List<project> get(){
        return projetRepository.findAll();
    }

    @GetMapping("/{id}")
    public project get(@PathVariable int id){
        return projetRepository.findById(id).get();
    }

    @PostMapping
    public void ajouter(@RequestBody project u){
        projetRepository.save(u);
    }

    @DeleteMapping("/{id}")
    public void suppr(@PathVariable int id){
        projetRepository.deleteById(id);
    }

    @PutMapping
    public void modif(@RequestBody project project) {
        project u = projetRepository.findById(project.getIdProject()).get();
        u.setDescription(project.getDescription());
    }

}
