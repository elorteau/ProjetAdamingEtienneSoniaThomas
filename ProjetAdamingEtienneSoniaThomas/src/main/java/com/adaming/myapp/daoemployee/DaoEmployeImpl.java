/*
 * DaoEmployeImpl
 * Version: 1.0.0
 * Date: 22/11/2016
 * Author: S. Ferhaten - E. Lorteau - T. Saint Georges
 */

package com.adaming.myapp.daoemployee;

import java.util.List;

import com.adaming.myapp.entities.Employe;

public class DaoEmployeImpl extends AbstractDaoEmployeJPA implements IDaoEmploye {

	@Override
	public Employe add(Employe entity) {
		// TODO Auto-generated method stub
		return add(entity);
	}

	@Override
	public Employe getOne(Long id) {
		// TODO Auto-generated method stub
		return getOne(id);
	}

	@Override
	public List<Employe> getAll() {
		// TODO Auto-generated method stub
		return getAll();
	}

	@Override
	public Employe update(Employe entity) {
		// TODO Auto-generated method stub
		return update(entity);
	}

	@Override
	public Employe delete(Long id) {
		// TODO Auto-generated method stub
		return delete(id);
	}

}
