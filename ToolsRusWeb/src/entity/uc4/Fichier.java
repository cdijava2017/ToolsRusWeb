package entity.uc4;

import java.io.Serializable;


public class Fichier implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	private int idFichier;
	
	
	private String libelleFichier;

	public Fichier(int idFichier, String libelleFichier) {
		super();
		this.idFichier = idFichier;
		this.libelleFichier = libelleFichier;
	}

	public int getIdFichier() {
		return idFichier;
	}

	public void setIdFichier(int idFichier) {
		this.idFichier = idFichier;
	}

	public String getLibelleFichier() {
		return libelleFichier;
	}

	public void setLibelleFichier(String libelleFichier) {
		this.libelleFichier = libelleFichier;
	}

	@Override
	public String toString() {
		return "Fichier [idFichier=" + idFichier + ", libelleFichier=" + libelleFichier + "]";
	}
	
	

}
