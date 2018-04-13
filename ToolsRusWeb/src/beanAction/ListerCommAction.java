package beanAction;

import java.util.ArrayList;
import java.util.Collection;

import javax.naming.Context;
import javax.naming.InitialContext;

import clientServer.IFacade;
import clientServer.UserException;
import entity.uc3_Donner1Avis.commentaire.Commentaire;
import entity.uc3_Donner1Avis.compteur.Compteur;
import entity.uc3_Donner1Avis.titre.Titre;

public class ListerCommAction extends ApplicationSupport {

	private static final long serialVersionUID = 1L;

	private IFacade interfaceFacade;
	private Context initialContext;

	public Commentaire commentaire;
	private ArrayList<Commentaire> listeCommentaires;
	public Titre titre;
	private Collection<Compteur> listeCompteurs;
	private Compteur cptDislike;
	private Compteur cptLike;
	private int idCompteur;
	

	@Override
	public String execute() throws Exception {
		System.out.println("m�thode execute()");
		lister();
		return SUCCESS;
	}

	public ListerCommAction() throws UserException {
		try {
			initialContext = new InitialContext();
			interfaceFacade = (IFacade) initialContext.lookup("ejb:/ToolsRusServer/Facade!clientServer.IFacade");
			System.out.println("***** Nacer CRUDCommAction() : connexion lookup r�ussie");
		}
		catch (Exception e) {
			System.out.println(e);
		}		    	
	}

	public String lister() throws Exception {
		System.out.println("***** Nacer execute(): m�thode creation() ListerCommAction");
		setListeCommentaires(interfaceFacade.getAllCommParId());
		return SUCCESS;
	}
	
	public String incremLike() throws Exception {
		System.out.println("***** Nacer execute(): m�thode incremLike() ListerCommAction");
//		interfaceFacade.incrementCompteur(getCptLike());
//		interfaceFacade.modifCommentaire(commentaire);
		System.out.println("getIdCompteur() : " + getIdCompteur());
		System.out.println("getCptLike().getIdCompteur() : " + getCptLike());
		System.out.println("cptLike : " + cptLike);
		return SUCCESS;
	}
	
	public String incremDislike() throws Exception {
		System.out.println("***** Nacer execute(): m�thode incremDislike() ListerCommAction");
		System.out.println(cptDislike);
//		interfaceFacade.modifCommentaire(commentaire);
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
	
	public Collection<Compteur> getListeCompteurs() { return listeCompteurs;	}
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

	public ArrayList<Commentaire> getListeCommentaires() { return listeCommentaires; }
	public void setListeCommentaires(ArrayList<Commentaire> listeCommentaires) {
		this.listeCommentaires = listeCommentaires;
	}

	public int getIdCompteur() {
		return idCompteur;
	}

	public void setIdCompteur(int idCompteur) {
		this.idCompteur = idCompteur;
	}


}

