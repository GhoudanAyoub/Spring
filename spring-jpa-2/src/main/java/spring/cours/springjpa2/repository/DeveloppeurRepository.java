package spring.cours.springjpa2.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import spring.cours.springjpa2.model.Developpeur;

import java.util.List;


@Repository
public interface DeveloppeurRepository extends JpaRepository<Developpeur, Integer> {

    @Query("select d from developpeur d where d.email=:email")
    Developpeur getDeveloperByEmail(@Param("email")String email);

    @Query("select d from developpeur d join  d.taches t where t.project.idProject=:idProject")
    List<Developpeur> getDeveloperByProject(@Param("idProject") int idProject);
}
