/*
 * AbstractDaoCompteJPA
 * Version: 1.0.0
 * Date: 22/11/2016
 * Author: S. Ferhaten - E. Lorteau - T. Saint Georges
 */

package com.adaming.myapp.daocompte;

import java.util.List;

import com.adaming.myapp.dao.AbstractDaoGeneriqueJPA;
import com.adaming.myapp.entities.Compte;
import com.adaming.myapp.entities.Employe;

public class AbstractDaoCompteJPA extends AbstractDaoGeneriqueJPA<Compte> {
	
	//=====================
	//   Methodes spécifiques
	//=====================
	
	/*
	 * getCompteByEmploye
	 * récupérer la liste de compte créé par un employé
	 * @param (idEmploye)
	 * @return comptesByEmploye
	 */
	protected List<Compte> getCompteByEmployeAbstract(Employe e){
		/*Employe employe = em.find(Employe, idEmploye);
		
		return comptesByEmploye;*/
	}

	
}
