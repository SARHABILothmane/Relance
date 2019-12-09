package com.relance.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.relance.Entity.Relance;

@Repository
public interface I_relance extends JpaRepository<Relance, Integer>{

}
