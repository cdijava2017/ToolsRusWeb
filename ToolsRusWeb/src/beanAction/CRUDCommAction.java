package beanAction;

import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;

import clientServer.IFacade;
import clientServer.UserException;
import entity.uc3_Donner1Avis.commentaire.Commentaire;
import entity.uc3_Donner1Avis.titre.Titre;

public class CRUDCommAction extends ApplicationSupport {

	private static final long serialVersionUID = 1L;

	private IFacade interfaceFacade;
	private Context initialContext;

	public Commentaire commentaire;
	public Titre titre = new Titre();
	private ArrayList<Commentaire> listeCommentaires;
	private String message = null;
	private String id;

	@Override
	public String execute() throws Exception {
		System.out.println("méthode execute()");
		commentaire = interfaceFacade.getCommParRef(Integer.parseInt(id.substring(2,3)));
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
				System.out.println("***** Nacer : on paramètre le message avant de recharger la page");
				setMessage("créé");
			}
		}
		return SUCCESS;
	}
	public String modification() throws Exception {
		System.out.println("***** Nacer execute(): méthode modification() CRUDCommAction");
		System.out.println(commentaire);
		System.out.println("id : " + id);
		titre.setIdTitre(Integer.parseInt(id));
		titre.setTxtTitre(commentaire.getTitre().getTxtTitre());
		System.out.println(titre);
		commentaire.setTitre(titre);
		System.out.println("***** Nacer execute(): commentaire : " + commentaire);
		interfaceFacade.modifCommentaire(commentaire);
		commentaire = null;
		titre = null;		
		setListeCommentaires(interfaceFacade.getAllCommParId());
		setMessage("modifié");
		return INPUT;
	}


	public Commentaire getCommentaire() { return commentaire; }
	public void setCommentaire(Commentaire commentaire) {
		this.commentaire = commentaire;
	}

	public Titre getTitre() { return titre; }
	public void setTitre(Titre titre) {
		this.titre = titre;
	}

	public String getMessage() { return message; }
	public void setMessage(String message) {
		this.message = message;
	}

	public ArrayList<Commentaire> getListeCommentaires() { return listeCommentaires; }
	public void setListeCommentaires(ArrayList<Commentaire> listeCommentaires) {
		this.listeCommentaires = listeCommentaires;
	}

	public String getId() { return id;	}
	public void setId(String id) {
		this.id = id;
	}

}




