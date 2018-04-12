package beanAction;

import java.util.ArrayList;
import java.util.Collection;

import javax.naming.Context;
import javax.naming.InitialContext;

import clientServer.IFacade;
import clientServer.UserException;
import entity.uc3_Donner1Avis.commentaire.Commentaire;
import entity.uc3_Donner1Avis.compteur.Compteur;
import entity.uc3_Donner1Avis.compteur.CptDislike;
import entity.uc3_Donner1Avis.compteur.CptLike;
import entity.uc3_Donner1Avis.titre.Titre;

public class CRUDCommAction extends ApplicationSupport {

	private static final long serialVersionUID = 1L;

	private IFacade interfaceFacade;
	private Context initialContext;

	public Commentaire commentaire;
	public Titre titre;
	private ArrayList<Compteur> listeCompteurs;
	private Compteur cptDislike;
	private Compteur cptLike;

	@Override
	public String execute() throws Exception {
		System.out.println("méthode execute()");
		return SUCCESS;
	}

	public CRUDCommAction() throws UserException {
		try {
			initialContext = new InitialContext();
			interfaceFacade = (IFacade) initialContext.lookup("ejb:/ToolsRusServer/Facade!clientServer.IFacade");
			System.out.println("***** Nacer CRUDCommAction() : connexion lookup réussie");
		}
		catch (Exception e) {
			System.out.println(e);
		}		    	
	}

	public String creation() throws Exception {
		System.out.println("***** Nacer execute(): méthode creation() CRUDCommAction");
		titre.setIdTitre(commentaire.getIdComm());
		commentaire.setTitre(titre);
		System.out.println("***** Nacer execute(): commentaire : " + commentaire);
		interfaceFacade.addCommentaire(commentaire);
		commentaire = null;
		titre = null;
		listeCompteurs = null;
		return SUCCESS;
	}
	public String modification() throws Exception {
		System.out.println("***** Nacer execute(): méthode modification() CRUDCommAction");
		titre.setIdTitre(commentaire.getIdComm());
		commentaire.setTitre(titre);
		System.out.println("***** Nacer execute(): commentaire : " + commentaire);
		interfaceFacade.modifCommentaire(commentaire);
		commentaire = null;
		titre = null;
		return SUCCESS;
	}
	public String suppression() throws Exception {
		System.out.println("***** Nacer execute(): méthode execute() SupprBeanAction");
		titre.setIdTitre(commentaire.getIdComm());
		commentaire.setTitre(titre);
		System.out.println("***** Nacer execute(): commentaire : " + commentaire);
		interfaceFacade.supCommParId(commentaire);
		commentaire = null;
		titre = null;
		return SUCCESS;
	}
	
	public Commentaire getCommentaire() { return commentaire; }
	public void setCommentaire(Commentaire commentaire) {
		this.commentaire = commentaire;
	}

	public Titre getTitre() { return titre; }
	public void setTitre(Titre titre) {
		this.titre = titre;
	}

	public ArrayList<Compteur> getListeCompteurs() { return listeCompteurs;	}
	public void setListeCompteurs(ArrayList<Compteur> compteurs) {
		this.listeCompteurs = compteurs;
	}
	public void addCompteur(Compteur compteur) {
		this.listeCompteurs.add(compteur);
	}

	public Compteur getCptDislike() { return cptDislike; }
	public void setCptDislike(Compteur cptDislike) {
		this.cptDislike = cptDislike;
	}

	public Compteur getCptLike() { return cptLike; }
	public void setCptLike(Compteur cptLike) {
		this.cptLike = cptLike;
	}

}




