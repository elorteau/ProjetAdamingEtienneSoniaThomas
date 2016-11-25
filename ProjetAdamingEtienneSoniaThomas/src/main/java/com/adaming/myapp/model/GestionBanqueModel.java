/*
 * AbstractDaoEmployeJPA
 * Version: 1.0.0
 * Date: 25/11/2016
 * Author: S. Ferhaten - E. Lorteau - T. Saint Georges
 */

package com.adaming.myapp.model;

import java.util.List;

import com.adaming.myapp.entities.Banque;
import com.adaming.myapp.entities.Client;
import com.adaming.myapp.entities.Compte;
import com.adaming.myapp.entities.Employe;

public class GestionBanqueModel {
	
	//=========================
	// Attributes
	//=========================
	
	private List<Banque> banques;
	private List<Employe> employes;
	private List<Client> clients;
	private List<Compte> comptes;
	private Banque selectedBanque;

	//=========================
	// Getter / Setter
	//=========================

	public List<Banque> getBanques() {
		return banques;
	}
	
	public void setBanques(List<Banque> banques) {
		this.banques = banques;
	}
	
	public List<Employe> getEmployes() {
		return employes;
	}
	
	public void setEmployes(List<Employe> employes) {
		this.employes = employes;
	}
	
	public List<Client> getClients() {
		return clients;
	}
	
	public void setClients(List<Client> clients) {
		this.clients = clients;
	}
	
	public List<Compte> getComptes() {
		return comptes;
	}
	
	public void setComptes(List<Compte> comptes) {
		this.comptes = comptes;
	}

	public Banque getSelectedBanque() {
		return selectedBanque;
	}

	public void setSelectedBanque(Banque selectedBanque) {
		this.selectedBanque = selectedBanque;
	}

}
