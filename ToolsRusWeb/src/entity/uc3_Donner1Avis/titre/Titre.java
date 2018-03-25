package entity.uc3_Donner1Avis.titre;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import utils.Commentable;

public class Titre  implements Serializable, Commentable {

	private static final long serialVersionUID = 1L;

	private int idTitre;
	private String  txtTitre;
	
	
	public Titre() {}
	
	public Titre(int idTitre, String txtTitre) {
		this.idTitre = idTitre;
		this.txtTitre = txtTitre;
	}

	public int getIdTitre() {
		return idTitre;
	}
	public void setIdTitre(int idTitre) {
		this.idTitre = idTitre;
	}

	public String getTxtTitre() {
		return txtTitre;
	}
	public void setTxtTitre(String txtTitre) {
		this.txtTitre = txtTitre;
	}
	
	
	public String toString() {
		return "Titre = " + idTitre + ", txtTitre = " + txtTitre;
	}
	
}
