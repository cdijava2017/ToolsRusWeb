package exception.gestionAcces.erreur;

public enum Erreur {

	USER_ID_OBLIGATOIRE(1),
	USER_PSEUDO_OBLIGATOIRE(2),	
	USER_DOUBLON(3), 
	USER_INEXISTANT(5),
	
	PROFIL_AFFECTEE(6),
	PROFIL_ID_OBLIGATOIRE(7),
	PROFIL_NOM_OBLIGATOIRE(8),	
	PROFIL_DOUBLON(9), 
	PROFIL_INEXISTANT(10),
	PROFIL_PRENOM_OBLIGATOIRE(11),
	PROFIL_EMAIL_OBLIGATOIRE(12)
	; 
	private int code;

	private Erreur(int code) {
		this.code = code;
	}

	public int getCode() {
		return code;
	}

	public String action() {
		switch (this) {
		case USER_ID_OBLIGATOIRE:
			return "IdUser  doit être renseignée";
		case USER_PSEUDO_OBLIGATOIRE:
			return "Le PSEUDO doit être renseigné";
		case USER_DOUBLON:
			return "USER existe déjà";
		case USER_INEXISTANT:
			return "USER n'existe pas";

		case PROFIL_AFFECTEE:
			return "PROFIL est déjà affectée";
		case PROFIL_ID_OBLIGATOIRE:
			return "IDPROFIL doit être renseignée";
		case PROFIL_NOM_OBLIGATOIRE:
			return "Le NOM doit être renseigné";

		case PROFIL_PRENOM_OBLIGATOIRE:
			return "Prenom  doit être renseignée";
		case PROFIL_EMAIL_OBLIGATOIRE:
			return "Email  doit être renseignée";
		case PROFIL_DOUBLON:
			return "PROFIL existe déjà";
		case PROFIL_INEXISTANT:
			return "PROFIL n'existe pas";

		default:
			return "";
		}
	}
}
