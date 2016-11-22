/*
 * Version: 1.0.0
 * Date: 22/11/2016
 * Author: sonia
 */

package com.adaming.myapp.entities;

import java.util.Date;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;



@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="type_Compte")
public abstract class Compte {
	
	//=========================
	// Attributes
	//=========================
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private Long idCompte;
	private Long numeroCompte;
	private Double solde;
	private Date dateCreation;
	
	//========================
	//   Les associations
	//========================
	@ManyToOne
	@JoinColumn(name = "idEmploye")
	private Employe employe;
	//=========================
	// Constructor
	//=========================
	
	public Compte(Long idCompte, Long numeroCompte, Double solde,
			Date dateCreation) {
		super();
		this.idCompte = idCompte;
		this.numeroCompte = numeroCompte;
		this.solde = solde;
		this.dateCreation = dateCreation;
	}
	
	public Compte() {
		super();
	}

	
	
	//=========================
	// Getter / Setter
	//=========================
	public Long getIdCompte() {
		return idCompte;
	}

	public void setIdCompte(Long idCompte) {
		this.idCompte = idCompte;
	}

	public Long getNumeroCompte() {
		return numeroCompte;
	}

	public void setNumeroCompte(Long numeroCompte) {
		this.numeroCompte = numeroCompte;
	}

	public Double getSolde() {
		return solde;
	}

	public void setSolde(Double solde) {
		this.solde = solde;
	}

	public Date getDateCreation() {
		return dateCreation;
	}

	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}

	
	

}
