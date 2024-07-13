package Metier;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import Entities.compte;


public class getCompte extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public getCompte() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		

		response.setContentType("text/html");
		response.setCharacterEncoding("UTF-8");
		
	  //Code de récupération des données saisies.
		String CIN ;
	    String nom;
	    String prenom;
	    String email;
	    String dateN;
	    String motPasse;
	    String adress;
	    int tel;
	    String role;
	    
	    List <compte> liste=new ArrayList<>();
		
	  //Code de connexion à la base de données.
		 Connection connexion=null;
		 ResultSet resultat = null;
		 Statement stat = null;
		String sql = "select * from compte ;";
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
					resultat = stat.executeQuery(sql);
					while (resultat.next()) {
		                
		                CIN = resultat.getString("CIN");;
		            	nom  = resultat.getString("nom");;
		            	prenom = resultat.getString("prenom");
		            	email = resultat.getString("email");
		            	adress = resultat.getString("adresse");
		            	motPasse = resultat.getString("motPasse");
		            	tel  = resultat.getInt("tel");
		            	role = resultat.getString("role");
		            	dateN = resultat.getString("dateN");
		                
		                compte c = new compte();
		                c.setCIN(CIN);
		                c.setAdress(adress);
		                c.setDateN(dateN);
		                c.setEmail(email);
		                c.setMotPasse(motPasse);
		                c.setNom(nom);
		                c.setPrenom(prenom);
		                c.setRole(role);
		                c.setTel(tel);
		              
		                liste.add(c);
		            }
					//enregistrer liste dans l'objet request
		            request.setAttribute("liste", liste);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	        
	        
	      //Code de redirection vers la page « index.jsp » après enregistrement
		
	        RequestDispatcher reqdisp = request.getRequestDispatcher("compte.jsp");
	 	     reqdisp.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
