/*
 * AbstractDaoOperationJPA
 * Version: 1.0.0
 * Date: 22/11/2016
 * Author: S. Ferhaten - E. Lorteau - T. Saint Georges
 */

package com.adaming.myapp.daooperation;

import java.util.Date;

import com.adaming.myapp.dao.AbstractDaoGeneriqueJPA;
import com.adaming.myapp.entities.Operation;
import com.adaming.myapp.entities.Retrait;
import com.adaming.myapp.entities.Versement;
import com.adaming.myapp.entities.Virement;

public class AbstractDaoOperationJPA extends AbstractDaoGeneriqueJPA<Operation> {

	public Versement doVersementAbstract(Long idCompte, double montantOperation,
			Date dateOperation) {
		return null;
	}

	public Retrait doRetraitAbstract(Long idCompte, double montantOperation,
			Date dateOperation) {
		return null;
	}

	public Virement doVirementAbstract(Long idCompteEmi, Long idCompteCible,
			double montantOperation, Date dateOperation) {	
		return null;
	}
	
}
