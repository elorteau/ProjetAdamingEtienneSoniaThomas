/*
 * AbstractServiceEmployeJPA
 * Version: 1.0.0
 * Date: 22/11/2016
 * Author: S. Ferhaten - E. Lorteau - T. Saint Georges
 */

package com.adaming.myapp.serviceemployee;

import com.adaming.myapp.daoemployee.IDaoEmploye;
import com.adaming.myapp.entities.Employe;
import com.adaming.myapp.service.AbstractServiceGeneriqueJPA;

public class AbstractServiceEmployeJPA extends AbstractServiceGeneriqueJPA<Employe> {
	
	private IDaoEmploye daoEmploye;
	
	//=============================
	//    Setter
	//=============================
	
	public void setDaoEmploye(IDaoEmploye daoEmploye) {
		this.daoEmploye = daoEmploye;
	}
	
	public Employe addEmployeToBanqueAbstract(Long idEmploye, Long idBanque) {
		return daoEmploye.addEmployeToBanque(idEmploye, idBanque);
	}

}
