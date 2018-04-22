package beanAction;

import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;

import clientServer.IFacade;
import clientServer.UserException;
import entity.uc3_Donner1Avis.commentaire.Commentaire;
import entity.uc3_Donner1Avis.commentaire.CommentaireException;
import entity.uc3_Donner1Avis.titre.Titre;

public class CRUDCommAction extends ApplicationSupport {

	private static final long serialVersionUID = 1L;

	private IFacade interfaceFacade;
	private Context initialContext;

	public Commentaire commentaire;
	public Titre titre;
	private ArrayList<Commentaire> listeCommentaires;
	private String message = null;
	private String id;

	@Override
	public String execute() throws Exception {
		System.out.println("*** méthode execute() CRUDCommAction");
		System.out.println("execute() commentaire : " + commentaire);
		System.out.println("execute() titre : " + titre);
		System.out.println("execute() id : " + id);
		if (id != null) { 
			commentaire = interfaceFacade.getCommParRef(Integer.parseInt(id.substring(2,id.length())));
			System.out.println(commentaire);
			titre = commentaire.getTitre();
			System.out.println(titre); 
		}
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

	@Override
	public void validate() {
		System.out.println("méthode validate() CRUDAction");
		System.out.println("validate() id : " + id);
		System.out.println("validate() titre : " + titre);
		System.out.println("validate() commentaire : " + commentaire);
//		commentaire.getTitre().setIdTitre(commentaire.getIdComm());
//				titre.setTxtTitre(commentaire.getTitre().getTxtTitre());
//				commentaire.setTitre(titre);
		System.out.println("avant if : " + commentaire);
		if (commentaire.getTitre() == null) {
//		if (titre.getTxtTitre() == null || commentaire.getTitre().getTxtTitre() == null) {
//			titre.setTxtTitre("");
			System.out.println(titre);
			commentaire.setTitre(titre);
			System.out.println("1er if : " + commentaire);
		}
		if (commentaire.getTitre().getTxtTitre().isEmpty()) { 
//		if (titre.getTxtTitre().isEmpty()) { 	
			message = "** Attention, votre commentaire n'a pas de titre !! **";
			addFieldError("titre.txtTitre", message);
		}
		if (commentaire.getIdComm() == 0) {
			message = "** Attention, votre commentaire n'a pas d'identifiant !! **";
			addFieldError("commentaire.idComm", message);
		}
		if (commentaire.getIdComm() < 0) {
			message = "** Attention, vous avez saisi un ID inférieur à zéro !! **";
			addFieldError("commentaire.idComm", message);
		}
		if (commentaire.getTexteComm().isEmpty()) { 
			message = "** Attention, votre commentaire est vide !! **";
			addFieldError("commentaire.texteComm", message); 
		}


	} 

	public String creation() throws Exception {
		System.out.println("***** Nacer : méthode creation() CRUDCommAction");
		titre.setIdTitre(commentaire.getIdComm());
		commentaire.setTitre(titre);
		try {
			interfaceFacade.addCommentaire(commentaire);
			setMessage("créé");
		} catch (CommentaireException e) {
			message = e.getMessage();
		}catch (Exception e) {
			System.out.println("e.getClass : " + e.getClass());
			System.out.println("e.getMessage : " + e.getMessage());
			System.out.println("e.getCause : " + e.getCause());	
		}
		System.out.println("***** Nacer : on vide les paramètre avant de recharger la page");
		commentaire = null;
		titre = null;
		System.out.println("***** Nacer : on paramètre le message avant de recharger la page");
		return SUCCESS;
	}

	public String modification() throws Exception {
		System.out.println("***** méthode modification() CRUDCommAction");
//		titre.setIdTitre(Integer.parseInt(id));
//		titre.setTxtTitre(commentaire.getTitre().getTxtTitre());
//		commentaire.setTitre(titre);
		System.out.println("***** méthode modification() CRUDCommAction commentaire : " + commentaire);
		interfaceFacade.modifCommentaire(commentaire);
		commentaire = null;
		titre = null;		
		setListeCommentaires(interfaceFacade.getAllCommParId());
		setMessage("modifié");
		return "modif";
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




