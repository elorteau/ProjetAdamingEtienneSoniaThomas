/*
 * AbstractDaoCompteJPA
 * Version: 1.0.0
 * Date: 22/11/2016
 * Author: S. Ferhaten - E. Lorteau - T. Saint Georges
 */

package com.adaming.myapp.daocompte;

import java.util.List;
import java.util.logging.Logger;

import com.adaming.myapp.dao.AbstractDaoGeneriqueJPA;
import com.adaming.myapp.entities.Compte;

public class AbstractDaoCompteJPA extends AbstractDaoGeneriqueJPA<Compte> {
	
	//Définition du Logger
	private final Logger LOGGER = Logger.getLogger("AbstractDaoClientJPA");
	
	//=====================
	//   Methodes spécifiques
	//=====================
	
	/*
	 * getCompteByEmploye
	 * récupérer la liste de compte créé par un employé
	 * @param (idEmploye)
	 * @return comptesByEmploye
	 */
	@SuppressWarnings("null")
	protected List<Compte> getCompteByEmployeAbstract(Long idEmploye){		
		List<Compte> comptesByEmploye = null;					//création liste vide
		List<Compte> comptes = getAllAbstract();				//récupétation de tous les comptes
		for (Compte c : comptes) {
			if(c.getEmploye().getIdEmploye() == idEmploye){		//si employé compte c = id employé cherché
				comptesByEmploye.add(c);						// ajout du compte dans la liste
			}				
		}
		LOGGER.info("<------------------List of Compte by Employe generated ------------------->");
		return comptesByEmploye;
	}

	
}
