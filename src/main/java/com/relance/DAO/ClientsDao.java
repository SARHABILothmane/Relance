package com.relance.DAO;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.relance.Entity.Clients;

@Transactional
@Repository
public class ClientsDao implements I_clients{
@PersistenceContext
EntityManager EM;
public void addclient(Clients c) {
	EM.merge(c);
}
public List<Clients> selectAll(){
	String jhql="FROM Clients";
	Query query = EM.createQuery(jhql);
	List<Clients> rslt = query.getResultList();
	return rslt;
}
public Clients selectClient(int id) {
	Clients c = (Clients) EM.find(Clients.class, id);
	return c;
}
public void DeleteClient(int id) {
	Clients c =(Clients) EM.find(Clients.class, id);
	EM.remove(c);
}
}
