/*
 * Classe name : Client
 * Version: 1.0.0
 * Date: 22/11/2016
 * Author: T.SaintGeorges
 */

package com.adaming.myapp.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class Client implements Serializable{
	
	//=========================
	// Attributes
	//=========================
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long idClient;
	private Long code;
	private String nom;
	private String prenom;
	private Date dateEntree;
	private String adresse;
	
	@ManyToMany(mappedBy="clients")
	private List<Banque> banques;
	
	@OneToMany  // association avec le compte
	@JoinColumn(name="idCompte")
	private List<Compte> comptes;
	
	//=========================
	// Constructor
	//=========================
	
	public Client() {
	}
	
	public Client(Long code, String nom, String prenom,
			Date dateEntree, String adresse) {
		super();
		this.code = code;
		this.nom = nom;
		this.prenom = prenom;
		this.dateEntree = dateEntree;
		this.adresse = adresse;
	}

	//=========================
	// Getter / Setter
	//=========================
	
	public Long getIdClient() {
		return idClient;
	}

	public void setIdClient(Long idClient) {
		this.idClient = idClient;
	}

	public Long getCode() {
		return code;
	}

	public void setCode(Long code) {
		this.code = code;
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

	public Date getDateEntree() {
		return dateEntree;
	}

	public void setDateEntree(Date dateEntree) {
		this.dateEntree = dateEntree;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	
	public List<Banque> getBanques() {
		return banques;
	}

	public void setBanques(List<Banque> banques) {
		this.banques = banques;
	}

	public List<Compte> getComptes() {
		return comptes;
	}

	public void setComptes(List<Compte> comptes) {
		this.comptes = comptes;
	}

	//=========================
	// Methods
	//=========================
	
	/*
	 * toString
	 * méthode to string pour l'affichage
	 * @param null
	 * @return attribut client
	 */
	
	@Override
	public String toString() {
		return "Client [idCompte=" + idClient + ", code=" + code + ", nom="
				+ nom + ", prenom=" + prenom + ", dateEntree=" + dateEntree
				+ ", adresse=" + adresse + "]";
	}
	
	
}
