package spring.cours.springjpa2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import spring.cours.springjpa2.model.project;

@Repository
public interface ProjetRepository extends JpaRepository<project,Integer> {
}
