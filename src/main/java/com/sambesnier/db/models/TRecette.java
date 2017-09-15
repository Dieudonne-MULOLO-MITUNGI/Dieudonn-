package com.sambesnier.db.models;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the t_recettes database table.
 * 
 */
@Entity
@Table(name="t_recettes")
@NamedQuery(name="TRecette.findAll", query="SELECT t FROM TRecette t")
public class TRecette implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int ID_Recettes;

	private String recette_Durée;

	private String recette_Nom;

	private String recette_Parts;

	private String recette_Source;

	public TRecette() {
	}

	public int getID_Recettes() {
		return this.ID_Recettes;
	}

	public void setID_Recettes(int ID_Recettes) {
		this.ID_Recettes = ID_Recettes;
	}

	public String getRecette_Durée() {
		return this.recette_Durée;
	}

	public void setRecette_Durée(String recette_Durée) {
		this.recette_Durée = recette_Durée;
	}

	public String getRecette_Nom() {
		return this.recette_Nom;
	}

	public void setRecette_Nom(String recette_Nom) {
		this.recette_Nom = recette_Nom;
	}

	public String getRecette_Parts() {
		return this.recette_Parts;
	}

	public void setRecette_Parts(String recette_Parts) {
		this.recette_Parts = recette_Parts;
	}

	public String getRecette_Source() {
		return this.recette_Source;
	}

	public void setRecette_Source(String recette_Source) {
		this.recette_Source = recette_Source;
	}

}