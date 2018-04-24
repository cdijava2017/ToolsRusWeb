package webapp.uc4;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import clientServer.uc4.IFacService;
import entity.uc4.Mot;
import entity.uc4.MotHumeur;
import utils.uc4.Parametre;
import webapp.ApplicationSupport;

public class SuppMot extends ApplicationSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private static Context context;
	private static IFacService serviceFacade;
	
	private int idMot;
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
			System.out.println("****suppmot_execute" + idMot);
			Mot motSupp = new MotHumeur();
			motSupp.getIdMot();
			try {
				serviceFacade.supprimer(motSupp);
			} catch (Exception e) {
				
				e.printStackTrace();
			}
			msgRetour= "mot supprimé";
			return SUCCESS;
		}

	public int getIdMot() {
		return idMot;
	}

	public void setMot(int idMot) {
		this.idMot = idMot;
	}

	public String getMsgRetour() {
		return msgRetour;
	}

	public void setMsgRetour(String msgRetour) {
		this.msgRetour = msgRetour;
	}
	

	
}
