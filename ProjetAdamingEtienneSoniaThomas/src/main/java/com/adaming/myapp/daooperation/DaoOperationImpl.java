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
import com.adaming.myapp.entities.Retrait;
import com.adaming.myapp.entities.Versement;
import com.adaming.myapp.entities.Virement;

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
	public Versement doVersement(Long idCompte, double montantOperation,
			Date dateOperation) {
		return doVersementAbstract(idCompte, montantOperation, dateOperation);
	}

	@Override
	public Retrait doRetrait(Long idCompte, double montantOperation,
			Date dateOperation) {
		return doRetraitAbstract(idCompte, montantOperation, dateOperation);
	}

	@Override
	public Virement doVirement(Long idCompteEmi, Long idCompteCible,
			double montantOperation, Date dateOperation) {
		return doVirementAbstract(idCompteEmi, idCompteCible, montantOperation, dateOperation);
	}

	
	

}
