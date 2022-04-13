package spring.cours.mvc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import spring.cours.mvc.model.Tache;

@Repository
public interface TacheRepository extends JpaRepository<Tache, Integer> {

}
