package Entities;

import java.io.Serializable;

public class stagiaire implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private String CIN;
	private String nom;
	private String prenom;
	private String etablissement;
	private String filiere;
	private String adresse;
	private String email;
	private String tel;
	private String dateNaiss;
	private String pwd;
	
	public stagiaire(String cIN, String nom, String prenom, String etablissement, String filiere, String adresse,
			String email, String tel, String dateNaiss,String pwd) {
		super();
		CIN = cIN;
		this.nom = nom;
		this.prenom = prenom;
		this.etablissement = etablissement;
		this.filiere = filiere;
		this.adresse = adresse;
		this.email = email;
		this.tel = tel;
		this.dateNaiss = dateNaiss;
		this.pwd = pwd;
	}

	public stagiaire() {
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

	public String getEtablissement() {
		return etablissement;
	}

	public void setEtablissement(String etablissement) {
		this.etablissement = etablissement;
	}

	public String getFiliere() {
		return filiere;
	}

	public void setFiliere(String filiere) {
		this.filiere = filiere;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getDateNaiss() {
		return dateNaiss;
	}

	public void setDateNaiss(String dateNaiss) {
		this.dateNaiss = dateNaiss;
	}

	
	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd ;
	}
	@Override
	public String toString() {
		return "stagiaire [CIN=" + CIN + ", nom=" + nom + ", prenom=" + prenom + ", etablissement=" + etablissement
				+ ", filiere=" + filiere + ", adresse=" + adresse + ", email=" + email + ", tel=" + tel + ", dateNaiss="
				+ dateNaiss + "]";
	}
	
}
