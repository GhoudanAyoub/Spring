package eval2.ghouda.vehicule.repository;

import eval2.ghouda.vehicule.model.Marque;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface MarqueRepository extends JpaRepository<Marque, Integer>{

}
