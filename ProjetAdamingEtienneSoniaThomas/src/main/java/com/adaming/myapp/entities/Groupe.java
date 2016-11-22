/*
 * Class name : Groupe
 * Version: 1.0.0
 * Date: 22/11/2016
 * Author: sonia
 */

package com.adaming.myapp.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Groupe implements Serializable {

	//=========================
	// Attributes
	//=========================
			
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idGroupe;
	private Long code;
	private String nom;
	
	//====================================
	//   association avec la class Banque
	//====================================
	@ManyToOne
	@JoinColumn(name="idBanque")
	private Banque banque;
	//====================================
	//   association avec la class Employe
	//====================================
	@ManyToMany
	@JoinTable(name="Employe_to_groupe")
	private List<Employe> employes = new ArrayList <Employe> ();
	//=========================
	// Constructor
	//=========================
	public Groupe(Long idGroupe, Long code, String nom) {
		super();
		this.idGroupe = idGroupe;
		this.code = code;
		this.nom = nom;
	}
	public Groupe() {
		super();
	}
	
	//=========================
	// Getter / Setter
	//=========================
	public Long getIdGroupe() {
		return idGroupe;
	}
	public void setIdGroupe(Long idGroupe) {
		this.idGroupe = idGroupe;
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
	public List<Employe> getEmployes() {
		return employes;
	}
	public void setEmployes(List<Employe> employes) {
		this.employes = employes;
	}
	//==========================
	//  Methode to string
	//===========================
	@Override
	public String toString() {
		return "Groupe [idGroupe=" + idGroupe + ", code=" + code + ", nom="
				+ nom + "]";
	}
	
	
	
}
