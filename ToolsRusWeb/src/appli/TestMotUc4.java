package appli;

import javax.naming.InitialContext;
import javax.naming.NamingException;

import clientServer.uc4.IFacService;
import entity.uc4.Mots;
import utils.uc4.Parametre;

public class TestMotUc4 {

	public static void main(String[] args) throws NamingException {
		
		InitialContext context;
		IFacService serviceFacade;
		
		Mots listeMot = new Mots();
		
		context = new InitialContext();
		
		serviceFacade = (IFacService) context.lookup(Parametre.EJB_SERVICE_FACADE);
		
		listeMot = serviceFacade.listAllMot();
		
		System.out.println(listeMot);

	}

}
