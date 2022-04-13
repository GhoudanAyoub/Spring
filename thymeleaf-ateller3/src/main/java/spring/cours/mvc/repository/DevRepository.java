package spring.cours.mvc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import spring.cours.mvc.model.Developpeur;

@Repository
public interface DevRepository extends JpaRepository<Developpeur, Integer> {

}
