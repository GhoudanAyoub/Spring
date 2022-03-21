package iir4.g5.cours.springjpa1.controller;

import iir4.g5.cours.springjpa1.model.utilisateur;
import iir4.g5.cours.springjpa1.repository.UtilisateurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UtilisateurController {

    @Autowired
    UtilisateurRepository utilisateurRepository;

    @GetMapping
    public List<utilisateur> get(){
        return utilisateurRepository.findAll();
    }

    @GetMapping("/{id}")
    public utilisateur get(@PathVariable int id){
        return utilisateurRepository.findById(id).get();
    }

    @PostMapping
    public void ajouter(@RequestBody utilisateur u){
        utilisateurRepository.save(u);
    }

    @DeleteMapping("/{id}")
    public void suppr(@PathVariable int id){
        utilisateurRepository.deleteById(id);
    }

    @PutMapping
    public void modif(@RequestBody utilisateur nUser) {
        utilisateur u = utilisateurRepository.findById(nUser.getId()).get();
        u.setNom(nUser.getNom());
        u.setEmail(nUser.getEmail());
    }

}
