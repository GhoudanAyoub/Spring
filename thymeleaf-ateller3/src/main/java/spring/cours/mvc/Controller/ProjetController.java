package spring.cours.mvc.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import spring.cours.mvc.model.Projet;
import spring.cours.mvc.services.ProjetService;

@Controller
@RequestMapping("/projets")
class Projetcontroller {
    @Autowired
    private ProjetService projetservice;

    @GetMapping
    public String liste(Model m) {
        m.addAttribute("projets", projetservice.lesProjets());
        return "projets/liste";
    }

    @GetMapping("/add")
    public String ajout(Model model) {
        Projet p = new Projet();
        model.addAttribute("projet", p);
        return "projeta/ajout";
    }


    @PostMapping("/add")
    public String enregistrer(@ModelAttribute("projet") Projet projet) {
        Projet p = projetservice.getProjet(projet.getIdProjet());
        if (p != null)
            projetservice.modifier(projet);
        else
            projetservice.ajouter(projet);
        return "redirect:/projets";
    }

    @GetMapping("/edit/(id)")
    public String modifier(@PathVariable long id, Model mode1) {

        Projet p = projetservice.getProjet(id);
        if (p != null) {
            mode1.addAttribute("projet", p);
            return "projets/ajout";
        }
        return "redirect:/projets";
    }

    @GetMapping("/delete/(id)")
    public String suppr(@PathVariable int id) {
        projetservice.supprimer(id);
        return "redirect:/projets";
    }
}