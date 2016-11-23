/*
 * AbstractServiceOperationJPA
 * Version: 1.0.0
 * Date: 22/11/2016
 * Author: S. Ferhaten - E. Lorteau - T. Saint Georges
 */

package com.adaming.myapp.serviceoperation;

import com.adaming.myapp.daooperation.IDaoOperation;
import com.adaming.myapp.entities.Operation;
import com.adaming.myapp.entities.Retrait;
import com.adaming.myapp.entities.Versement;
import com.adaming.myapp.entities.Virement;
import com.adaming.myapp.service.AbstractServiceGeneriqueJPA;

public class AbstractServiceOperationJPA extends AbstractServiceGeneriqueJPA<Operation> {
	
	//=========================
	// Attributes
	//=========================

	private IDaoOperation dao;
	
	//=============================
	//    Setter
	//=============================
	
	public void setDaogroupe(IDaoOperation dao) {
		this.dao = dao;
	}
	
	//=========================
	// Methods
	//=========================

	public Versement doVersementAbstract(Versement versement, Long idCompte) {
		return dao.doVersement(versement, idCompte);
	}

	public Retrait doRetraitAbstract(Retrait retrait, Long idCompte) {
		return dao.doRetrait(retrait, idCompte);
	}

	public Virement doVirementAbstract(Virement virement, Long idCompteDebite, Long idCompteCredite) {
		return dao.doVirement(virement, idCompteDebite, idCompteCredite);
	}
	
}
