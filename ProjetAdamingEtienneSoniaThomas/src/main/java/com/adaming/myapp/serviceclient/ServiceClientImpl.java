/*
 * ServiceClientImpl
 * Version: 1.0.0
 * Date: 22/11/2016
 * Author: S. Ferhaten - E. Lorteau - T. Saint Georges
 */

package com.adaming.myapp.serviceclient;

import java.util.List;
import java.util.Set;

import org.springframework.transaction.annotation.Transactional;

import com.adaming.myapp.entities.Client;
import com.adaming.myapp.entities.Compte;

@Transactional
public class ServiceClientImpl extends AbstractServiceClientJPA implements IServiceClient {

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

	
	//========================================
	//	Methodes specifiques a la class Client
	//========================================
	@Override
	public List<Client> getClientByMc(String MC) {
		return getClientByMcAbstract(MC);
	}

	@Override
	public Set<Compte> getCompteByClient(Long idClient) {
		
		return getCompteByClientAbstract(idClient);
	}
	
	public Client addClientToBanque(Long idClient, Long idBanque) {
		return addClientToBanqueAbstract(idClient, idBanque);
	}

}
