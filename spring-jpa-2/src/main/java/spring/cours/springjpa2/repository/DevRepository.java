package spring.cours.springjpa2.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import spring.cours.springjpa2.model.developpeur;

import java.util.List;


@Repository
public interface DevRepository extends JpaRepository<developpeur, Integer> {

    @Query("select d from developpeur d where d.email=:email")
    developpeur getDeveloperByEmail(@Param("email")String email);

    @Query("select d from developpeur d join  d.tachesList t where t.project.idProject=:idProject")
    List<developpeur> getDeveloperByProject(@Param("idProject") int idProject);
}
