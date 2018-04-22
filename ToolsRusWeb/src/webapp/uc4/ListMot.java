package webapp.uc4;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import clientServer.uc4.IFacService;
import entity.uc4.Mots;
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
	
	private Mots listMot = new Mots();


	public static void init() {
		try {
			context = new InitialContext();

			serviceFacade = (IFacService) context.lookup(Parametre.EJB_SERVICE_FACADE);

		}catch (NamingException ne){
			ne.printStackTrace();
		}
	}

	@Override
	public String execute() {

		init();
		System.out.println("****listMot_lister");
		
		
		try {
			setListMot(serviceFacade.listAllMot());
		} catch (Exception e) {

			e.printStackTrace();
		}
		
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

	public Mots getListMot() {
		return listMot;
	}

	public void setListMot(Mots listMot) {
		this.listMot = listMot;
	}

}
