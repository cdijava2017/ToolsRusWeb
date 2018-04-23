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

	private Mots 	listMot;


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
			listMot = serviceFacade.listAllMot();
			
		} catch (Exception e) {

			e.printStackTrace();
		}
		
		return SUCCESS;
	}



	public Mots getListMot() {
		return listMot;
	}

	public void setListMot(Mots listMot) {
		this.listMot = listMot;
	}

}
