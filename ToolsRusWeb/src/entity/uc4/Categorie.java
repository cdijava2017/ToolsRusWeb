package entity.uc4;

public class Categorie {
	
	private int idCategorie;
	private String libCategorie;
	
	
	public Categorie(int idCategorie, String libCategorie) {
		super();
		this.idCategorie = idCategorie;
		this.libCategorie = libCategorie;
	}


	public int getIdCategorie() {
		return idCategorie;
	}


	public void setIdCategorie(int idCategorie) {
		this.idCategorie = idCategorie;
	}


	public String getLibelleCategorie() {
		return libCategorie;
	}


	public void setLibelleCategorie(String libCategorie) {
		this.libCategorie = libCategorie;
	}


	@Override
	public String toString() {
		return "Categorie [idCategorie=" + idCategorie + ", libCategorie=" + libCategorie + "]";
	}
	
	

}
