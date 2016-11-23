/*
 * AbstractServiceBanqueJPA
 * Version: 1.0.0
 * Date: 22/11/2016
 * Author: S. Ferhaten - E. Lorteau - T. Saint Georges
 */

package com.adaming.myapp.servicebanque;

import java.util.List;

import org.apache.log4j.Logger;

import com.adaming.myapp.daobanque.IDaoBanque;
import com.adaming.myapp.entities.Banque;
import com.adaming.myapp.entities.Client;
import com.adaming.myapp.entities.Compte;
import com.adaming.myapp.entities.Employe;
import com.adaming.myapp.service.AbstractServiceGeneriqueJPA;

public class AbstractServiceBanqueJPA extends AbstractServiceGeneriqueJPA<Banque> {

	private IDaoBanque daobanque;
	private final Logger LOGGER = Logger.getLogger("AbstractServiceBanqueJPA");
	
	//===========================
	// Setter
	//===========================

	public void setDaobanque(IDaoBanque daobanque) {
		this.daobanque = daobanque;
	}
	
	
	//======================================================
	// rédéfinition des méthodes spéciques de IDaoBanque 
	//======================================================

	
	public List <Employe> getEmployeByBanqueAbstract(Long idBanque){
	
		return daobanque.getEmployeByBanque(idBanque);
		
	}
	
	public List<Client> getClientByBanqueAbstract(Long idBanque) {
	
		return daobanque.getClientByBanque(idBanque);
	}
	
	public List<Compte> getCompteByBanqueAbstract(Long idBanque) {
		// TODO Auto-generated method stub
		return daobanque.getCompteByBanque(idBanque);
	}

}
