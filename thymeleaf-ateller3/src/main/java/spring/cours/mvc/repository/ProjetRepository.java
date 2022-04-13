package spring.cours.mvc.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import spring.cours.mvc.model.Projet;


public interface ProjetRepository extends JpaRepository<Projet, Long> {

}
