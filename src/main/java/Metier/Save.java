package Metier;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
//import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

@WebServlet("/Save")
public class Save extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public Save() {
        super();
        // TODO Auto-generated constructor stub
    }

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
	    String dateN= request.getParameter("dateN") ;
	    String role= request.getParameter("role") ;
		
	  //Code de connexion à la base de données.
		 Connection connexion=null;
		 //ResultSet result = null;
		 Statement stat = null;
		 String sql1 = "INSERT INTO administrateur VALUES('"+CIN+"','"+nom+"','"+prenom+"','"+email+"','"+adress+"','"+tel+"','"+motPasse+"','"+dateN+"');";
		 String sql2 = "INSERT INTO administrateur_drh VALUES('"+CIN+"','"+nom+"','"+prenom+"','"+email+"','"+adress+"','"+tel+"','"+motPasse+"','"+dateN+"');";
		 String sql3 = "INSERT INTO chef_drh VALUES('"+CIN+"','"+nom+"','"+prenom+"','"+email+"','"+adress+"','"+tel+"','"+motPasse+"','"+dateN+"');";
		 String sql = "INSERT INTO compte VALUES('"+CIN+"','"+nom+"','"+prenom+"','"+email+"','"+adress+"','"+tel+"','"+motPasse+"','"+role+"','"+dateN+"');";
		 String sql4 = "INSERT INTO encadrant VALUES('"+CIN+"','"+nom+"','"+prenom+"','"+email+"','"+adress+"','"+tel+"','"+motPasse+"','"+dateN+"');";
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
				if(role.equals("administrateur")) {
					stat.executeUpdate(sql1);
					RequestDispatcher reqdisp = request.getRequestDispatcher("acc_admin.jsp");
			 	     reqdisp.forward(request, response);}
				else if (role.equals("administrateur_drh")) {
					stat.executeUpdate(sql2);
					RequestDispatcher reqdisp = request.getRequestDispatcher("acc_adminDRH.jsp");
			 	     reqdisp.forward(request, response);}
				else if (role.equals("chef_drh")) {
					stat.executeUpdate(sql3);
					RequestDispatcher reqdisp = request.getRequestDispatcher("acc_chef.jsp");
			 	     reqdisp.forward(request, response);}
				else if (role.equals("encadrant")) {
					stat.executeUpdate(sql4);
					RequestDispatcher reqdisp = request.getRequestDispatcher("acc_encadrant.jsp");
			 	     reqdisp.forward(request, response);}
				

				stat.executeUpdate(sql);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	        
	        
	        
	       
	      //Code de redirection vers la page « index.jsp » après enregistrement
	 	     //RequestDispatcher reqdisp = request.getRequestDispatcher("index.jsp");
	 	    // reqdisp.forward(request, response);
	 	     
	    
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
