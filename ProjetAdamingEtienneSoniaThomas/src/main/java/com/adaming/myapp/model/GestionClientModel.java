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

public class GestionClientModel {
	
	//=========================
	// Attributes
	//=========================
	
	private List<Compte> comptes;
	private List<Client> clients;
	private String action;
	private Long selectedClient;
	private String Mc;
	
	//=========================
	// Getter / Setter
	//=========================

	public String getMc() {
		return Mc;
	}

	public void setMc(String mc) {
		Mc = mc;
	}

	public List<Compte> getComptes() {
		return comptes;
	}

	public void setComptes(List<Compte> comptes) {
		this.comptes = comptes;
	}

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public Long getSelectedClient() {
		return selectedClient;
	}

	public void setSelectedClient(Long selectedClient) {
		this.selectedClient = selectedClient;
	}

	public List<Client> getClients() {
		return clients;
	}

	public void setClients(List<Client> clients) {
		this.clients = clients;
	}
	
	
	
	

}
