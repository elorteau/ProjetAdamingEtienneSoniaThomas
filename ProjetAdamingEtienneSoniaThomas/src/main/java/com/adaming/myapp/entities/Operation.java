/*
 * Classe name : Operation
 * Version: 1.0.0
 * Date: 22/11/2016
 * Author: T.SaintGeorges
 */

package com.adaming.myapp.entities;

import java.io.Serializable;
import java.util.Date;

public class Operation implements Serializable{
	
	//=========================
	// Attributes
	//=========================
	
	private Long idOperation;
	private Date dateOperatiion;
	private double montantOperation;
	
	//=========================
	// Constructor
	//=========================
	
	public Operation() {
		// TODO Auto-generated constructor stub
	}	
	
	public Operation(Long idOperation, Date dateOperatiion,
			double montantOperation) {
		super();
		this.idOperation = idOperation;
		this.dateOperatiion = dateOperatiion;
		this.montantOperation = montantOperation;
	}
	
	//=========================
	// Getter / Setter
	//=========================

	public Long getIdOperation() {
		return idOperation;
	}

	public void setIdOperation(Long idOperation) {
		this.idOperation = idOperation;
	}

	public Date getDateOperatiion() {
		return dateOperatiion;
	}

	public void setDateOperatiion(Date dateOperatiion) {
		this.dateOperatiion = dateOperatiion;
	}

	public double getMontantOperation() {
		return montantOperation;
	}

	public void setMontantOperation(double montantOperation) {
		this.montantOperation = montantOperation;
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
		return "Operation [idOperation=" + idOperation + ", dateOperatiion="
				+ dateOperatiion + ", montantOperation=" + montantOperation
				+ "]";
	}
	


	
	
	
	
}
