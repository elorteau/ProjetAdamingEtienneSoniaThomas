/*
 * DaoCompteImpl
 * Version: 1.0.0
 * Date: 22/11/2016
 * Author: S. Ferhaten - E. Lorteau - T. Saint Georges
 */

package com.adaming.myapp.daocompte;

import java.util.List;

import com.adaming.myapp.entities.Compte;
import com.adaming.myapp.entities.Employe;

public class DaoCompteImpl extends AbstractDaoCompteJPA implements IDaoCompte {

	//=====================
	//   Methodes CRUD
	//=====================
	
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
	
	//=====================
	//   Methodes spécifiques
	//=====================
	
	/*
	 * getCompteByEmploye
	 * récupérer la liste de compte créé par un employé
	 * @param (idEmploye)
	 * @return comptesByEmploye
	 */
	@Override
	public List<Compte> getCompteByEmploye(Long idEmploye) {
		return getCompteByEmployeAbstract(idEmploye);
	}

}
