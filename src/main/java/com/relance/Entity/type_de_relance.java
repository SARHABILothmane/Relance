package com.relance.Entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;

@Entity
@Table(name = "TupeRelance")
public class type_de_relance {
	 @Id
	  @GeneratedValue(strategy = GenerationType.IDENTITY)
	  private int id ;
	  private String label;
	  
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	public type_de_relance() {
		super();
	}
	public type_de_relance(int id, String label) {
		super();
		this.id = id;
		this.label = label;
	}
	public type_de_relance(String label) {
		super();
		this.label = label;
	}
	@Override
	public String toString() {
		return "type_de_relance [id=" + id + ", label=" + label + "]";
	}
	
	  
	  
}
