package com.relance.services;

import java.util.List;

import com.relance.Entity.Clients;
import com.relance.Entity.Factures;

public interface I_ServicesFactures {
public void addFacture(Factures f);
public List<Factures> selectAllF();
public List<Factures> selectAllFacture(int id);
public Factures selectFacture(int id);
public void DeleteFacture(int id);
}
