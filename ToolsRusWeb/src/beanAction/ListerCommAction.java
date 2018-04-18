package beanAction;

import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;

import clientServer.IFacade;
import clientServer.UserException;
import entity.uc3_Donner1Avis.commentaire.Commentaire;
import entity.uc3_Donner1Avis.titre.Titre;

public class ListerCommAction extends ApplicationSupport {

	private static final long serialVersionUID = 1L;

	private IFacade interfaceFacade;
	private Context initialContext;

	private Commentaire commentaire;
	private ArrayList<Commentaire> listeCommentaires;
	private Titre titre;
	private String id;
	private String message = null;
	

	@Override
	public String execute() throws Exception {
		System.out.println("méthode execute() ListerCommAction");
		lister();
		return SUCCESS;
	}

	public ListerCommAction() throws UserException {
		try {
			initialContext = new InitialContext();
			interfaceFacade = (IFacade) initialContext.lookup("ejb:/ToolsRusServer/Facade!clientServer.IFacade");
			System.out.println("***** Nacer ListerCommAction() : connexion lookup réussie");
		}
		catch (Exception e) {
			System.out.println(e);
		}		    	
	}

	public String lister() throws Exception {
		System.out.println("***** méthode lister() ListerCommAction");
		setListeCommentaires(interfaceFacade.getAllCommParId());
		return SUCCESS;
	}
	
	public String incremLike() throws Exception {
		System.out.println("***** méthode incremLike() ListerCommAction");
		interfaceFacade.incrementCompteur(Integer.parseInt(id.substring(2,id.length())));	// conversion de l'id en int grace à la méthode substring()
		lister();																			// recharge des commentaire pour afficher les compteurs mis à jour
		return SUCCESS;
	}
	
	public String incremDislike() throws Exception {
		System.out.println("***** méthode incremDislike() ListerCommAction");
		interfaceFacade.incrementCompteur(Integer.parseInt(id.substring(2,id.length())));	// conversion de l'id en int grace à la méthode substring()
		lister();																			// recharge des commentaire pour afficher les compteurs mis à jour
		return SUCCESS;
	}

	public String suppression() throws Exception {
		System.out.println("***** méthode suppression() ListerCommAction");
		interfaceFacade.supCommParId(Integer.parseInt(id.substring(2,id.length())));		// conversion de l'id en int grace à la méthode substring()
		lister();																			// recharge des commentaire pour afficher les compteurs mis à jour
		setMessage("supprimé");																// positionne le message qui va s'afficher dans la JSP
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

	public ArrayList<Commentaire> getListeCommentaires() { return listeCommentaires; }
	public void setListeCommentaires(ArrayList<Commentaire> listeCommentaires) {
		this.listeCommentaires = listeCommentaires;
	}

	public String getId() { return id; }
	public void setId(String id) {
		this.id = id;
	}

	public String getMessage() { return message; }
	public void setMessage(String message) {
		this.message = message;
	}

}

