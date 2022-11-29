package org.formation.hibernate.entity;




import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Joueur {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String nom;
	private int dossard;
	@Embedded
	@ManyToOne
	@JoinColumn(name = "id_club")
	private Club club;
	private int matchJouer;
	private int but;
	private int passeDecisives;
	private float ratioBut;
	private float ratioPasseDecisives;
	
	
	public Joueur() {
		// TODO Auto-generated constructor stub
	}
	public Joueur(String nom, int dossard, Club club, int matchJouer, int but, int passeDecisives, float ratioBut, float ratioPasseDecesives) {
		super();
		this.nom = nom;
		this.dossard = dossard;
		this.club = club;
		this.matchJouer = matchJouer;
		this.but = but;
		this.passeDecisives = passeDecisives;
		ratioBut = Math.round(((float) but / (float) matchJouer) * 100f)/100f ;
		this.ratioBut =  ratioBut;
		ratioPasseDecesives =  Math.round(((float) passeDecisives / (float) matchJouer) *100.0f)/100f ;
		this.ratioPasseDecisives = ratioPasseDecesives;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public int getDossard() {
		return dossard;
	}
	public void setDossard(int dossard) {
		this.dossard = dossard;
	}
	public Club getClub() {
		return club;
	}
	public void setClub(Club club) {
		this.club = club;
	}
	public int getMatchJouer() {
		return matchJouer;
	}
	public void setMatchJouer(int matchJouer) {
		this.matchJouer = matchJouer;
	}
	public int getBut() {
		return but;
	}
	public void setBut(int but) {
		this.but = but;
	}
	public int getPasseDecisives() {
		return passeDecisives;
	}
	public void setPasseDecisives(int passeDecisives) {
		this.passeDecisives = passeDecisives;
	}
	public float getRatioBut() {
		return ratioBut;
	}
	public void setRatioBut(float ratioBut) {
		this.ratioBut = ratioBut;
	}
	public float getRatioPasseDecisives() {
		
		ratioPasseDecisives = (float)but / (float)matchJouer;   
		return ratioPasseDecisives;
	}
	public void setRatioPasseDecisives(float ratioPasseDecisives) {
		this.ratioPasseDecisives = ratioPasseDecisives;
	}
	

}

