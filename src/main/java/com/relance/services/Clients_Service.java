package com.relance.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.relance.DAO.I_clients;

import com.relance.Entity.Clients;

@Service
public class Clients_Service implements I_ServiceClients{
	@Autowired
	private I_clients dao_c;

	public void addclient(Clients c) {
		dao_c.addclient(c);
	}
	public List<Clients> selectionAll(){
		return dao_c.selectAll();
	}
	public Clients selectClient(int id) {
		return dao_c.selectClient(id);
	}

	public void DeleteClient(int id) {
		dao_c.DeleteClient(id);
	}

}
