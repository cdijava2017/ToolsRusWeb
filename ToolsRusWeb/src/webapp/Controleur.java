package webapp;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Controleur
 */
@WebServlet(
		name = "Controleur", 
		description = "ControlPrincipal", 
		urlPatterns = {"/tools/*"}
		)
public class Controleur extends HttpServlet {

//	/**
//	 * 
//	 */
//	private static final long serialVersionUID = 1L;
//
//	private RequestDispatcher 	disp;
//
//
//	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		String path = request.getPathInfo();
//		if (path == null || path.equals("/")) accueil(request, response);
//		
//		
//	}
//
//	private void accueil(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		disp = request.getRequestDispatcher("/index.jsp");
//		disp.forward(request,response);	
//	}
//	
//
//	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		
//	}

}
