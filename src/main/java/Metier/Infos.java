package Metier;

import java.io.IOException;

import Entities.DAO_Stagiaire;

import Entities.stagiaire;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Infos extends jakarta.servlet.http.HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public Infos() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
	
		response.setContentType("text/html");
		response.setCharacterEncoding("UTF-8");
	  //Code de récupération des données saisies.
		String CIN = request.getParameter("CIN");
	    String nom= request.getParameter("nom");
	    String prenom= request.getParameter("prenom");
	    String email= request.getParameter("email") ;
	    String motPasse= request.getParameter("pwd");
	    String adress= request.getParameter("adresse");
	    int tel= Integer.parseInt(request.getParameter("tel"));
	    String filiere= request.getParameter("filiere") ;
	    String etablissement= request.getParameter("etablissement");
	    String dateNaiss = request.getParameter("dateN");
		
	  
	 //**********************************************
	     // Stocker les variables dans l'objet request
			request.setAttribute("CIN", CIN);
			request.setAttribute("nom", nom);
			request.setAttribute("prenom",prenom);
			request.setAttribute("email",email);
			/*request.setAttribute("prenom",prenom);
			request.setAttribute("nom",nom);
			request.setAttribute("adr",adr);
			request.setAttribute("phone",phone);
			request.setAttribute("mail",mail);*/
			
			DAO_Stagiaire dao = new DAO_Stagiaire();
			stagiaire etd = new stagiaire();
			etd.setEmail(email);
			etd.setCIN(CIN);
			etd.setPrenom(prenom);
			etd.setNom(nom);
			dao.AddStagiaire(etd);
			
			RequestDispatcher qd = request.getRequestDispatcher("infoStagiaire.jsp");
	 	     qd.forward(request, response);
	        
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}





