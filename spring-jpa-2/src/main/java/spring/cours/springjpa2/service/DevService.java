package spring.cours.springjpa2.service;

import spring.cours.springjpa2.model.developpeur;

import java.util.List;

public interface DevService {
    void addDeveloper(developpeur developpeur);
    void updateDeveloper(developpeur developpeur);
    void deleteDeveloper(int idDev);
    void addTacheToDeveloper(int idDev,int idTache);
    List<developpeur> getDeveloperByProject(int idProject);
    List<developpeur> getDevelopers();
    developpeur getDeveloperById(int idDev);
    developpeur getDeveloperByEmail(String email);
}
