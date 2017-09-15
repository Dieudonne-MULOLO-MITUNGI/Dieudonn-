package com.sambesnier.db.models;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the t_categories database table.
 * 
 */
@Entity
@Table(name="t_categories")
@NamedQuery(name="TCategory.findAll", query="SELECT t FROM TCategory t")
public class TCategory implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int ID_Categories;

	private String categorie_Nom;

	public TCategory() {
	}

	public int getID_Categories() {
		return this.ID_Categories;
	}

	public void setID_Categories(int ID_Categories) {
		this.ID_Categories = ID_Categories;
	}

	public String getCategorie_Nom() {
		return this.categorie_Nom;
	}

	public void setCategorie_Nom(String categorie_Nom) {
		this.categorie_Nom = categorie_Nom;
	}

}