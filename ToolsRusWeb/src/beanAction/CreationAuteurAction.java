package beanAction;

import javax.naming.Context;
import javax.naming.InitialContext;

import clientServer.IFacade;
import clientServer.UserException;
import entity.uc3_Donner1Avis.commentaire.Commentaire;

public class CreationAuteurAction extends ApplicationSupport {

	private static final long serialVersionUID = 1L;

	private IFacade iFacade;
	private Context initialContext;

	public Commentaire commentaire;

	@Override
	public String execute() throws Exception {
		System.out.println("méthode execute() CreationBeanAction");
		System.out.println("commentaire : " + commentaire);
		iFacade.addCommentaire(commentaire);
		return SUCCESS;
	}

	public CreationAuteurAction() throws UserException {
		try {
			System.out.println("connexion au lookup...");
			initialContext = new InitialContext();
			iFacade  = (IFacade) initialContext.lookup("ejb:/ToolsRusServer/clientServer!clientServer.IServiceFacade");
			System.out.println("connexion lookup réussie");
		}
		catch (Exception e) {
			System.out.println(e);
		}		    	
	}

	public Commentaire getAuteur() { return commentaire; }

	public void setCommentaire(Commentaire commentaire) {
		this.commentaire = commentaire;
	}



}



