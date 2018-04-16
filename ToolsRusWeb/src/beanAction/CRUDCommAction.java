package beanAction;

import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;

import clientServer.IFacade;
import clientServer.UserException;
import entity.uc3_Donner1Avis.commentaire.Commentaire;
import entity.uc3_Donner1Avis.commentaire.CommentaireException;
import entity.uc3_Donner1Avis.compteur.Compteur;
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
	private String message = null;

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
		System.out.println("***** Nacer : méthode creation() CRUDCommAction");
		titre.setIdTitre(commentaire.getIdComm());
		commentaire.setTitre(titre);
		System.out.println(commentaire.getIdComm());
		if (commentaire.getIdComm() == 0) { message = "** ATTENTION : votre commentaire n'a pas d'identifiant !! **"; }
		else if (commentaire.getTexteComm().isEmpty()) { message = "** ATTENTION : votre commentaire est vide !! **"; }
		else if (commentaire.getTitre().getTxtTitre().isEmpty()) { message = "** ATTENTION : votre commentaire n'a pas de titre !! **"; }
		else { 
			Commentaire test = interfaceFacade.getCommParRef(commentaire.getIdComm());
			System.out.println("** test : " + test);
			System.out.println("** commentaire : " + commentaire);

			if (test != null && test.getIdComm() == commentaire.getIdComm()) { message = "** ATTENTION : un commentaire existe déjà avec cet identifiant !! **";
			System.out.println("message : " + message);}
			else { 
				try {
					interfaceFacade.addCommentaire(commentaire);

				} catch (Exception e) {
					System.out.println("e.getClass : " + e.getClass());
					System.out.println("e.getMessage : " + e.getMessage());
					System.out.println("e.getCause : " + e.getCause());
				}

				System.out.println("***** Nacer : on vide les paramètre avant de recharger la page");
				commentaire = null;
				titre = null;
				listeCompteurs = null;
				System.out.println("***** Nacer : on paramètre le message avant de recharger la page");
				setMessage("créé");
			}
		}
		return SUCCESS;
	}
	public String modification() throws Exception {
		System.out.println("***** Nacer execute(): méthode modification() CRUDCommAction");

		titre.setIdTitre(commentaire.getIdComm());
		System.out.println(titre);
		commentaire.setTitre(titre);
		System.out.println("***** Nacer execute(): commentaire : " + commentaire);
		interfaceFacade.modifCommentaire(commentaire);
		commentaire = null;
		titre = null;		
		setMessage("modifié");
		return SUCCESS;
	}
	public String suppression() throws Exception {
		System.out.println("***** Nacer execute(): méthode execute() SupprBeanAction");
		System.out.println("***** Nacer commentaire : " + commentaire);
		interfaceFacade.supCommParId(commentaire);
		commentaire = null;
		titre = null;
		setMessage("supprimé");
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

	public String getMessage() { return message; }
	public void setMessage(String message) {
		this.message = message;
	}

}




