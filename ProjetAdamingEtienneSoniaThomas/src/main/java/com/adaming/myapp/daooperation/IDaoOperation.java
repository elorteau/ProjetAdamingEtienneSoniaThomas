/*
 * IDaoOperation
 * Version: 1.0.0
 * Date: 22/11/2016
 * Author: S. Ferhaten - E. Lorteau - T. Saint Georges
 */

package com.adaming.myapp.daooperation;

import com.adaming.myapp.dao.IDaoGenerique;
import com.adaming.myapp.entities.Operation;

public interface IDaoOperation extends IDaoGenerique<Operation> {

	//=========================
	// Methods
	//=========================
	
	/*
	 * effOperation
	 * Faire une op�ration, en abstract pour les slasses filles
	 * @param montant / idCompte / montantOperation
	 * @return null
	 */
	/*
	 * m�thode versement
	 * retrait
	 * virement
	 */
	
	
}
