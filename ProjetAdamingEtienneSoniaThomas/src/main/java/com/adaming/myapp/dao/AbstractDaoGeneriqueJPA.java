/*
 * AbstractDaoGeneriqueJPA<T>
 * Version: 1.0.0
 * Date: 22/11/2016
 * Author: S. Ferhaten - E. Lorteau - T. Saint Georges
 */

package com.adaming.myapp.dao;

import java.io.Serializable;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public abstract class AbstractDaoGeneriqueJPA<T extends Serializable> {
	
	@PersistenceContext
	protected EntityManager em;
	
	private Class <T> clazz;
	
	T add(T entity) {
		em.persist(entity);
		return entity;
	}
	
	T getOne(Long id) {
		T t = em.find(clazz, id);
		return t;
	}
	
	@SuppressWarnings("unchecked")
	List<T> getAll() {
		return em.createQuery("from "+clazz.getName()).getResultList();
	}
	
	T update(T entity) {
		em.merge(entity);
		return entity;
	}
	
	T delete(Long id) {
		T t = getOne(id);
		em.remove(t);
		return t;
	}

}
