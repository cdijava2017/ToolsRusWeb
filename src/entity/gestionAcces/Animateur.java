package entity.gestionAcces;

import java.io.Serializable;

/************************************************************************
 * Module: Animateur.java
 * Author:  zinks 
 * Purpose: Defines the Class Role
 ***********************************************************************/

/** Class Fille animateur herite de Role */
public class Animateur extends Role implements Serializable {

	public Animateur(int id) {
		super(id);
	}

	public Animateur() {

	}

	public Animateur(int id, boolean admin) {
		super(id, admin);

	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public String toString() {
		return "Animateur [isAdmin()=" + isAdmin() + ", getId()=" + getId() + "]";
	}
}