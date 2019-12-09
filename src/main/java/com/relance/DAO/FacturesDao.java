package com.relance.DAO;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.relance.Entity.Clients;
import com.relance.Entity.Factures;



@Transactional
@Repository
public class FacturesDao implements I_factures{
	@PersistenceContext
	EntityManager EM;
	public void addFacture(Factures f) {
		EM.merge(f);
	}
	public List<Factures> selectAllF(){
		String jhql="FROM Factures";
		Query query = EM.createQuery(jhql);
		List<Factures> rslt = query.getResultList();
		return rslt;
	}
	public List<Factures> selectAllFacture(int id){
		Clients c = (Clients) EM.find(Clients.class, id);
		List<Factures> rslt = c.getFacture();
		return rslt;
	}
//	public List<Factures> selectAllFacture(Clients client){
//		String jhql="FROM Factures  WHERE Clients= :c";
//		Query query = EM.createQuery(jhql);
//		query.setParameter("c", client);
//		List<Factures> rslt = query.getResultList();
//		return rslt;
//	}
	public Factures selectFacture(int id) {
		Factures t = (Factures) EM.find(Factures.class, id);
		return t;
	}
	public void DeleteFacture(int id) {
		Factures t =(Factures) EM.find(Factures.class, id);
		EM.remove(t);
	}
}
