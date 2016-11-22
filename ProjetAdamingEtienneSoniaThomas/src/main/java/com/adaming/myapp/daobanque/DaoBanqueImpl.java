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
	

	@Override
	public Banque add(Banque entity) {
		// TODO Auto-generated method stub
		return add(entity);
	}

	@Override
	public Banque getOne(Long id) {
		// TODO Auto-generated method stub
		return getOne(id);
	}

	@Override
	public List<Banque> getAll() {
		// TODO Auto-generated method stub
		return getAll();
	}

	@Override
	public Banque update(Banque entity) {
		// TODO Auto-generated method stub
		return update(entity);
	}

	@Override
	public Banque delete(Long id) {
		// TODO Auto-generated method stub
		return delete(id);
	}
	
	

}
