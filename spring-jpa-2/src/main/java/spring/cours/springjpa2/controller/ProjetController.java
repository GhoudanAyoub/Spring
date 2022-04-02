package spring.cours.springjpa2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import spring.cours.springjpa2.model.project;
import spring.cours.springjpa2.model.projectDev;
import spring.cours.springjpa2.model.projectRes;
import spring.cours.springjpa2.model.taches;
import spring.cours.springjpa2.service.ProjectSeviceImpl;

import java.util.List;

@RestController
@RequestMapping("/Projets")
public class ProjetController {

    @Autowired
    ProjectSeviceImpl projectSeviceImpl;

    @GetMapping
    public List<project> get() {
        return projectSeviceImpl.getProjectList();
    }

    @GetMapping("/{id}")
    public project get(@PathVariable int id) {
        return projectSeviceImpl.getProject(id);
    }

    @PostMapping
    public void ajouter(@RequestBody project u){
        projectSeviceImpl.addProject(u);
    }
    
    @PostMapping("/dev")
    public void ajouter(@RequestBody projectDev u) {
        projectSeviceImpl.addProject(u);
    }
    
    @PostMapping("/res")
    public void ajouter(@RequestBody projectRes u) {
        projectSeviceImpl.addProject(u);
    }

    @DeleteMapping("/{id}")
    public void suppr(@PathVariable int id) {
        projectSeviceImpl.deleteProject(id);
    }

    @PutMapping
    public void modif(@RequestBody project project) {
        project u = projectSeviceImpl.getProject(project.getIdProject());
        u.setDescription(project.getDescription());
    }

    @GetMapping("/{idProject}/tache")
    public List<taches> getTacheList(@PathVariable int idProject) {
        return projectSeviceImpl.getTacheList(idProject);
    }

    @PostMapping("/{idProject}/tache")
    public void getTacheList(@PathVariable int idProject,@RequestBody taches taches) {
        projectSeviceImpl.addTacheToProject(idProject,taches);
    }

}
