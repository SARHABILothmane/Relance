package com.relance.services;

import java.util.List;

import com.relance.Entity.Relance;

public interface I_ServicesRelance {
	public void addUprelance (Relance r);
	
public List<Relance> selcetionAllRelance();
public Relance selectRelanceId(int id );
public void deletRelance(int id);
}