package entity.uc3_Donner1Avis.compteur;

public class CptDislike extends Compteur {

	private static final long serialVersionUID = 1L;

	public CptDislike() {}
	
//	public CptDislike(int id, int compteur) {
//		super(id,compteur);
//	}
	public CptDislike(int compteur) {
		super(compteur);
	}

	public CptDislike(int idCompteur, int compteur) {
		super(idCompteur, compteur);
	}

	@Override
	public String toString() {
		return "CptDislike [ " + super.toString() + " ]";
	}



}
