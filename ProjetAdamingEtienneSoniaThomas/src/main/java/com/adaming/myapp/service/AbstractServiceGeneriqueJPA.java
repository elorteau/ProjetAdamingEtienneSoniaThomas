/*
 * AbstractServiceGeneriqueJPA<T>
 * Version: 1.0.0
 * Date: 22/11/2016
 * Author: S. Ferhaten - E. Lorteau - T. Saint Georges
 */

package com.adaming.myapp.service;

import java.io.Serializable;
import java.util.List;

public abstract class AbstractServiceGeneriqueJPA<T extends Serializable> {
	
	public T add(T entity) {
		return null;
	}
	
	public T getOne(Long id) {
		return null;
	}
	
	public List<T> getAll() {
		return null;
	}
	
	public T update(T entity) {
		return null;
	}
	
	public T delete(Long id) {
		return null;
	}

}
