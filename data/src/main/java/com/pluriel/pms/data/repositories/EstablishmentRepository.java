package com.pluriel.pms.data.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pluriel.pms.data.entities.Establishment;

@Repository
public interface EstablishmentRepository extends JpaRepository<Establishment, Integer> {

}
