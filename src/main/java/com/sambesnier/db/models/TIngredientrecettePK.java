package com.sambesnier.db.models;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the t_ingredientrecettes database table.
 * 
 */
@Embeddable
public class TIngredientrecettePK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	private int recette_ID;

	private String ingredient_ID;

	public TIngredientrecettePK() {
	}
	public int getRecette_ID() {
		return this.recette_ID;
	}
	public void setRecette_ID(int recette_ID) {
		this.recette_ID = recette_ID;
	}
	public String getIngredient_ID() {
		return this.ingredient_ID;
	}
	public void setIngredient_ID(String ingredient_ID) {
		this.ingredient_ID = ingredient_ID;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof TIngredientrecettePK)) {
			return false;
		}
		TIngredientrecettePK castOther = (TIngredientrecettePK)other;
		return 
			(this.recette_ID == castOther.recette_ID)
			&& this.ingredient_ID.equals(castOther.ingredient_ID);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.recette_ID;
		hash = hash * prime + this.ingredient_ID.hashCode();
		
		return hash;
	}
}