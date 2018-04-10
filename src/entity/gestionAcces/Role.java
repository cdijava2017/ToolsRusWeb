package entity.gestionAcces;

import java.io.Serializable;

/***********************************************************************
 * Module:  Role.java
 * Author:  zinks
 * Purpose: Defines the Class Role
 ***********************************************************************/

/** Class mere Role */

public abstract class Role implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	// private String nom;
	private boolean admin; // verif si ok admin ou pas -

	public Role() {

	}

	public Role(int id) {
		super();
	}

	public Role(int id, /* String nom, */ boolean admin) {
		super();
		this.id = id;
		// this.nom = nom;
		this.admin = admin;
	}

	@Override
	public String toString() {
		return "Role [id=" + id + ", nom=" + /* nom + */", admin=" + admin + "]";
	}

	public boolean isAdmin() {
		return admin;
	}

	public void setAdmin(boolean admin) {
		this.admin = admin;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	/*
	 * public String getNom() { return nom; }
	 * 
	 * public void setNom(String nom) { this.nom = nom; }
	 */
}