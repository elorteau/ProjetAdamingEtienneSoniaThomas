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
	
	//D�finition du Logger
	private final Logger LOGGER = Logger.getLogger("AbstractDaoClientJPA");
	
	//=====================
	//   Methodes sp�cifiques
	//=====================
	
	/*
	 * getCompteByEmploye
	 * r�cup�rer la liste de compte cr�� par un employ�
	 * @param (idEmploye)
	 * @return comptesByEmploye
	 */
	@SuppressWarnings("null")
	protected List<Compte> getCompteByEmployeAbstract(Long idEmploye){		
		List<Compte> comptesByEmploye = null;					//cr�ation liste vide
		List<Compte> comptes = getAllAbstract();				//r�cup�tation de tous les comptes
		for (Compte c : comptes) {
			if(c.getEmploye().getIdEmploye() == idEmploye){		//si employ� compte c = id employ� cherch�
				comptesByEmploye.add(c);						// ajout du compte dans la liste
			}				
		}
		LOGGER.info("<------------------List of Compte by Employe generated ------------------->");
		return comptesByEmploye;
	}

	
}
