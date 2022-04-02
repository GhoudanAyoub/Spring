package iir4.g5.cours.springjpa1.repository;

import iir4.g5.cours.springjpa1.model.Position;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PositionRepository extends JpaRepository<Position,Integer> {
}
