/*
 * DaoGroupeImpl
 * Version: 1.0.0
 * Date: 22/11/2016
 * Author: S. Ferhaten - E. Lorteau - T. Saint Georges
 */

package com.adaming.myapp.daogroupe;

import java.util.List;

import com.adaming.myapp.entities.Groupe;

public class DaoGroupeImpl extends AbstractDaoGroupeJPA implements IDaoGroupe {

	@Override
	public Groupe add(Groupe entity) {
		// TODO Auto-generated method stub
		return add(entity);
	}

	@Override
	public Groupe getOne(Long id) {
		// TODO Auto-generated method stub
		return getOne(id);
	}

	@Override
	public List<Groupe> getAll() {
		// TODO Auto-generated method stub
		return getAll();
	}

	@Override
	public Groupe update(Groupe entity) {
		// TODO Auto-generated method stub
		return update(entity);
	}

	@Override
	public Groupe delete(Long id) {
		// TODO Auto-generated method stub
		return delete(id);
	}

}
