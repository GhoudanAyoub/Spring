package spring.cours.springjpa2.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import spring.cours.springjpa2.model.developpeur;
import spring.cours.springjpa2.service.DevServiceImpl;

import java.util.List;


@RestController
@RequestMapping("/devs")
public class DevController {

    @Autowired
    DevServiceImpl developerService;

    @GetMapping("/{id}")
    public developpeur get(@PathVariable int id){
        return developerService.getDeveloperById(id);
    }

    @GetMapping
    public List<developpeur> get(){
        return developerService.getDevelopers();
    }

    @PostMapping
    public void ajouter(@RequestBody developpeur u){
        developerService.addDeveloper(u);
    }

    @DeleteMapping("/{id}")
    public void suppr(@PathVariable int id){
        developerService.deleteDeveloper(id);
    }

    @PutMapping
    public void modif(@RequestBody developpeur dev) {
        developpeur u = developerService.getDeveloperById(dev.getDeveloppeurID());
        u.setNom(dev.getNom());
        u.setDescription(dev.getDescription());
        u.setEmail(dev.getEmail());
    }

    @GetMapping("/projet/{id}")
    public List<developpeur> getDevs(@PathVariable int id){
        return developerService.getDeveloperByProject(id);
    }

    @PostMapping("/{idDev}/{idTache}")
    public void ajouter(@PathVariable int idDev ,@PathVariable int idTache){
        developerService.addTacheToDeveloper(idDev, idTache);
    }

}