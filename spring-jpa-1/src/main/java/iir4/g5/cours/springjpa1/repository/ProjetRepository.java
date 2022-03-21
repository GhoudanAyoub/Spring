package iir4.g5.cours.springjpa1.repository;

import iir4.g5.cours.springjpa1.model.projet;
import iir4.g5.cours.springjpa1.model.utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjetRepository extends JpaRepository<projet,Integer> {
}
