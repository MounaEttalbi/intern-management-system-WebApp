package Entities;

public class compte {

		private String CIN;
	    private String nom ;
	    private String prenom ;
	    private String email ;
	    private String dateN ;
	    private String  motPasse;
	    private String adress;
	    private int tel;
	    private String role;
		public compte() {
			super();
			// TODO Auto-generated constructor stub
		}
		public compte(String cIN, String nom, String prenom, String email, String dateN, String motPasse, String adress,
				int tel, String role) {
			super();
			CIN = cIN;
			this.nom = nom;
			this.prenom = prenom;
			this.email = email;
			this.dateN = dateN;
			this.motPasse = motPasse;
			this.adress = adress;
			this.tel = tel;
			this.role = role;
		}
		public String getCIN() {
			return CIN;
		}
		public void setCIN(String cIN) {
			CIN = cIN;
		}
		public String getNom() {
			return nom;
		}
		public void setNom(String nom) {
			this.nom = nom;
		}
		public String getPrenom() {
			return prenom;
		}
		public void setPrenom(String prenom) {
			this.prenom = prenom;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getDateN() {
			return dateN;
		}
		public void setDateN(String dateN) {
			this.dateN = dateN;
		}
		public String getMotPasse() {
			return motPasse;
		}
		public void setMotPasse(String motPasse) {
			this.motPasse = motPasse;
		}
		public String getAdress() {
			return adress;
		}
		public void setAdress(String adress) {
			this.adress = adress;
		}
		public int getTel() {
			return tel;
		}
		public void setTel(int tel) {
			this.tel = tel;
		}
		public String getRole() {
			return role;
		}
		public void setRole(String role) {
			this.role = role;
		}
	    
	}


