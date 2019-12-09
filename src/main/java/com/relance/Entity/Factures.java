package com.relance.Entity;


import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class Factures {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id ;
private String reference;
@Temporal(TemporalType.DATE)
@DateTimeFormat(pattern = "yyyy-mm-dd")
private Date date_edition;
private int montant;
private String statut;
@ManyToOne
@JoinColumn(name="Clients_id", nullable=false)
private Clients client;
//@OneToMany(mappedBy="id_relance",cascade = CascadeType.ALL,orphanRemoval = true)
//@OneToMany(mappedBy = "client")
//private List<Relance> relance;
public Factures() {
	super();
}
public Factures(int id, String reference, Date date_edition, int montant, String statut, Clients client) {
	super();
	this.id = id;
	this.reference = reference;
	this.date_edition = date_edition;
	this.montant = montant;
	this.statut = statut;
	this.client = client;
}
public Factures(String reference, Date date_edition, int montant, String statut, Clients client) {
	super();
	this.reference = reference;
	this.date_edition = date_edition;
	this.montant = montant;
	this.statut = statut;
	this.client = client;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getReference() {
	return reference;
}
public void setReference(String reference) {
	this.reference = reference;
}
public Date getDate_edition() {
	return date_edition;
}
public void setDate_edition(Date date_edition) {
	this.date_edition = date_edition;
}
public int getMontant() {
	return montant;
}
public void setMontant(int montant) {
	this.montant = montant;
}
public String getStatut() {
	return statut;
}
public void setStatut(String statut) {
	this.statut = statut;
}
public Clients getClient() {
	return client;
}
public void setClient(Clients client) {
	this.client = client;
}
@Override
public String toString() {
	return "Factures [id=" + id + ", reference=" + reference + ", date_edition=" + date_edition + ", montant=" + montant
			+ ", statut=" + statut + ", client=" + client + "]";
}

}
