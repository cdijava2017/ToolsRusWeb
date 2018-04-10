/***********************************************************************
 * Module: User.java 
 * Author: zinks 
 * Purpose: Defines the Class User
 ***********************************************************************/
package entity.gestionAcces;

import java.io.Serializable;

public class User implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/** attributs */
	private int id;
	private String pseudo;
	private String pw;

	public User() {
	}

	public User(int id) {
		super();
		this.id = id;
	}

	public User(int id, String pseudo, String pw) {
		super();
		this.id = id;
		this.pseudo = pseudo;
		this.pw = pw;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", pseudo=" + pseudo + ", pw=" + pw + "]";
	}

	public int getId() {
		return id;
	}

	public String getPseudo() {
		return pseudo;
	}

	public String getPw() {
		return pw;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setPseudo(String pseudo) {
		this.pseudo = pseudo;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

}