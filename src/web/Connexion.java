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

/**
 * Servlet implementation class Connexion
 */
@WebServlet(urlPatterns = { "/Connexion" })
public class Connexion extends HttpServlet {
	private static final long serialVersionUID = 1L;
      
	private ClientDAO sonDAOclient;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Connexion() {
        super();
        this.sonDAOclient = new ClientDAO();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession(true);
		session.invalidate();
		System.out.println("Session expirée.");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		/*
		 *
		 * Recuperer prenom nom
		 * appeler méthode identification dans modele ClientDAO.java
		 * si identification est ok -> Accueil client
		 * sinon retourner à la page index.jsp avec message erreur
		 */
		String nom = request.getParameter("nom");
		String prenom = request.getParameter("prenom");
		
		HttpSession session = request.getSession(true);
		
		if(!nom.isEmpty() && !prenom.isEmpty()){
			if(sonDAOclient.identification(nom, prenom)){
				session.setAttribute("nom", nom);
				session.setAttribute("prenom", prenom);
				RequestDispatcher rd=request.getRequestDispatcher("accueilClient.jsp");
				rd.forward(request, response);
			}
			else
			{
				String msgErreur = new String("Utilisateur inconnu.");
				session.setAttribute("error", msgErreur);
				RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
				if (rd != null) {
					rd.forward(request, response);
				}
			}
		}
		else{
			String msgErreur = new String("Remplir tous les champs.");
			session.setAttribute("error", msgErreur);
			RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
			if (rd != null) {
				rd.forward(request, response);
			}
		}
		
		
	}

}
