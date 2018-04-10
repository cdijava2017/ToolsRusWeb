package beanAction;

import javax.naming.Context;
import javax.naming.InitialContext;

import clientServer.IFacade;
import clientServer.UserException;
import entity.uc3_Donner1Avis.commentaire.Commentaire;

public class ModifCommAction extends ApplicationSupport {

	private static final long serialVersionUID = 1L;

	private IFacade interfaceFacade;
	private Context initialContext;

	public Commentaire commentaire;

	@Override
	public String execute() throws Exception {
		System.out.println("***** Nacer execute(): méthode execute() ModifBeanAction");
		System.out.println("***** Nacer execute(): commentaire : " + commentaire);
		interfaceFacade.modifCommentaire(commentaire);
		commentaire = null;
		return SUCCESS;
	}

	public ModifCommAction() throws UserException {
		try {
			initialContext = new InitialContext();
			interfaceFacade = (IFacade) initialContext.lookup("ejb:/ToolsRusServer/Facade!clientServer.IFacade");
			System.out.println("***** Nacer ModifCommAction() : connexion lookup réussie");
		}
		catch (Exception e) {
			System.out.println(e);
		}		    	
	}

	public Commentaire getCommentaire() { return commentaire; }

	public void setCommentaire(Commentaire commentaire) {
		this.commentaire = commentaire;
	}

}
