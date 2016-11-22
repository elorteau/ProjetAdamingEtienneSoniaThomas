/*
 * Classe name : Banque
 * Version: 1.0.0
 * Date: 22/11/2016	
 * Author: T.SaintGeorges
 */

package com.adaming.myapp.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;



@Entity
public class Banque implements Serializable{

	//=========================
	// Attributes
	//=========================
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long idBanque;
	private String nom;
	private String adresse;
	private int codePostal;
	@OneToMany
	@JoinTable(name="TB_Compte_Banque")
	private List<Compte> comptes;
	@OneToMany
	@JoinTable(name="TB_Employe_Banque")
	private List<Employe> employes;	
	@ManyToMany
	@JoinTable(name="TB_Client_Banque")
	private List<Client> clients;
	
	//=========================
	// Constructor
	//=========================
	public Banque() {
		// TODO Auto-generated constructor stub
	}
	
	public Banque(Long idBanque, String nom, String adresse, int codePostal,
			List<Compte> comptes, List<Employe> employes, List<Client> clients) {
		super();
		this.idBanque = idBanque;
		this.nom = nom;
		this.adresse = adresse;
		this.codePostal = codePostal;
		this.comptes = comptes;
		this.employes = employes;
		this.clients = clients;
	}
	
	//=========================
	// Getter / Setter
	//=========================

	public Long getIdBanque() {
		return idBanque;
	}

	public void setIdBanque(Long idBanque) {
		this.idBanque = idBanque;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public int getCodePostal() {
		return codePostal;
	}

	public void setCodePostal(int codePostal) {
		this.codePostal = codePostal;
	}

	public List<Compte> getComptes() {
		return comptes;
	}

	public void setComptes(List<Compte> comptes) {
		this.comptes = comptes;
	}

	public List<Employe> getEmployes() {
		return employes;
	}

	public void setEmployes(List<Employe> employes) {
		this.employes = employes;
	}

	public List<Client> getClients() {
		return clients;
	}

	public void setClients(List<Client> clients) {
		this.clients = clients;
	}
	
	
	//=========================
	// Methods
	//=========================

	


	/*
	 * toString
	 * ce que je fais 
	 * @param
	 * @return
	 */
	public String toString() {
		return "";
	}

	
	
}
