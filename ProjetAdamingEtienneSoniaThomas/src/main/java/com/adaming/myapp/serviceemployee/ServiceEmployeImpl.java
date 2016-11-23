/*
 * ServiceEmployeImpl
 * Version: 1.0.0
 * Date: 22/11/2016
 * Author: S. Ferhaten - E. Lorteau - T. Saint Georges
 */

package com.adaming.myapp.serviceemployee;

import java.util.List;

import com.adaming.myapp.entities.Employe;

public class ServiceEmployeImpl extends AbstractServiceEmployeJPA implements IServiceEmploye {

	@Override
	public Employe add(Employe entity) {
		// TODO Auto-generated method stub
		return addAbstract(entity);
	}

	@Override
	public Employe getOne(Long id) {
		// TODO Auto-generated method stub
		return getOneAbstract(id);
	}

	@Override
	public List<Employe> getAll() {
		// TODO Auto-generated method stub
		return getAllAbstract();
	}

	@Override
	public Employe update(Employe entity) {
		// TODO Auto-generated method stub
		return updateAbstract(entity);
	}

	@Override
	public Employe delete(Long id) {
		// TODO Auto-generated method stub
		return deleteAbstract(id);
	}

}
