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
	public Titre titre = new Titre();
	private ArrayList<Commentaire> listeCommentaires;
	private String message = null;
	private String id;

	@Override
	public String execute() throws Exception {
		System.out.println("*** m�thode execute() CRUDCommAction");
		commentaire = interfaceFacade.getCommParRef(Integer.parseInt(id.substring(2,id.length())));
		return SUCCESS;
	}

	public CRUDCommAction() throws UserException {
		try {
			initialContext = new InitialContext();
			interfaceFacade = (IFacade) initialContext.lookup("ejb:/ToolsRusServer/Facade!clientServer.IFacade");
			System.out.println("***** Nacer CRUDCommAction() : connexion lookup r�ussie");
		}
		catch (Exception e) {
			System.out.println(e);
		}		    	
	}

	@Override
	public void validate() {
		titre.setIdTitre(commentaire.getIdComm());
		commentaire.setTitre(titre);
		if (commentaire.getIdComm() == 0) {
			message = "** Attention, votre commentaire n'a pas d'identifiant !! **";
			addFieldError("commentaire.idComm", message);
		}
		if (commentaire.getTexteComm().isEmpty()) { 
			message = "** Attention, votre commentaire est vide !! **";
			addFieldError("commentaire.texteComm", message); 
		}
		if (titre.getTxtTitre().isEmpty()) { 
			message = "** Attention, votre commentaire n'a pas de titre !! **";
			addFieldError("titre.txtTitre", message);
		}
	} 
	
	public String creation() throws Exception {
		System.out.println("***** Nacer : m�thode creation() CRUDCommAction");
		titre.setIdTitre(commentaire.getIdComm());
		commentaire.setTitre(titre);
			try {
				interfaceFacade.addCommentaire(commentaire);
				setMessage("cr��");
			} catch (CommentaireException e) {
				message = e.getMessage();
			}catch (Exception e) {
				System.out.println("e.getClass : " + e.getClass());
				System.out.println("e.getMessage : " + e.getMessage());
				System.out.println("e.getCause : " + e.getCause());	
			}
			System.out.println("***** Nacer : on vide les param�tre avant de recharger la page");
			commentaire = null;
			titre = null;
			System.out.println("***** Nacer : on param�tre le message avant de recharger la page");
		return SUCCESS;
	}
	
	public String modification() throws Exception {
		System.out.println("***** m�thode modification() CRUDCommAction");
		titre.setIdTitre(Integer.parseInt(id));
		titre.setTxtTitre(commentaire.getTitre().getTxtTitre());
		commentaire.setTitre(titre);
		interfaceFacade.modifCommentaire(commentaire);
		commentaire = null;
		titre = null;		
		setListeCommentaires(interfaceFacade.getAllCommParId());
		setMessage("modifi�");
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




