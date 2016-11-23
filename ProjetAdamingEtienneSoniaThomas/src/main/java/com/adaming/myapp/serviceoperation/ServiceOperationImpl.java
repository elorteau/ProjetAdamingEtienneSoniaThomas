/*
 * ServiceOperationImpl
 * Version: 1.0.0
 * Date: 22/11/2016
 * Author: S. Ferhaten - E. Lorteau - T. Saint Georges
 */

package com.adaming.myapp.serviceoperation;

import java.util.List;

import com.adaming.myapp.entities.Operation;

public class ServiceOperationImpl extends AbstractServiceOperationJPA implements IServiceOperation {

	@Override
	public Operation add(Operation entity) {
		// TODO Auto-generated method stub
		return addAbstract(entity);
	}

	@Override
	public Operation getOne(Long id) {
		// TODO Auto-generated method stub
		return getOneAbstract(id);
	}

	@Override
	public List<Operation> getAll() {
		// TODO Auto-generated method stub
		return getAllAbstract();
	}

	@Override
	public Operation update(Operation entity) {
		// TODO Auto-generated method stub
		return updateAbstract(entity);
	}

	@Override
	public Operation delete(Long id) {
		// TODO Auto-generated method stub
		return deleteAbstract(id);
	}

}
