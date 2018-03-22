package webapp.uc5;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Controleur Uc5
 */
@WebServlet(
		name = "ControleurUc5", 
		description = "Control acces", 
		urlPatterns = {"/verif/acces/*"}
		)
public class ControleurUc5 extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;




	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
	}


	

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
