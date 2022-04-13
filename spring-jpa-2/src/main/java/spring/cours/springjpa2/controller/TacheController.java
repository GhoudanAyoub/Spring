package spring.cours.springjpa2.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import spring.cours.springjpa2.model.taches;
import spring.cours.springjpa2.repository.TacheRepository;

import java.util.List;

@RestController
@RequestMapping("/Taches")
public class TacheController {

    @Autowired
    TacheRepository tachesRepository;

    @GetMapping
    public List<taches> get(){
        return tachesRepository.findAll();
    }

    @GetMapping("/{id}")
    public taches get(@PathVariable int id){
        return tachesRepository.findById(id).get();
    }

    @PostMapping
    public void ajouter(@RequestBody taches u){
        tachesRepository.save(u);
    }

    @DeleteMapping("/{id}")
    public void suppr(@PathVariable int id){
        tachesRepository.deleteById(id);
    }

    @PutMapping
    public void modif(@RequestBody taches taches) {
        taches u = tachesRepository.findById(taches.getIdtache()).get();
        u.setNom(taches.getNom());
        u.setDescription(taches.getDescription());
    }

}