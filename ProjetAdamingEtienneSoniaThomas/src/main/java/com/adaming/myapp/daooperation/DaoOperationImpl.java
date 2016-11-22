/*
 *  DaoOperationImpl
 * Version: 1.0.0
 * Date: 22/11/2016
 * Author: S. Ferhaten - E. Lorteau - T. Saint Georges
 */

package com.adaming.myapp.daooperation;

import java.util.List;

import com.adaming.myapp.entities.Operation;

public class DaoOperationImpl extends AbstractDaoOperationJPA implements IDaoOperation {

	@Override
	public Operation add(Operation entity) {
		// TODO Auto-generated method stub
		return add(entity);
	}

	@Override
	public Operation getOne(Long id) {
		// TODO Auto-generated method stub
		return getOne(id);
	}

	@Override
	public List<Operation> getAll() {
		// TODO Auto-generated method stub
		return getAll();
	}

	@Override
	public Operation update(Operation entity) {
		// TODO Auto-generated method stub
		return update(entity);
	}

	@Override
	public Operation delete(Long id) {
		// TODO Auto-generated method stub
		return delete(id);
	}

	@Override
	public void effOperation(Long idCompte, double montantOperation) {
		// TODO Auto-generated method stub
		
	}
	

}
