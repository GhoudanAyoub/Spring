package com.example.demo.repository;

import java.util.Collection;
import java.util.Map;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.model.Machine;

public interface MachineRepository extends JpaRepository<Machine, Integer> {

	Machine findById(int id);

    @Query("select m2.libelle as name, count(*) as nbr from Machine m,Marque m2 where m2.id=m.marque.id group by m2.libelle")
    Collection<Map<String,String>> findByMachinesMarque();
	
    @Query("select year(m.dateAchat) as annee, count(*) as nbr from Machine m group by year(m.dateAchat) order by year(m.dateAchat)")
    Collection<?> findByMachinesYear();

    @Query("select year(m.dateAchat) as name, count(*) as nbr from Machine m group by year(m.dateAchat) order by year(m.dateAchat)")
    Collection<Map<String,String>> findByMachinesYearApi();

}
