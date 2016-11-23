/*
 * DaoBanqueImpl
 * Version: 1.0.0
 * Date: 22/11/2016
 * Author: S. Ferhaten - E. Lorteau - T. Saint Georges
 */

package com.adaming.myapp.daobanque;

import java.util.List;

import com.adaming.myapp.entities.Banque;

public class DaoBanqueImpl extends AbstractDaoBanqueJPA implements IDaoBanque {
	
	//=====================
	//   Methodes CRUD
	//=====================
	
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
	
	

}
