package spring.cours.springjpa2.service;

import org.springframework.beans.factory.annotation.Autowired;
import spring.cours.springjpa2.model.Developpeur;
import spring.cours.springjpa2.model.project;
import spring.cours.springjpa2.model.projectDev;
import spring.cours.springjpa2.model.taches;
import spring.cours.springjpa2.repository.ProjetRepository;
import spring.cours.springjpa2.repository.TacheRepository;

import java.util.List;

public class ProjectSeviceImpl implements ProjectService{

    @Autowired
    ProjetRepository projetRepository;
    @Autowired
    TacheRepository tacheRepository;

    @Override
    public void addProject(project project) {
        projetRepository.save(project);
    }

    @Override
    public void updateProject(project project) {
        project d = projetRepository.getById(project.getIdProject());
        projetRepository.save(d);
    }

    @Override
    public void deleteProject(int idProject) {
        projetRepository.deleteById(idProject);
    }

    @Override
    public void addTacheToProject(int idProject, taches idTache) {

    }

    @Override
    public List<project> getProjectList() {
        return null;
    }

    @Override
    public List<projectDev> getProjectDevList() {
        return null;
    }

    @Override
    public List<taches> getTacheList(int idProject) {
        return projetRepository;
    }

    @Override
    public projectDev getProjectDev(int idProject) {
        return null;
    }
}
