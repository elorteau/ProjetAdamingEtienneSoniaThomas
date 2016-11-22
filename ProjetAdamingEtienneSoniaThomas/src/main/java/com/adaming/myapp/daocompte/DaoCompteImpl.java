/*
 * DaoCompteImpl
 * Version: 1.0.0
 * Date: 22/11/2016
 * Author: S. Ferhaten - E. Lorteau - T. Saint Georges
 */

package com.adaming.myapp.daocompte;

import java.util.List;

import com.adaming.myapp.entities.Compte;

public class DaoCompteImpl extends AbstractDaoCompteJPA implements IDaoCompte {

	@Override
	public Compte add(Compte entity) {
		// TODO Auto-generated method stub
		return add(entity);
	}

	@Override
	public Compte getOne(Long id) {
		// TODO Auto-generated method stub
		return getOne(id);
	}

	@Override
	public List<Compte> getAll() {
		// TODO Auto-generated method stub
		return getAll();
	}

	@Override
	public Compte update(Compte entity) {
		// TODO Auto-generated method stub
		return update(entity);
	}

	@Override
	public Compte delete(Long id) {
		// TODO Auto-generated method stub
		return delete(id);
	}

}
