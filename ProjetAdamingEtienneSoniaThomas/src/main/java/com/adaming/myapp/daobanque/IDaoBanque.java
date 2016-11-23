/*
 * IDaoBanque
 * Version: 1.0.0
 * Date: 22/11/2016
 * Author: S. Ferhaten - E. Lorteau - T. Saint Georges
 */

package com.adaming.myapp.daobanque;

import java.util.List;

import com.adaming.myapp.dao.IDaoGenerique;
import com.adaming.myapp.entities.Banque;
import com.adaming.myapp.entities.Client;
import com.adaming.myapp.entities.Compte;
import com.adaming.myapp.entities.Employe;

public interface IDaoBanque extends IDaoGenerique <Banque> {
	
	/*
	 * Les  méthodes spécifiques
	 * 
	 */
	
	List <Employe> getEmployeByBanque(Long idBanque);
	List <Client> getClientByBanque (Long idBanque);
	List <Compte> getCompteByBanque (Long idBanque);

}
