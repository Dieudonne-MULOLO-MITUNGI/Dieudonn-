package com.sambesnier.db.models;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the t_ingredients database table.
 * 
 */
@Entity
@Table(name="t_ingredients")
@NamedQuery(name="TIngredient.findAll", query="SELECT t FROM TIngredient t")
public class TIngredient implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int ID_Ingredient;

	private String ingredients_Nom;

	private String mesure_ID;

	public TIngredient() {
	}

	public int getID_Ingredient() {
		return this.ID_Ingredient;
	}

	public void setID_Ingredient(int ID_Ingredient) {
		this.ID_Ingredient = ID_Ingredient;
	}

	public String getIngredients_Nom() {
		return this.ingredients_Nom;
	}

	public void setIngredients_Nom(String ingredients_Nom) {
		this.ingredients_Nom = ingredients_Nom;
	}

	public String getMesure_ID() {
		return this.mesure_ID;
	}

	public void setMesure_ID(String mesure_ID) {
		this.mesure_ID = mesure_ID;
	}

}