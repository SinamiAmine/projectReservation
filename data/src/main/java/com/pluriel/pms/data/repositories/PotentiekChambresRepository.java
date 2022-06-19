package com.pluriel.pms.data.repositories;

import com.pluriel.pms.data.entities.PotentielChambres;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PotentiekChambresRepository extends JpaRepository<PotentielChambres,Long> {
}
