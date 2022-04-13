package iir4.g5.cours.springjpa1.repository;

import iir4.g5.cours.springjpa1.model.Position;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;

@Repository
public interface PositionRepository extends JpaRepository<Position,Integer> {
    @Query("select p from Position p where p.imei=:imei")
    Position getPositionByImei(@Param("imei") String imei);
}
