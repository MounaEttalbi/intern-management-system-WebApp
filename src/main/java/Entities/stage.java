package Entities;


public class stage {
	private String id;
	private String sujet;
	private String debut;
	private String fin;
	private String type;
	private String etat ;
	public stage() {
		super();
		// TODO Auto-generated constructor stub
	}
	public stage(String id, String sujet, String debut, String fin, String type, String etat) {
		super();
		this.id = id;
		this.sujet = sujet;
		this.debut = debut;
		this.fin = fin;
		this.type = type;
		this.etat = etat;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getSujet() {
		return sujet;
	}
	public void setSujet(String sujet) {
		this.sujet = sujet;
	}
	public String getDebut() {
		return debut;
	}
	public void setDebut(String debut) {
		this.debut = debut;
	}
	public String getFin() {
		return fin;
	}
	public void setFin(String fin) {
		this.fin = fin;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getEtat() {
		return etat;
	}
	public void setEtat(String etat) {
		this.etat = etat;
	}
	
}
