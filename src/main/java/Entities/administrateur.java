package Entities;

import java.io.Serializable;

public class administrateur implements Serializable {

	private static final long serialVersionUID = 1L;

	private String CIN;
	private String nom;
	private String prenom;
	private String email;
	private String adresse;
	private String tel;
	private String pwd;
	private String dateN;

	public String getDatN() {
		return dateN;
	}

	public void setDatN(String dateN) {
		this.dateN = dateN;
	}

	public administrateur(String cIN, String nom, String prenom, String email, String adresse, String tel, String pwd,
			String dateN) {
		super();
		CIN = cIN;
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.adresse = adresse;
		this.tel = tel;
		this.pwd = pwd;
		this.dateN = dateN;
	}

	public administrateur() {
		super();
		// TODO Auto-generated constructor stub
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

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	@Override
	public String toString() {
		return "admin_DRH [CIN=" + CIN + ", nom=" + nom + ", prenom=" + prenom + ", email=" + email + ", adresse="
				+ adresse + ", tel=" + tel + ", pwd=" + pwd + "]";
	}

}
