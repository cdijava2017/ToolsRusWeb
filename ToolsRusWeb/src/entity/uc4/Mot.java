package entity.uc4;

import java.io.Serializable;

/**
 * class Mot have an association with class Image
 * class Mot knows her Image wich associate
 * inheritance for class MotHumeur and Theme: one table by concrete class
 * @author iceman
 *
 */


public abstract class Mot implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	private int 	idMot;
	
	private String 	libelleMot;
	
	private Image 	image;
	

	//default constructor
	public Mot() {
		super();
		}
	
	//constructor
	public Mot(int idMot, String libelleMot, Image image) {
		super();
		this.idMot = idMot;
		this.libelleMot = libelleMot;
		this.image = image;
	}
	
	//constructor for the classes which inheritence, like class MotHumeur or Theme
	public Mot(int idMot, String libelleMot) {
		super();
		this.idMot = idMot;
		this.libelleMot = libelleMot;
		
	}


	public int getIdMot() {
		return idMot;
	}


	public void setIdMot(int idMot) {
		this.idMot = idMot;
	}


	public String getLibelleMot() {
		return libelleMot;
	}


	public void setLibelleMot(String libelleMot) {
		this.libelleMot = libelleMot;
	}

	public Image getImage() {
		return image;
	}


	public void setImage(Image image) {
		this.image = image;
	}


	@Override
	public String toString() {
		return "identifiant du Mot= " + idMot + ", libelle du Mot=" + libelleMot;
	}

	public void ajouter(Mot mot) {
		
		
	}

	
	

}
