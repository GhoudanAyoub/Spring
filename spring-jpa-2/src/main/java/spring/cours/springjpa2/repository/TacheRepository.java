package spring.cours.springjpa2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import spring.cours.springjpa2.model.taches;

import java.util.List;

@Repository
public interface TacheRepository extends JpaRepository<taches, Integer> {
    @Query("select t from taches t where t.project.idProject=:idProject")
    List<taches> getTacheList(int idProject);
}
