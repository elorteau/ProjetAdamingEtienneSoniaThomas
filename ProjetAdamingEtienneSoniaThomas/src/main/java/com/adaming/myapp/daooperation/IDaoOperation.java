/*
 * IDaoOperation
 * Version: 1.0.0
 * Date: 22/11/2016
 * Author: S. Ferhaten - E. Lorteau - T. Saint Georges
 */

package com.adaming.myapp.daooperation;

import java.util.Date;

import com.adaming.myapp.dao.IDaoGenerique;
import com.adaming.myapp.entities.Operation;
import com.adaming.myapp.entities.Retrait;
import com.adaming.myapp.entities.Versement;
import com.adaming.myapp.entities.Virement;

public interface IDaoOperation extends IDaoGenerique<Operation> {

	//=========================
	// Methods
	//=========================
	
	/*
	 * doVersement
	 * @param (idCompte, montantOperation, dateOperation)
	 * @return void
	 */
	public Versement doVersement(Long idCompte, double montantOperation, Date dateOperation);
	
	/*
	 * doRetrait
	 * @param (idCompte, montantOpération, dateOperation)
	 * @return void
	 */
	public Retrait doRetrait(Long idCompte, double montantOperation, Date dateOperation);
	
	/*
	 * doVirement
	 * @param (idCompteEmi, idCompteCible, montantOperation, dateOperation);
	 */
	public Virement doVirement (Long idCompteEmi, Long idCompteCible, double montantOperation, Date dateOperation);
	
}
