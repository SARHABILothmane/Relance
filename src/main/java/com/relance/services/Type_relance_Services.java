package com.relance.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.relance.DAO.I_TypeRelance;
import com.relance.Entity.type_de_relance;

@Service
public class Type_relance_Services implements I_ServicesTypeRelance{
@Autowired
private I_TypeRelance dao_tr;
public void addUptypeR(type_de_relance t) {
dao_tr.save(t);
}
public List<type_de_relance> selcetionAllTypeRelance(){
return dao_tr.findAll();
}
public type_de_relance selectTypeRelanceId(int id ) {
return dao_tr.getOne(id);
}
public void deletTypeRelance(int id) {
dao_tr.deleteById(id);
}
}
