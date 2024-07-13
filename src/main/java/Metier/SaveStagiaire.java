package Metier;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;

import java.sql.SQLException;
import java.sql.Statement;



import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/SaveStagiaire")

public class SaveStagiaire extends jakarta.servlet.http.HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public SaveStagiaire() {
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
		
	  //Code de connexion à la base de données.
		 Connection connexion=null;
		 Statement stat = null;
		 String sql = "INSERT INTO stagiaire VALUES('"+CIN+"','"+nom+"','"+prenom+"','"+etablissement+"','"+filiere+"','"+adress+"','"+email+"','"+tel+"','"+dateNaiss+"','"+motPasse+"');";
		 
		 // Chargement du driver
	        try {
	            Class.forName("com.mysql.jdbc.Driver");
	        } catch (ClassNotFoundException e) {
	        }

	        try {
	            connexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/projet_jee_db", "user", "mouna12345");
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	        try {
				stat = connexion.createStatement();
				stat.executeUpdate(sql);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	        //Code de redirection vers la page « index.jsp » après enregistrement
	 	     RequestDispatcher reqdisp = request.getRequestDispatcher("acc_stagiaire.jsp");
	 	     reqdisp.forward(request, response);
	 	     
	        
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}





