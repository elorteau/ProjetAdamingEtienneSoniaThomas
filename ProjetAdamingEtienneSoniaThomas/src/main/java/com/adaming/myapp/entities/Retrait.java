/*
 * Classe name : Retrait
 * Version: 1.0.0
 * Date: 22/11/2016	
 * Author: T.SaintGeorges
 */

package com.adaming.myapp.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("RETRAIT")
public class Retrait extends Operation implements Serializable{
	
	//=========================
	// Attributes
	//=========================
	
	//=========================
	// Constructor
	//=========================
	
	public Retrait() {
		super();
	}

	public Retrait(Date dateOperatiion, double montantOperation) {
		super(dateOperatiion, -Math.abs(montantOperation));
	}

	//=========================
	// Getter / Setter
	//=========================
	
	//=========================
	// Methods
	//=========================

}
