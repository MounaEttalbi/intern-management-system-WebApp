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


public class chooseLoging extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public chooseLoging() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		response.setCharacterEncoding("UTF-8");
		
	  //Code de récupération des données saisies.
		String CIN = request.getParameter("CIN");
		String motPasse= request.getParameter("password");
		String role;
		Connection connexion=null;
		 ResultSet resultat = null;
		 Statement stat = null;
		 String sql = "select role from compte where CIN='"+CIN+"'AND motPasse='"+motPasse+"';"; 
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
				resultat=stat.executeQuery(sql);
				 while (resultat.next()) {
				role = resultat.getString("role");
				if(role.equals("administrateur")) {
					RequestDispatcher reqdisp = request.getRequestDispatcher("acc_admin.jsp");
			 	     reqdisp.forward(request, response);}
				else if (role.equals("administrateur_drh")) {
					RequestDispatcher reqdisp = request.getRequestDispatcher("acc_adminDRH.jsp");
			 	     reqdisp.forward(request, response);}
				else if (role.equals("chef_drh")) {
					RequestDispatcher reqdisp = request.getRequestDispatcher("acc_chef.jsp");
			 	     reqdisp.forward(request, response);}
				else if (role.equals("encadrant")) {
					RequestDispatcher reqdisp = request.getRequestDispatcher("acc_encadrant.jsp");
			 	     reqdisp.forward(request, response);}
				else{
					RequestDispatcher reqdisp = request.getRequestDispatcher("index.jsp");
			 	     reqdisp.forward(request, response);}
					
				 }
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	        
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
