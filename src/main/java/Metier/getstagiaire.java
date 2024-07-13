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
import Entities.stagiaire;

public class getstagiaire extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public getstagiaire() {
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
	    String tel;
	    String etablissement;
	    String filiere;
	    
	    List <stagiaire> liste=new ArrayList<>();
		
	  //Code de connexion à la base de données.
		 Connection connexion=null;
		 ResultSet resultat = null;
		 Statement stat = null;
		String sql = "select * from stagiaire ;";
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
		            	motPasse = resultat.getString("pwd");
		            	tel  = resultat.getString("tel");
		            	filiere = resultat.getString("filiere");
		            	etablissement = resultat.getString("etablissement");
		            	dateN = resultat.getString("dateNaiss");
		                
		                stagiaire c = new stagiaire();
		                c.setCIN(CIN);
		                c.setAdresse(adress);
		                c.setDateNaiss(dateN);
		                c.setEmail(email);
		                c.setPwd(motPasse);
		                c.setNom(nom);
		                c.setPrenom(prenom);
		                c.setEtablissement(etablissement);
		                c.setFiliere(filiere);
		                c.setTel(tel);
		              
		                liste.add(c);
		            }
		            request.setAttribute("liste", liste);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	        
	        
	      //Code de redirection vers la page « index.jsp » après enregistrement
		
	        RequestDispatcher reqdisp = request.getRequestDispatcher("gerestagiaire.jsp");
	 	     reqdisp.forward(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
