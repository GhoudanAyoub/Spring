package spring.cours.springjpa2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import spring.cours.springjpa2.model.developpeur;
import spring.cours.springjpa2.model.taches;
import spring.cours.springjpa2.repository.DevRepository;
import spring.cours.springjpa2.repository.TacheRepository;

import java.util.List;

@Service
public class DevServiceImpl implements DevService{
    @Autowired
    DevRepository devRepository;
    @Autowired
    TacheRepository tacheRepository;

    @Override
    public void addDeveloper(developpeur developpeur) {
        devRepository.save(developpeur);
    }

    @Override
    public void updateDeveloper(developpeur developpeur) {
        spring.cours.springjpa2.model.developpeur d = devRepository.getById(developpeur.getDeveloppeurID());
        devRepository.save(d);
    }

    @Override
    public void deleteDeveloper(int idDev) {
        devRepository.deleteById(idDev);
    }

    @Override
    public void addTacheToDeveloper(int idDev, int idTache) {
        developpeur developpeur = devRepository.getById(idDev);
        taches taches = tacheRepository.getById(idTache);
        developpeur.getTachesList().add(taches);
        devRepository.save(developpeur);
    }

    @Override
    public List<developpeur> getDeveloperByProject(int idProject) {
        return devRepository.getDeveloperByProject(idProject);
    }

    @Override
    public List<developpeur> getDevelopers() {
        return devRepository.findAll();
    }

    @Override
    public developpeur getDeveloperById(int idDev) {
        return devRepository.findById(idDev).get();
    }

    @Override
    public developpeur getDeveloperByEmail(String email) {
        return devRepository.getDeveloperByEmail(email);
    }
}
