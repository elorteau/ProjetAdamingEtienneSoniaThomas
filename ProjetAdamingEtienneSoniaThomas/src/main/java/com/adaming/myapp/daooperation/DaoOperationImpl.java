/*
 *  DaoOperationImpl
 * Version: 1.0.0
 * Date: 22/11/2016
 * Author: S. Ferhaten - E. Lorteau - T. Saint Georges
 */

package com.adaming.myapp.daooperation;

import java.util.Date;
import java.util.List;

import com.adaming.myapp.entities.Operation;

public class DaoOperationImpl extends AbstractDaoOperationJPA implements IDaoOperation {

	
	//=====================
	//   Methodes CRUD
	//=====================
	
	@Override
	public Operation add(Operation entity) {
		return addAbstract(entity);
	}

	@Override
	public Operation getOne(Long id) {
		return getOneAbstract(id);
	}

	@Override
	public List<Operation> getAll() {
		return getAllAbstract();
	}

	@Override
	public Operation update(Operation entity) {
		return updateAbstract(entity);
	}

	@Override
	public Operation delete(Long id) {
		return deleteAbstract(id);
	}

	
	//=====================
	//   Methodes implémentées
	//=====================
	
	@Override
	public void doVersement(Long idCompte, double montantOperation,
			Date dateOperation) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void doRetrait(Long idCompte, double montantOperation,
			Date dateOperation) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void doVirement(Long idCompteEmi, Long idCompteCible,
			double montantOperation, Date dateOperation) {
		// TODO Auto-generated method stub
		
	}

	
	

}
