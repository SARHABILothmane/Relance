package com.relance.DAO;

import java.util.List;

import com.relance.Entity.Clients;

public interface I_clients {
	public void addclient(Clients c);
	public List<Clients> selectAll();
	public Clients selectClient(int id);
	public void DeleteClient(int id);
}
