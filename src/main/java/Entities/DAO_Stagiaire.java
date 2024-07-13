package Entities;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DAO_Stagiaire {

	private Connection cnx=null;

	public Connection connexion() {

		// *********download driver********
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
              e.printStackTrace();
		}
		// **********Connection************
		try {
			cnx = DriverManager.getConnection("jdbc:mysql://localhost:3306/tp1_db", 
					                           "user", "mouna12345");

		} catch (SQLException e) {
			System.out.print("Database failled!!!");
			e.printStackTrace();
		}
          return cnx;
		
	}

	public void AddStagiaire(stagiaire s) {

		this.connexion();
		String query = "INSERT INTO stagiaire"
				+ " VALUES(?,?,?,?,?,?,?,?,?,?)";

		try {
			PreparedStatement ps = cnx.prepareStatement(query);
			ps.setString(1, s.getCIN());
			ps.setString(2, s.getNom());
			ps.setString(3, s.getPrenom());
			ps.setString(4, s.getEtablissement());
			ps.setString(5, s.getFiliere());
			ps.setString(6, s.getAdresse());
			ps.setString(7, s.getEmail());
			ps.setString(8,s.getTel());
			ps.setString(9, s.getDateNaiss());
			ps.setString(10, s.getPwd());

			ps.executeUpdate();
			

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}