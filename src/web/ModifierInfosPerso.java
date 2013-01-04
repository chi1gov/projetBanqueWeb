package web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.ClientDAO;

@WebServlet(urlPatterns = { "/ModifierInfosPerso" })
public class ModifierInfosPerso extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private ClientDAO sonDAOclient;
	
	public ModifierInfosPerso(){
		super();
		this.sonDAOclient = new ClientDAO();
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("modifierInfosPerso.jsp");
		if(rd != null){
			rd.forward(request, response);
		}
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession(true);
		String nom = (String) session.getAttribute("nom");
		String prenom = (String) session.getAttribute("prenom");
		String adresse = request.getParameter("adresse");
		if(!nom.isEmpty() && !prenom.isEmpty() && !adresse.isEmpty())
		{
			this.sonDAOclient.setAdresse(nom, prenom, adresse);
			System.out.println("Adresse modifiée.");
			session.removeAttribute("adresse");
			session.setAttribute("adresse", adresse);
		}
		RequestDispatcher rd = request.getRequestDispatcher("modifierInfosPersoValide.jsp");
		if(rd != null){
			rd.forward(request, response);
		}
	}
}
