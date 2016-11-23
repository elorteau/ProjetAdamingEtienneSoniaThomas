/*
 * ServiceBanqueImpl
 * Version: 1.0.0
 * Date: 22/11/2016
 * Author: S. Ferhaten - E. Lorteau - T. Saint Georges
 */

package com.adaming.myapp.servicebanque;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.adaming.myapp.entities.Banque;
import com.adaming.myapp.entities.Client;
import com.adaming.myapp.entities.Compte;
import com.adaming.myapp.entities.Employe;

@Transactional
public class ServiceBanqueImpl extends AbstractServiceBanqueJPA implements IServiceBanque {

	@Override
	public Banque add(Banque entity) {
		return addAbstract(entity);
	}

	@Override
	public Banque getOne(Long id) {
		return getOneAbstract(id);
	}

	@Override
	public List<Banque> getAll() {
		return getAllAbstract();
	}

	@Override
	public Banque update(Banque entity) {
		return updateAbstract(entity);
	}

	@Override
	public Banque delete(Long id) {
		return deleteAbstract(id);
	}

	
	//========================================
	//	Methodes specifiques a la class Banque
	//========================================
	
	@Override
	public List<Employe> getEmployeByBanque(Long idBanque) {
		
		return getEmployeByBanqueAbstract(idBanque);
	}

	@Override
	public List<Client> getClientByBanque(Long idBanque) {
		
		return getClientByBanqueAbstract(idBanque);
	}

	@Override
	public List<Compte> getCompteByBanque(Long idBanque) {
		
		return getCompteByBanqueAbstract(idBanque);
	}

}
