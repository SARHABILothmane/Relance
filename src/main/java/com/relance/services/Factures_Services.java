package com.relance.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.relance.DAO.I_factures;
import com.relance.Entity.Clients;
import com.relance.Entity.Factures;
@Service
public class Factures_Services implements I_ServicesFactures{
	@Autowired
	private I_factures dao_f;
	//method facture
	public void addFacture(Factures f) {
		dao_f.addFacture(f);
	}
	public List<Factures> selectAllF(){
		return dao_f.selectAllF();
	}
	public List<Factures> selectAllFacture(int id){
		return dao_f.selectAllFacture(id);
	}
	public Factures selectFacture(int id) {
		return dao_f.selectFacture(id);
	}
	public void DeleteFacture(int id) {
	dao_f.DeleteFacture(id);
	}
}
