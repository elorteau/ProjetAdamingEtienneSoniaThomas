/*
 * ServiceGroupeImpl
 * Version: 1.0.0
 * Date: 22/11/2016
 * Author: S. Ferhaten - E. Lorteau - T. Saint Georges
 */

package com.adaming.myapp.servicegroupe;

import java.util.List;

import com.adaming.myapp.entities.Groupe;

public class ServiceGroupeImpl extends AbstractServiceGroupeJPA implements IServiceGroupe {

	@Override
	public Groupe add(Groupe entity) {
		// TODO Auto-generated method stub
		return addAbstract(entity);
	}

	@Override
	public Groupe getOne(Long id) {
		// TODO Auto-generated method stub
		return getOneAbstract(id);
	}

	@Override
	public List<Groupe> getAll() {
		// TODO Auto-generated method stub
		return getAllAbstract();
	}

	@Override
	public Groupe update(Groupe entity) {
		// TODO Auto-generated method stub
		return updateAbstract(entity);
	}

	@Override
	public Groupe delete(Long id) {
		// TODO Auto-generated method stub
		return deleteAbstract(id);
	}

}
