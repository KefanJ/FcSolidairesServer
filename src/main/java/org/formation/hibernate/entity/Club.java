package org.formation.hibernate.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Club {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	private int nbrVictoireTotal;
	private int nbrNulTotal;
	private int nbrDefaiteTotal;
	private int nbrButMarquer;
	private int nbrButPris;
	@OneToMany(mappedBy = "club")
	private Set<Joueur> joueurs = new HashSet<Joueur>();
	
	public Club() {
		// TODO Auto-generated constructor stub
	}

	public Club(String name, int nbrVictoireTotal, int nbrNulTotal, int nbrDefaiteTotal, int nbrButMarquer,
			int nbrButPris) {
		super();
		this.name = name;
		this.nbrVictoireTotal = nbrVictoireTotal;
		this.nbrNulTotal = nbrNulTotal;
		this.nbrDefaiteTotal = nbrDefaiteTotal;
		this.nbrButMarquer = nbrButMarquer;
		this.nbrButPris = nbrButPris;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNbrVictoireTotal() {
		return nbrVictoireTotal;
	}

	public void setNbrVictoireTotal(int nbrVictoireTotal) {
		this.nbrVictoireTotal = nbrVictoireTotal;
	}

	public int getNbrNulTotal() {
		return nbrNulTotal;
	}

	public void setNbrNulTotal(int nbrNulTotal) {
		this.nbrNulTotal = nbrNulTotal;
	}

	public int getNbrDefaiteTotal() {
		return nbrDefaiteTotal;
	}

	public void setNbrDefaiteTotal(int nbrDefaiteTotal) {
		this.nbrDefaiteTotal = nbrDefaiteTotal;
	}

	public int getNbrButMarquer() {
		return nbrButMarquer;
	}

	public void setNbrButMarquer(int nbrButMarquer) {
		this.nbrButMarquer = nbrButMarquer;
	}

	public int getNbrButPris() {
		return nbrButPris;
	}

	public void setNbrButPris(int nbrButPris) {
		this.nbrButPris = nbrButPris;
	}

	public Set<Joueur> getJoueurs() {
		return joueurs;
	}

	public void setJoueurs(Set<Joueur> joueurs) {
		this.joueurs = joueurs;
	}
	
	

	@Override
	public String toString() {
		return "Club [id=" + id + ", name=" + name + ", nbrVictoireTotal=" + nbrVictoireTotal + ", nbrNulTotal="
				+ nbrNulTotal + ", nbrDefaiteTotal=" + nbrDefaiteTotal + ", nbrButMarquer=" + nbrButMarquer
				+ ", nbrButPris=" + nbrButPris + "]";
	}
	
	

}
