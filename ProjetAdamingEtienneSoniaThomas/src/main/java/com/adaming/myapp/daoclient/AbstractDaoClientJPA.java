/*
 * AbstractDaoClientJPA
 * Version: 1.0.0
 * Date: 22/11/2016
 * Author: S. Ferhaten - E. Lorteau - T. Saint Georges
 */

package com.adaming.myapp.daoclient;

import java.util.List;
import java.util.logging.Logger;

import javax.persistence.Query;

import com.adaming.myapp.dao.AbstractDaoGeneriqueJPA;
import com.adaming.myapp.entities.Client;
import com.adaming.myapp.entities.Compte;

public class AbstractDaoClientJPA extends AbstractDaoGeneriqueJPA<Client> {
	
	private final Logger LOGGER = Logger.getLogger("AbstractDaoClientJPA");
	
	//=====================
	//   Methodes sp�cifique
	//=====================
	
	/*
	 * getCompteClient
	 * r�cup�rer la liste de compte d'un client
	 * @param (idClient)
	 * @return List<Compte> comptesClient
	 */
	protected List<Compte> getCompteByClientAbstract(Long idClient){
		
		Client client = em.find(Client.class, idClient);
		List<Compte> comptesByClient = client.getComptes();		
		LOGGER.info("<------------------List of Compte by Client generated ------------------->");
		return comptesByClient;
		
	}
}
