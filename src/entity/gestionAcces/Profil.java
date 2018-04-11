/***********************************************************************
 * Module:  Profil.java
 * Author:  zinks
 * Purpose: Defines the Class Profil
 ***********************************************************************/

package entity.gestionAcces;

import java.io.Serializable;

import entity.uc4.Image;

/** Class Profil */

public class Profil implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/** attributs */

	private int id;
	private String nom;
	private String prenom;
	private String email;

	/**
	 * Mise en place de la dependance & de la navigabilite de Profil vis a vis de
	 * Role,User et Image
	 */

	/** mult=1..1 un utilisatuer par profil */
	private User user;

	/** mult=1..* car plusieur role peut etre affecte a un profil */

	private Role role;

	/**
	 * relation inverse image(one) profil(many)
	 * 
	 */
	private Image image;

	/**
	 * 
	 * @param id
	 * @param nom
	 * @param prenom
	 * @param email
	 * @param user
	 * @param role
	 * @param image
	 */
	public Profil() {
	}

	public Profil(int id, String nom, String prenom, String email, User user, Role role) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.user = user;
		this.role = role;
	}

	public Profil(int id, String nom, String prenom, String email, User user, Role role, Image image) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.user = user;
		this.role = role;
		this.image = image;
	}

	@Override
	public String toString() {
		return "Profil [\n id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", email=" + email + ",\n user=" + user
				+ ",\n roles=" + role + ",\n image=" + image + "]";
	}

	/************* ACCESSEURS **************/
	/** User getter */

	public User getUser() {
		return user;
	}

	/** Role getter */
	public Role getRole() {
		return role;
	}

	/** Image getter */
	public Image getImage() {
		return image;

	}

	public int getId() {
		return id;
	}

	public String getNom() {
		return nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public String getEmail() {
		return email;
	}

	/************** MUTATEURS *************/
	/**
	 * User setter
	 * 
	 * @param newUser
	 */

	public void setUser(User newUser) {
		this.user = newUser;
	}

	/**
	 * Role setter
	 * 
	 * @param newRole
	 */
	public void setRole(Role newRole) {
		this.role = newRole;
	}

	/**
	 * Image setter
	 * 
	 * @param newImage
	 */
	public void setImage(Image newImage) {
		this.image = newImage;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}