package eval2.ghouda.vehicule.repository;

import eval2.ghouda.vehicule.model.Chauffeur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ChauffeurRepository extends JpaRepository<Chauffeur, Integer>{

}
