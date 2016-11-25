/*
 * ServiceCompteImpl
 * Version: 1.0.0
 * Date: 22/11/2016
 * Author: S. Ferhaten - E. Lorteau - T. Saint Georges
 */

package com.adaming.myapp.servicecompte;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.adaming.myapp.entities.Compte;

@Transactional
public class ServiceCompteImpl extends AbstractServiceCompteJPA implements IServiceCompte {

	@Override
	public Compte add(Compte entity) {
		return addAbstract(entity);
	}

	@Override
	public Compte getOne(Long id) {
		return getOneAbstract(id);
	}

	@Override
	public List<Compte> getAll() {
		return getAllAbstract();
	}

	@Override
	public Compte update(Compte entity) {
		return updateAbstract(entity);
	}

	@Override
	public Compte delete(Long id) {
		return deleteAbstract(id);
	}
	
	// =====================
	// Methodes spécifiques
	// =====================

	@Override
	public List<Compte> getCompteByEmploye(Long idEmploye) {
		return getCompteByEmployeAbstract(idEmploye);
	}
	
	public Compte addCompteToBanque(Long idCompte, Long idBanque) {
		return addCompteToBanqueAbstract(idCompte, idBanque);
	}

	public Compte addCompteToClient(Long idCompte, Long idClient) {
		return addCompteToClientAbstract(idCompte, idClient);
	}

	public Compte addCompteToEmploye(Long idCompte, Long idEmploye) {
		return addCompteToEmployeAbstract(idCompte, idEmploye);
	}

}
