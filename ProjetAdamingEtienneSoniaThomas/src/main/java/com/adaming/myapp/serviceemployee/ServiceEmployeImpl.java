/*
 * ServiceEmployeImpl
 * Version: 1.0.0
 * Date: 22/11/2016
 * Author: S. Ferhaten - E. Lorteau - T. Saint Georges
 */

package com.adaming.myapp.serviceemployee;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.adaming.myapp.entities.Employe;

@Transactional
public class ServiceEmployeImpl extends AbstractServiceEmployeJPA implements IServiceEmploye {

	@Override
	public Employe add(Employe entity) {
		return addAbstract(entity);
	}

	@Override
	public Employe getOne(Long id) {
		return getOneAbstract(id);
	}

	@Override
	public List<Employe> getAll() {
		return getAllAbstract();
	}

	@Override
	public Employe update(Employe entity) {
		return updateAbstract(entity);
	}

	@Override
	public Employe delete(Long id) {
		return deleteAbstract(id);
	}

}
