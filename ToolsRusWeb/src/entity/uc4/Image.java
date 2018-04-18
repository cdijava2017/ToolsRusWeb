package entity.uc4;

import java.io.Serializable;

/**
 * class Image in association with Mot
 * association also with class Fichier but not treated for the moment
 * @author iceman
 *
 */


public /*abstract*/ class Image implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	private int 	idImage;
	
	
	private String 	libelleImage;
	
	
	private Fichier fichier;
	
	
	public Image(int idImage, String libelleImage) {
		super();
		this.idImage 		= idImage;
		this.libelleImage 	= libelleImage;
	}
	
	public Image(int idImage, String libelleImage, Fichier fichier) {
		super();
		this.idImage 		= idImage;
		this.libelleImage 	= libelleImage;
		this.fichier 		= fichier;
	}


	public int getIdImage() {
		return idImage;
	}


	public void setIdImage(int idImage) {
		this.idImage = idImage;
	}


	public String getLibelleImage() {
		return libelleImage;
	}


	public void setLibelleImage(String libelleImage) {
		this.libelleImage = libelleImage;
	}


	public Fichier getFichier() {
		return fichier;
	}


	public void setFichier(Fichier fichier) {
		this.fichier = fichier;
	}


	@Override
	public String toString() {
		return "Image [idImage=" + idImage + ", libelleImage=" + libelleImage + ", fichier=" + fichier + "]";
	}
	

}
