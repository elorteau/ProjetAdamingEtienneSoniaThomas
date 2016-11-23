/*
 * DaoGroupeImpl
 * Version: 1.0.0
 * Date: 22/11/2016
 * Author: S. Ferhaten - E. Lorteau - T. Saint Georges
 */

package com.adaming.myapp.daogroupe;

import java.util.List;

import com.adaming.myapp.entities.Employe;
import com.adaming.myapp.entities.Groupe;

public class DaoGroupeImpl extends AbstractDaoGroupeJPA implements IDaoGroupe {

	//=====================
	//   Methodes CRUD
	//=====================
	
	@Override
	public Groupe add(Groupe entity) {
		return addAbstract(entity);
	}

	@Override
	public Groupe getOne(Long id) {
		return getOneAbstract(id);
	}

	@Override
	public List<Groupe> getAll() {
		return getAllAbstract();
	}

	@Override
	public Groupe update(Groupe entity) {
		return updateAbstract(entity);
	}

	@Override
	public Groupe delete(Long id) {
		return deleteAbstract(id);
	}

	
	//========================================
	//	Methodes specifiques a la class Groupe
	//========================================
	
	@Override
	public Groupe addEmToGr(Long idGroupe, Long idEmploye) {
		// TODO Auto-generated method stub
		return addEmToGrAbstract(idGroupe, idEmploye);
	}

	@Override
	public List<Employe> getEmployeByGroupe(Long idGroupe) {
		// TODO Auto-generated method stub
		return getEmployeByGroupeAbstract(idGroupe);
	}



}
