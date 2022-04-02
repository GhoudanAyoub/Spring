package spring.cours.springjpa2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import spring.cours.springjpa2.model.taches;

@Repository
public interface TacheRepository extends JpaRepository<taches, Integer> {
}
