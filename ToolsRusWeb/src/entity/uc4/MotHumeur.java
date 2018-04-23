package entity.uc4;

import java.io.Serializable;


public class MotHumeur extends Mot implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	
	private int 	idHumeur;
	
	
	private String 	libelleHumeur;
	
		
	
	public MotHumeur() {
		super();
		
	}

	public MotHumeur(int idMot, String libelleMot, Image image,int idHumeur, String libelleHumeur) {
		super(idMot, libelleMot, image);
		this.idHumeur = idHumeur;
		this.libelleHumeur = libelleHumeur;
	}

	public MotHumeur(int idMot, String libelleMot, Image image) {
		super(idMot, libelleMot, image);
		
	}


	public MotHumeur(int idHumeur, String libelleHumeur) {
		super();
		this.idHumeur = idHumeur;
		this.libelleHumeur = libelleHumeur;
	}


	public int getIdHumeur() {
		return idHumeur;
	}


	public void setIdHumeur(int idHumeur) {
		this.idHumeur = idHumeur;
	}


	public String getLibelleHumeur() {
		return libelleHumeur;
	}


	public void setLibelleHumeur(String libelleHumeur) {
		this.libelleHumeur = libelleHumeur;
	}


	@Override
	public String toString() {
		return "MotHumeur [idHumeur=" + getIdMot() + ", libelleHumeur=" + getLibelleMot() + "]";
	}
	
	

}
