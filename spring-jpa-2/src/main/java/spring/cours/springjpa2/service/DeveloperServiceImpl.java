package spring.cours.springjpa2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import spring.cours.springjpa2.model.Developpeur;
import spring.cours.springjpa2.model.taches;
import spring.cours.springjpa2.repository.DeveloppeurRepository;
import spring.cours.springjpa2.repository.TacheRepository;

import java.util.List;
import java.util.Optional;

@Service
public class DeveloperServiceImpl implements DevService{
    @Autowired
    DeveloppeurRepository developpeurRepository;
    @Autowired
    TacheRepository tacheRepository;

    @Override
    public void addDeveloper(Developpeur developpeur) {
        developpeurRepository.save(developpeur);
    }

    @Override
    public void updateDeveloper(Developpeur developpeur) {
        Developpeur d = developpeurRepository.getById(developpeur.getDeveloppeurID());
        developpeurRepository.save(d);
    }

    @Override
    public void deleteDeveloper(int idDev) {
        developpeurRepository.deleteById(idDev);
    }

    @Override
    public void addTacheToDeveloper(int idDev, int idTache) {
        Developpeur developpeur = developpeurRepository.getById(idDev);
        taches taches = tacheRepository.getById(idTache);
        developpeur.getTachesList().add(taches);
        developpeurRepository.save(developpeur);
    }

    @Override
    public List<Developpeur> getDeveloperByProject(int idProject) {
        return developpeurRepository.getDeveloperByProject(idProject);
    }

    @Override
    public Developpeur getDeveloperById(int idDev) {
        return developpeurRepository.findById(idDev).get();
    }

    @Override
    public Developpeur getDeveloperByEmail(String email) {
        return developpeurRepository.getDeveloperByEmail(email);
    }
}
