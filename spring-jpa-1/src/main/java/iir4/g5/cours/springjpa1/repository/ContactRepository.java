package iir4.g5.cours.springjpa1.repository;

import iir4.g5.cours.springjpa1.model.Contact;
import iir4.g5.cours.springjpa1.model.utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ContactRepository extends JpaRepository<Contact,Integer> {
    @Query("SELECT c FROM Contact c WHERE c.telephone like  %:telephone%")
    List<Contact> findByTelephone(@Param("telephone") String telephone);
    @Query("SELECT c FROM Contact c WHERE c.nom like  %:nom%")
    List<Contact> findByName(@Param("nom") String telephonnome);
}

