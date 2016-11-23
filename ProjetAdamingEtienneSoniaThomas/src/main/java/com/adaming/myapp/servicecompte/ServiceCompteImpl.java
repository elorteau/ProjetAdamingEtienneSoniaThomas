/*
 * ServiceCompteImpl
 * Version: 1.0.0
 * Date: 22/11/2016
 * Author: S. Ferhaten - E. Lorteau - T. Saint Georges
 */

package com.adaming.myapp.servicecompte;

import java.util.List;

import com.adaming.myapp.entities.Compte;

public class ServiceCompteImpl extends AbstractServiceCompteJPA implements IServiceCompte {

	@Override
	public Compte add(Compte entity) {
		// TODO Auto-generated method stub
		return addAbstract(entity);
	}

	@Override
	public Compte getOne(Long id) {
		// TODO Auto-generated method stub
		return getOneAbstract(id);
	}

	@Override
	public List<Compte> getAll() {
		// TODO Auto-generated method stub
		return getAllAbstract();
	}

	@Override
	public Compte update(Compte entity) {
		// TODO Auto-generated method stub
		return updateAbstract(entity);
	}

	@Override
	public Compte delete(Long id) {
		// TODO Auto-generated method stub
		return deleteAbstract(id);
	}
	
	// =====================
	// Methodes spécifiques
	// =====================

	@Override
	public List<Compte> getCompteByEmploye(Long idEmploye) {
		return getCompteByEmploye(idEmploye);
	}

}
