package web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(urlPatterns = { "/ModifierInfosPerso" })
public class ModifierInfosPerso extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ModifierInfosPerso(){
		super();
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("adresse", "DEFAULT");
		RequestDispatcher rd = request.getRequestDispatcher("modifierInfosPerso.jsp");
		if(rd != null){
			rd.forward(request, response);
		}
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}
}
