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

import Entities.stage;
public class DeleteStage extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
    public DeleteStage() {
        super();
        // TODO Auto-generated constructor stub
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		response.setCharacterEncoding("UTF-8");
		
		//Code de récupération des données saisies.
				
				String sujet;
				String debut;
				String fin ;
				String type;
				String etat ;
			
	  //Code de récupération des données saisies.
		String id = request.getParameter("supprimer");
		//Code de connexion à la base de données.
		 Connection connexion=null;
		 ResultSet resultat = null;
		 Statement stat = null;
		 List<stage>liste=new ArrayList<>();
		 String sql1 = "select * from stage;";
		 String sql = "delete from stage where id_stage = '"+id+"';";
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
	            // Exécution de la requête
	        	stat = connexion.createStatement();
	        	stat.executeUpdate(sql);
	            resultat = stat.executeQuery(sql1);

	            // Récupération des données
                while (resultat.next()) {
	                
	                id = resultat.getString("id_stage");;
	            	sujet  = resultat.getString("sujet");;
	            	debut = resultat.getString("date_debut");
	            	fin = resultat.getString("date_fin");
	            	type = resultat.getString("type");
	            	etat = resultat.getString("etat");
	                
	                stage s = new stage();
	                s.setId(id);
	                s.setSujet(sujet);
	                s.setDebut(debut);
	                s.setFin(fin);
	                s.setType(type);
	                s.setEtat(etat);
	              
	                liste.add(s);
	            }
	            request.setAttribute("liste", liste);
	        } catch (SQLException e) {
	        } finally {
	            // Fermeture de la connexion
	            try {
	                if (resultat != null)
	                    resultat.close();
	                if (stat != null)
	                    stat.close();
	                if (connexion != null)
	                    connexion.close();
	            } catch (SQLException ignore) {
	            }
	        }
	        
	 	   //Code de redirection vers la page « index.jsp » après enregistrement
	 	     RequestDispatcher reqdisp = request.getRequestDispatcher("stage.jsp");
	 	     reqdisp.forward(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
