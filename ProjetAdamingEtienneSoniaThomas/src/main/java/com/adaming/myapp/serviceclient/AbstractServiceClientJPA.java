/*
 * AbstractServiceClientJPA
 * Version: 1.0.0
 * Date: 22/11/2016
 * Author: S. Ferhaten - E. Lorteau - T. Saint Georges
 */

package com.adaming.myapp.serviceclient;

import java.util.List;

import com.adaming.myapp.daoclient.IDaoClient;
import com.adaming.myapp.entities.Client;
import com.adaming.myapp.entities.Compte;
import com.adaming.myapp.service.AbstractServiceGeneriqueJPA;

public class AbstractServiceClientJPA extends AbstractServiceGeneriqueJPA<Client> {
	
	private IDaoClient daoclient;	
	
	//===========================
	// Setter
	//===========================
	
	public void setDaoclient(IDaoClient daoclient) {
		this.daoclient = daoclient;
	}
	
	//======================================================
	// rédéfinition des méthodes spéciques de IDaoBanque 
	//======================================================

	
	public List<Compte> getCompteByClientAbstract(Long idClient){
		return daoclient.getCompteByClient(idClient);	
	}
	
	public List<Client> getClientByMcAbstract(String MC){
		return daoclient.getClientByMc(MC);	
	}
	
	public Client addClientToBanqueAbstract(Long idClient, Long idBanque) {
		return daoclient.addClientToBanque(idClient, idBanque);
	}
	
}
