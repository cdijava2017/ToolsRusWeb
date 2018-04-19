package webapp.uc4;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import clientServer.uc4.IFacService;
import entity.uc4.Mot;
import entity.uc4.MotHumeur;
import utils.uc4.Parametre;
import webapp.ApplicationSupport;

public class ListMot extends ApplicationSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private static Context context;
	private static IFacService serviceFacade;

	private String mot;
	private String msgRetour;

	public static void init() {
		try {
			context = new InitialContext();

			serviceFacade = (IFacService) context.lookup(Parametre.EJB_SERVICE_FACADE);

		}catch (NamingException ne){
			ne.printStackTrace();
		}
	}

	public String execute() {

		init();
		System.out.println("****cudmot_creation" + mot);
		Mot motAjout = new MotHumeur();
		motAjout.setLibelleMot(mot);
		try {
			serviceFacade.ajouter(motAjout);
		} catch (Exception e) {

			e.printStackTrace();
		}
		msgRetour= "mot créé";
		return SUCCESS;
	}



	public String getMot() {
		return mot;
	}

	public void setMot(String mot) {
		this.mot = mot;
	}

	public String getMsgRetour() {
		return msgRetour;
	}

	public void setMsgRetour(String msgRetour) {
		this.msgRetour = msgRetour;
	}

}
