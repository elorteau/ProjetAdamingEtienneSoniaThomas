/*
 * ServiceClientImpl
 * Version: 1.0.0
 * Date: 22/11/2016
 * Author: S. Ferhaten - E. Lorteau - T. Saint Georges
 */

package com.adaming.myapp.serviceclient;

import java.util.List;

import com.adaming.myapp.entities.Client;

public class ServiceClientImpl extends AbstractServiceClientJPA implements IServiceClient {

	@Override
	public Client add(Client entity) {
		// TODO Auto-generated method stub
		return addAbstract(entity);
	}

	@Override
	public Client getOne(Long id) {
		// TODO Auto-generated method stub
		return getOneAbstract(id);
	}

	@Override
	public List<Client> getAll() {
		// TODO Auto-generated method stub
		return getAllAbstract();
	}

	@Override
	public Client update(Client entity) {
		// TODO Auto-generated method stub
		return updateAbstract(entity);
	}

	@Override
	public Client delete(Long id) {
		// TODO Auto-generated method stub
		return deleteAbstract(id);
	}

}
