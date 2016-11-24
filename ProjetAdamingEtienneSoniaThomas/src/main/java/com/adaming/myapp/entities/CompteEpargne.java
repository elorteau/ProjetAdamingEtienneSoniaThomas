/*
 * Class name : CompteEpargne
 * Version: 1.0.0
 * Date: 22/11/2016
 * Author: sonia
 */

package com.adaming.myapp.entities;

import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("EPARGNE")
public class CompteEpargne extends Compte {
	
	private double tauxInteret;

	public CompteEpargne() {
		super();
	}

	public CompteEpargne(Long numeroCompte, Double solde, Date dateCreation) {
		super(numeroCompte, solde, dateCreation);
		
	}

	public CompteEpargne(double tauxInteret) {
		super();
		this.tauxInteret = tauxInteret;
	}

	public double getTauxInteret() {
		return tauxInteret;
	}

	public void setTauxInteret(double tauxInteret) {
		this.tauxInteret = tauxInteret;
	}
	
}
