package spring.cours.springjpa2.service;

import spring.cours.springjpa2.model.project;
import spring.cours.springjpa2.model.projectDev;
import spring.cours.springjpa2.model.taches;

import java.util.List;

public interface ProjectService {
    void addProject(project project);
    void updateProject(project project);
    void deleteProject(int idProject);
    void addTacheToProject(int idProject, taches idTache);
    List<project> getProjectList();
    List<projectDev> getProjectDevList();
    List<taches> getTacheList(int idProject);
    projectDev getProjectDev(int idProject);
}
