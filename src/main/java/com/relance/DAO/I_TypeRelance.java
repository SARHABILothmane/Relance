package com.relance.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.relance.Entity.type_de_relance;

@Repository
public interface I_TypeRelance extends JpaRepository<type_de_relance, Integer>{

}
