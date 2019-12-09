package com.relance.services;

import java.util.List;

import com.relance.Entity.type_de_relance;

public interface I_ServicesTypeRelance {
	public void addUptypeR(type_de_relance t);
	public List<type_de_relance> selcetionAllTypeRelance();
	public type_de_relance selectTypeRelanceId(int id );
	public void deletTypeRelance(int id);
	
	
}
