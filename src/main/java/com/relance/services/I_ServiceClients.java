package com.relance.services;

import java.util.List;

import com.relance.Entity.Clients;

public interface I_ServiceClients {
public void addclient(Clients c);
public List<Clients> selectionAll();
public Clients selectClient(int id);
public void DeleteClient(int id);

}
