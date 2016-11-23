/*
 * ServiceGroupeImpl
 * Version: 1.0.0
 * Date: 22/11/2016
 * Author: S. Ferhaten - E. Lorteau - T. Saint Georges
 */

package com.adaming.myapp.servicegroupe;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.adaming.myapp.entities.Employe;
import com.adaming.myapp.entities.Groupe;

@Transactional
public class ServiceGroupeImpl extends AbstractServiceGroupeJPA implements IServiceGroupe {

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
		
		return addEmToGrAbstract(idGroupe, idEmploye);
	}

	@Override
	public List<Employe> getEmployeByGroupe(Long idGroupe) {
		
		return getEmployeByGroupeAbstract(idGroupe);
	}

}
