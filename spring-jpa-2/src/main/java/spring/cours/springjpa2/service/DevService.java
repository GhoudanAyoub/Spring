package spring.cours.springjpa2.service;

import spring.cours.springjpa2.model.Developpeur;

import java.util.List;

public interface DevService {
    void addDeveloper(Developpeur developpeur);
    void updateDeveloper(Developpeur developpeur);
    void deleteDeveloper(int idDev);
    void addTacheToDeveloper(int idDev,int idTache);
    List<Developpeur> getDeveloperByProject(int idProject);
    Developpeur getDeveloperById(int idDev);
    Developpeur getDeveloperByEmail(String email);
}
