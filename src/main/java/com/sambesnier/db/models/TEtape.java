package com.sambesnier.db.models;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the t_etapes database table.
 * 
 */
@Entity
@Table(name="t_etapes")
@NamedQuery(name="TEtape.findAll", query="SELECT t FROM TEtape t")
public class TEtape implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int recette_ID;

	private String etapes_Description;

	private String etapes_Ordre;

	public TEtape() {
	}

	public int getRecette_ID() {
		return this.recette_ID;
	}

	public void setRecette_ID(int recette_ID) {
		this.recette_ID = recette_ID;
	}

	public String getEtapes_Description() {
		return this.etapes_Description;
	}

	public void setEtapes_Description(String etapes_Description) {
		this.etapes_Description = etapes_Description;
	}

	public String getEtapes_Ordre() {
		return this.etapes_Ordre;
	}

	public void setEtapes_Ordre(String etapes_Ordre) {
		this.etapes_Ordre = etapes_Ordre;
	}

}