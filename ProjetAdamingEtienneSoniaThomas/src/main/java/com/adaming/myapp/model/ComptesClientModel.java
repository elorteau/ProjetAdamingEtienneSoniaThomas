/*
 * AbstractDaoEmployeJPA
 * Version: 1.0.0
 * Date: 25/11/2016
 * Author: S. Ferhaten - E. Lorteau - T. Saint Georges
 */

package com.adaming.myapp.model;

import java.util.List;

import com.adaming.myapp.entities.Client;
import com.adaming.myapp.entities.Compte;

public class ComptesClientModel {
	
	//=========================
	// Attributes
	//=========================
	
	private Client client;
	private List<Compte> comptes;
	
	//=========================
	// Getter / Setter
	//=========================

	public Client getClient() {
		return client;
	}
	
	public void setClient(Client client) {
		this.client = client;
	}
	
	public List<Compte> getComptes() {
		return comptes;
	}
	
	public void setComptes(List<Compte> comptes) {
		this.comptes = comptes;
	}

}
