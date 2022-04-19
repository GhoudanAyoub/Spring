package eval2.ghouda.vehicule.repository;

import eval2.ghouda.vehicule.model.Voyage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface VoyageRepository extends JpaRepository<Voyage, Integer> {

}
