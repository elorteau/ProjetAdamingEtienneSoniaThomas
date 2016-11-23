/*
 * Class name : CompteCourant
 * Version: 1.0.0
 * Date: 22/11/2016
 * Author: sonia
 */

package com.adaming.myapp.entities;

import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("COURANT")
public class CompteCourant extends Compte {

	public CompteCourant() {
		super();
	}

	public CompteCourant(Long numeroCompte, Double solde,
			Date dateCreation) {
		super(numeroCompte, solde, dateCreation);
	}

}
