/*
 * DaoClientImpl
 * Version: 1.0.0
 * Date: 22/11/2016
 * Author: S. Ferhaten - E. Lorteau - T. Saint Georges
 */

package com.adaming.myapp.daoclient;

import java.util.List;

import com.adaming.myapp.entities.Client;

public class DaoClientImpl extends AbstractDaoClientJPA implements IDaoClient {


	//=====================
	//   Methodes CRUD
	//=====================
	@Override
	public Client add(Client entity) {
		// TODO Auto-generated method stub
		return add(entity);
	}

	@Override
	public Client getOne(Long id) {
		// TODO Auto-generated method stub
		return getOne(id);
	}

	@Override
	public List<Client> getAll() {
		// TODO Auto-generated method stub
		return getAll();
	}

	@Override
	public Client update(Client entity) {
		// TODO Auto-generated method stub
		return update(entity);
	}

	@Override
	public Client delete(Long id) {
		// TODO Auto-generated method stub
		return delete(id);
	}

}
