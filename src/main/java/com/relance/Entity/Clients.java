package com.relance.Entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name = "Clients")
public class Clients {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id ;
  
  private String raison_sociale;
  private String adresse;
  private String num_tele;
  private String email;
  @OneToMany(mappedBy="client",cascade = CascadeType.ALL,orphanRemoval = true)
// @OneToMany(mappedBy = "client")
  private List<Factures> facture;
 
public Clients(int id, String raison_sociale, String adresse, String num_tele, String email, List<Factures> facture) {
	super();
	this.id = id;
	this.raison_sociale = raison_sociale;
	this.adresse = adresse;
	this.num_tele = num_tele;
	this.email = email;
	this.facture = facture;
}
public Clients() {
	super();
}
public Clients(String raison_sociale, String adresse, String num_tele, String email, List<Factures> facture) {
	super();
	this.raison_sociale = raison_sociale;
	this.adresse = adresse;
	this.num_tele = num_tele;
	this.email = email;
	this.facture = facture;
}

public Clients(int id, String raison_sociale, String adresse, String num_tele, String email) {
	super();
	this.id = id;
	this.raison_sociale = raison_sociale;
	this.adresse = adresse;
	this.num_tele = num_tele;
	this.email = email;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getRaison_sociale() {
	return raison_sociale;
}
public void setRaison_sociale(String raison_sociale) {
	this.raison_sociale = raison_sociale;
}
public String getAdresse() {
	return adresse;
}
public void setAdresse(String adresse) {
	this.adresse = adresse;
}
public String getNum_tele() {
	return num_tele;
}
public void setNum_tele(String num_tele) {
	this.num_tele = num_tele;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public List<Factures> getFacture() {
	return facture;
}
public void setFacture(List<Factures> facture) {
	this.facture = facture;
}
@Override
public String toString() {
	return "Clients [id=" + id + ", raison_sociale=" + raison_sociale + ", adresse=" + adresse + ", num_tele="
			+ num_tele + ", email=" + email + ", facture=" + facture + "]";
}
  


}
