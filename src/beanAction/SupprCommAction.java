package beanAction;

import javax.naming.Context;
import javax.naming.InitialContext;

import clientServer.IFacade;
import clientServer.UserException;
import entity.uc3_Donner1Avis.commentaire.Commentaire;
import entity.uc3_Donner1Avis.titre.Titre;

public class SupprCommAction extends ApplicationSupport {

	private static final long serialVersionUID = 1L;

	private IFacade interfaceFacade;
	private Context initialContext;

	public Commentaire commentaire;
	public Titre titre;

	@Override
	public String execute() throws Exception {
		System.out.println("***** Nacer execute(): m�thode execute() SupprBeanAction");
		titre.setIdTitre(commentaire.getIdComm());
		commentaire.setTitre(titre);
		System.out.println("***** Nacer execute(): commentaire : " + commentaire);
		interfaceFacade.supCommParId(commentaire);
		commentaire = null;
		titre = null;
		return SUCCESS;
	}

	public SupprCommAction() throws UserException {
		try {
			initialContext = new InitialContext();
			interfaceFacade = (IFacade) initialContext.lookup("ejb:/ToolsRusServer/Facade!clientServer.IFacade");
			System.out.println("***** Nacer SupprCommAction() : connexion lookup r�ussie");
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

