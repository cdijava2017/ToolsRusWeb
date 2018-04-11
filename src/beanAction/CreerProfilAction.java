package beanAction;

import entity.gestionAcces.Participant;
import entity.gestionAcces.Profil;
import entity.gestionAcces.Role;
import entity.gestionAcces.User;

public class CreerProfilAction extends ApplicationSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Profil profil;

	private int id;
	private String nom;
	private String prenom;
	private String email;

	private User user;
	private String pseudo;
	private String pw;

	private Role role;

	@Override
	public String execute() throws Exception {
		System.out.println("CreerProfilAction " + nom + "," + prenom + "," + email + "," +pseudo + "," +pw);
		
		user = new User(id, pseudo, pw);
		role = new Participant(id, false);

		profil = new Profil(id, nom, prenom, email, user, role);
		System.out.println("CreerProfilAction  - profil : " + profil);

		return SUCCESS;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getPseudo() {
		return pseudo;
	}

	public void setPseudo(String pseudo) {
		this.pseudo = pseudo;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public Profil getProfil() {
		return profil;
	}

	public void setProfil(Profil profil) {
		this.profil = profil;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
