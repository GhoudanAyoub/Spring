package spring.cours.springjpa2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import spring.cours.springjpa2.model.project;
import spring.cours.springjpa2.model.projectDev;
import spring.cours.springjpa2.model.projectRes;
import spring.cours.springjpa2.model.taches;
import spring.cours.springjpa2.repository.ProjectDevRepository;
import spring.cours.springjpa2.repository.ProjectResRepository;
import spring.cours.springjpa2.repository.ProjetRepository;
import spring.cours.springjpa2.repository.TacheRepository;

import java.util.List;

@Service
public class ProjectSeviceImpl implements ProjectService{

    @Autowired
    ProjetRepository projetRepository;
    @Autowired
    TacheRepository tacheRepository;
    @Autowired
    ProjectDevRepository projectDevRepository;
    @Autowired
    ProjectResRepository projectResRepository;

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
    public void addTacheToProject(int idProject, taches tache) {
        projectDev p = getProjectDev(idProject);
        tache.setProject(p);
        tacheRepository.save(tache);
    }

    @Override
    public List<project> getProjectList() {
        return projetRepository.findAll();
    }

    @Override
    public List<projectDev> getProjectDevList() {
        return projectDevRepository.getProjectDevList();
    }

    @Override
    public List<projectRes> getProjectResList() {
        return projectResRepository.getProjectResList();
    }

    @Override
    public List<taches> getTacheList(int idProject) {
        return tacheRepository.getTacheList(idProject);
    }

    @Override
    public project getProject(int idProject) {
        project p = projetRepository.findById(idProject).get();
        projectDev projectDev = projectDevRepository.findById(idProject).get();
        projectRes projectRes = projectResRepository.findById(idProject).get();
        if (p!=null)
            return p;
        else if (projectDev!=null)
            return projectDev;
        else if(projectRes!=null)
            return projectRes;
        return null;
    }

    @Override
    public projectDev getProjectDev(int idProject) {
        return projectDevRepository.getProjectDev(idProject);
    }

    @Override
    public projectRes getProjectRes(int idProject) {
        return projectResRepository.getProjectRes(idProject);
    }
}
