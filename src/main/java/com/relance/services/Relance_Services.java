package com.relance.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.relance.DAO.I_relance;
import com.relance.Entity.Relance;

@Service
public class Relance_Services implements I_ServicesRelance{
@Autowired
private I_relance dao_r;
public void addUprelance (Relance r) {
	dao_r.save(r);
}
public List<Relance> selcetionAllRelance(){
	return dao_r.findAll();
}
public Relance selectRelanceId(int id ) {
	return dao_r.getOne(id);
}
public void deletRelance(int id) {
	dao_r.deleteById(id);
}
}
