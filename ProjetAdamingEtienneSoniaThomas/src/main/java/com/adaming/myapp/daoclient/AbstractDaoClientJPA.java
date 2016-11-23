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

import org.hibernate.cache.spi.QueryResultsRegion;

import com.adaming.myapp.dao.AbstractDaoGeneriqueJPA;
import com.adaming.myapp.entities.Client;
import com.adaming.myapp.entities.Compte;

public class AbstractDaoClientJPA extends AbstractDaoGeneriqueJPA<Client> {
	
	private final Logger LOGGER = Logger.getLogger("AbstractDaoClientJPA");
	
	//=====================
	//   Methodes spécifique
	//=====================
	
	/*
	 * getCompteClient
	 * récupérer la liste de compte d'un client
	 * @param (idClient)
	 * @return List<Compte> comptesClient
	 */
	protected List<Compte> getCompteByClientAbstract(Long idClient){
		
		Client client = em.find(Client.class, idClient);
		List<Compte> comptesByClient = client.getComptes();		
		LOGGER.info("<------------------List of Compte by Client generated ------------------->");
		return comptesByClient;
		
	}
	
	@SuppressWarnings("unchecked")
	public List<Client> getClientByMcAbstract(String MC){
	Query query = em.createQuery("from Client c where c like :x");
			query.setParameter("x", "%"+MC+"%");
		return query.getResultList();
		
	}
}
