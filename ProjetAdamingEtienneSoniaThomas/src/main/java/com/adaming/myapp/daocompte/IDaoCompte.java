/*
 * IDaoCompte
 * Version: 1.0.0
 * Date: 22/11/2016
 * Author: S. Ferhaten - E. Lorteau - T. Saint Georges
 */

package com.adaming.myapp.daocompte;

import java.util.List;

import com.adaming.myapp.dao.IDaoGenerique;
import com.adaming.myapp.entities.Compte;
import com.adaming.myapp.entities.Employe;

public interface IDaoCompte extends IDaoGenerique<Compte> {
	
		//=====================
		//   Methodes sp�cifiques
		//=====================
	
	/*
	 * getCompteByEmploye
	 * r�cup�rer la liste de compte cr�� par un employ�
	 * @param (idEmploye)
	 * @return comptesByEmploye
	 */
	List<Compte> getCompteByEmploye(Long idEmploye);

}
