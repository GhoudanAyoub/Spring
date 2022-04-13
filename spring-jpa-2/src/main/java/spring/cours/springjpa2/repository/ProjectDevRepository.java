package spring.cours.springjpa2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import spring.cours.springjpa2.model.projectDev;

import java.util.List;

@Repository
public interface ProjectDevRepository extends JpaRepository<projectDev, Integer> {

    @Query("select p from projectDev p  where p.idProject=:idProject")
    projectDev getProjectDev(@Param("idProject") int idProject);

    @Query("select p from projectDev p ")
    List<projectDev> getProjectDevList();

}
