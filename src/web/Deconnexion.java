package web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(urlPatterns = { "/Deconnexion" })
public class Deconnexion extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Deconnexion(){
		super();
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession(true);
		System.out.println("Session expirée.");
		RequestDispatcher rd = request.getRequestDispatcher("deconnexion.jsp");
		if(rd != null){
			rd.forward(request, response);
		}
		session.removeAttribute("nom");
		session.removeAttribute("prenom");
		session.removeAttribute("adresse");
		session.invalidate();
	}
}
