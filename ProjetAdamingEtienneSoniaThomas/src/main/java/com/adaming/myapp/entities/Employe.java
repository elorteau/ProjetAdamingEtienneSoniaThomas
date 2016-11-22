/*
 * Class name : Employe
 * Version: 1.0.0
 * Date: 22/11/2016
 * Author: sonia
 */

package com.adaming.myapp.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Employe implements Serializable {

	//=========================
	// Attributes
	//=========================
		
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idEmploye;
	private Long code;
	private String nom;
	
	//====================================
	//   association avec la class Banque
	//====================================
	@ManyToOne
	@JoinColumn(name ="idBanque")
	private Banque banque;
	
	//=========================
	// Constructor
	//=========================
	
	public Employe(Long idEmploye, Long code, String nom) {
		super();
		this.idEmploye = idEmploye;
		this.code = code;
		this.nom = nom;
	}
	public Employe() {
		super();
	}
	
	//=========================
	// Getter / Setter
	//=========================
	public Long getIdEmploye() {
		return idEmploye;
	}
	public void setIdEmploye(Long idEmploye) {
		this.idEmploye = idEmploye;
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
	
	
	
	
		
}
