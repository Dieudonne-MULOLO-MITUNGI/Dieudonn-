package com.sambesnier.db.models;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the t_ingredientrecettes database table.
 * 
 */
@Entity
@Table(name="t_ingredientrecettes")
@NamedQuery(name="TIngredientrecette.findAll", query="SELECT t FROM TIngredientrecette t")
public class TIngredientrecette implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private TIngredientrecettePK id;

	private String ingredient_Quantité;

	public TIngredientrecette() {
	}

	public TIngredientrecettePK getId() {
		return this.id;
	}

	public void setId(TIngredientrecettePK id) {
		this.id = id;
	}

	public String getIngredient_Quantité() {
		return this.ingredient_Quantité;
	}

	public void setIngredient_Quantité(String ingredient_Quantité) {
		this.ingredient_Quantité = ingredient_Quantité;
	}

}