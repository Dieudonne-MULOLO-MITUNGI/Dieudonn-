package com.sambesnier.db.models;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the t_mesure database table.
 * 
 */
@Entity
@Table(name="t_mesure")
@NamedQuery(name="TMesure.findAll", query="SELECT t FROM TMesure t")
public class TMesure implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int ID_Mesure;

	private String mesure_Nom;

	public TMesure() {
	}

	public int getID_Mesure() {
		return this.ID_Mesure;
	}

	public void setID_Mesure(int ID_Mesure) {
		this.ID_Mesure = ID_Mesure;
	}

	public String getMesure_Nom() {
		return this.mesure_Nom;
	}

	public void setMesure_Nom(String mesure_Nom) {
		this.mesure_Nom = mesure_Nom;
	}

}