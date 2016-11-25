/*
 * AbstractDaoEmployeJPA
 * Version: 1.0.0
 * Date: 25/11/2016
 * Author: S. Ferhaten - E. Lorteau - T. Saint Georges
 */

package com.adaming.myapp.model;

import java.util.Date;

public class AddCompteModel {
	
	//=========================
	// Attributes
	//=========================

	private Long idCompte;
	private Long numeroCompte;
	private Double solde;
	private Date dateCreation;
	private Double tauxInteret;
	private Double decouvert;
	//=========================
	// Getter / Setter
	//=========================
	
	public Double getDecouvert() {
		return decouvert;
	}
	public void setDecouvert(Double decouvert) {
		this.decouvert = decouvert;
	}
	public Double getTauxInteret() {
		return tauxInteret;
	}
	public void setTauxInteret(Double tauxInteret) {
		this.tauxInteret = tauxInteret;
	}
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
