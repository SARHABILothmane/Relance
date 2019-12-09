package com.relance.DAO;

import java.util.List;

import com.relance.Entity.Clients;
import com.relance.Entity.Factures;

public interface I_factures {
	public void addFacture(Factures f);
	public List<Factures> selectAllF();
//	public List<Factures> selectAllFacture(Clients client);
	public List<Factures> selectAllFacture(int id);
	public Factures selectFacture(int id);
	public void DeleteFacture(int id);
}
