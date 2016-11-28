/*
 * AbstractDaoEmployeJPA
 * Version: 1.0.0
 * Date: 25/11/2016
 * Author: S. Ferhaten - E. Lorteau - T. Saint Georges
 */

package com.adaming.myapp.model;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

import com.adaming.myapp.entities.Compte;

public class GestionCompteModel {

	//=========================
	// Attributes
	//=========================
	
	private Compte compte;
	private double montant;
	private String action;
	
	private double montantOperation;
	private Compte compteCible;
	@DateTimeFormat (iso=ISO.DATE)
	private Date dateOperation;

	//=========================
	// Getter / Setter
	//=========================

	public Compte getCompte() {
		return compte;
	}

	public void setCompte(Compte compte) {
		this.compte = compte;
	}

	public double getMontant() {
		return montant;
	}

	public void setMontant(double montant) {
		this.montant = montant;
	}

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public double getMontantOperation() {
		return montantOperation;
	}

	public void setMontantOperation(double montantOperation) {
		this.montantOperation = montantOperation;
	}

	public Compte getCompteCible() {
		return compteCible;
	}

	public void setCompteCible(Compte compteCible) {
		this.compteCible = compteCible;
	}

	public Date getDateOperation() {
		return dateOperation;
	}

	public void setDateOperation(Date dateOperation) {
		this.dateOperation = dateOperation;
	}
	
	
	
}
