

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ClientDAO;

/**
 * Servlet implementation class Connexion
 */
@WebServlet("/Connexion")
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
		// sonDAOclient.identification(nom, prenom);
	}

}
