package spring.cours.springjpa2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import spring.cours.springjpa2.model.projectRes;

@Repository
public interface ProjectRes extends JpaRepository<projectRes,Integer> {
}
