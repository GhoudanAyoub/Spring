package spring.cours.springjpa2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import spring.cours.springjpa2.model.projectDev;
import spring.cours.springjpa2.model.projectRes;

import java.util.List;

@Repository
public interface ProjectResRepository extends JpaRepository<projectRes,Integer> {

    @Query("select p from projectRes p  where p.idProject=:idProject")
    projectRes getProjectRes(@Param("idProject") int idProject);

    @Query("select p from projectRes p ")
    List<projectRes> getProjectResList();
}
