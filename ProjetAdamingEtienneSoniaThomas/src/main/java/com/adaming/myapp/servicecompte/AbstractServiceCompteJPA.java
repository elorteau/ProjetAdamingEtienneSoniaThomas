/*
 * AbstractServiceCompteJPA
 * Version: 1.0.0
 * Date: 22/11/2016
 * Author: S. Ferhaten - E. Lorteau - T. Saint Georges
 */

package com.adaming.myapp.servicecompte;

import java.util.List;

import org.apache.log4j.Logger;

import com.adaming.myapp.daocompte.IDaoCompte;
import com.adaming.myapp.entities.Compte;
import com.adaming.myapp.service.AbstractServiceGeneriqueJPA;

public class AbstractServiceCompteJPA extends AbstractServiceGeneriqueJPA<Compte> {
	
	private IDaoCompte daoCompte;
	private final Logger LOGGER = Logger.getLogger("AbstractServiceCompteJPA");
		
	//=============================
	//    Setter
	//=============================
	
	public void setDaoCompte(IDaoCompte daoCompte) {
		this.daoCompte = daoCompte;
	}
	
	//======================================================
	// rédéfinition des méthodes spéciques de IDaoCompte
	//======================================================
	
	protected List<Compte> getCompteByEmployeAbstract(Long idEmploye){
		return daoCompte.getCompteByEmploye(idEmploye);
	}
}
