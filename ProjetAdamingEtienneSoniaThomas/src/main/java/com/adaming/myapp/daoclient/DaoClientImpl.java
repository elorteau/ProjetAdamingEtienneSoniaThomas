/*
 * DaoClientImpl
 * Version: 1.0.0
 * Date: 22/11/2016
 * Author: S. Ferhaten - E. Lorteau - T. Saint Georges
 */

package com.adaming.myapp.daoclient;

import java.util.List;

import com.adaming.myapp.entities.Client;
import com.adaming.myapp.entities.Compte;

public class DaoClientImpl extends AbstractDaoClientJPA implements IDaoClient {


	//=====================
	//   Methodes CRUD
	//=====================
	
	@Override
	public Client add(Client entity) {
		return addAbstract(entity);
	}

	@Override
	public Client getOne(Long id) {
		return getOneAbstract(id);
	}

	@Override
	public List<Client> getAll() {
		return getAllAbstract();
	}

	@Override
	public Client update(Client entity) {
		return updateAbstract(entity);
	}

	@Override
	public Client delete(Long id) {
		return deleteAbstract(id);
	}

	//=====================
	//   Methodes spécifique
	//=====================
	
	/*
	 * getCompteClient
	 * récupérer la liste de compte d'un client
	 * @param (idClient)
	 * @return List<Compte> comptesClient
	 */	
	@Override
	public List<Compte> getCompteByClient(Long idClient) {
		return getCompteByClientAbstract(idClient);
	}

}
