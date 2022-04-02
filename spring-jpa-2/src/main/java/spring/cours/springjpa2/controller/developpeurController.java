package spring.cours.springjpa2.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import spring.cours.springjpa2.model.Developpeur;
import spring.cours.springjpa2.service.DeveloperServiceImpl;


@RestController
@RequestMapping("/devs")
public class developpeurController {

    @Autowired
    DeveloperServiceImpl developerService;

    @GetMapping("/{id}")
    public Developpeur get(@PathVariable int id){
        return developerService.getDeveloperById(id);
    }

    @PostMapping
    public void ajouter(@RequestBody Developpeur u){
        developerService.addDeveloper(u);
    }

    @DeleteMapping("/{id}")
    public void suppr(@PathVariable int id){
        developerService.deleteDeveloper(id);
    }

    @PutMapping
    public void modif(@RequestBody Developpeur dev) {
        Developpeur u = developerService.getDeveloperById(dev.getDeveloppeurID());
        u.setNom(dev.getNom());
        u.setDescription(dev.getDescription());
        u.setEmail(dev.getEmail());
    }

}