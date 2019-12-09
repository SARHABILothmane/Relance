package com.relance.Entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class Relance {
	 @Id
	  @GeneratedValue(strategy = GenerationType.IDENTITY)
	  private int id ;
	 @Temporal(TemporalType.DATE)
	 @DateTimeFormat(pattern = "yyyy-mm-dd")
	 private Date date_relance;
	 private String comment;
	 @ManyToOne(fetch = FetchType.LAZY)
	 @JoinColumn(name="facture_id", nullable=false)
	 private Factures id_facture;
	 @ManyToOne(fetch = FetchType.LAZY)
	 @JoinColumn(name="typerelance_id", nullable=false)
	 private type_de_relance typerelance;
	public Relance() {
		super();
	}
	public Relance(Date date_relance, String comment, Factures id_facture, type_de_relance typerelance) {
		super();
		this.date_relance = date_relance;
		this.comment = comment;
		this.id_facture = id_facture;
		this.typerelance = typerelance;
	}
	public Relance(int id, Date date_relance, String comment, Factures id_facture, type_de_relance typerelance) {
		super();
		this.id = id;
		this.date_relance = date_relance;
		this.comment = comment;
		this.id_facture = id_facture;
		this.typerelance = typerelance;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getDate_relance() {
		return date_relance;
	}
	public void setDate_relance(Date date_relance) {
		this.date_relance = date_relance;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public Factures getId_facture() {
		return id_facture;
	}
	public void setId_facture(Factures id_facture) {
		this.id_facture = id_facture;
	}
	public type_de_relance getTyperelance() {
		return typerelance;
	}
	public void setTyperelance(type_de_relance typerelance) {
		this.typerelance = typerelance;
	}
	@Override
	public String toString() {
		return "Relance [id=" + id + ", date_relance=" + date_relance + ", comment=" + comment + ", id_facture="
				+ id_facture + ", typerelance=" + typerelance + "]";
	}
	 
}
