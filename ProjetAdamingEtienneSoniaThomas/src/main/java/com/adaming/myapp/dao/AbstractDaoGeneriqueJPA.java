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
	
	public T addAbstract(T entity) {
		em.persist(entity);
		return entity;
	}
	
	public T getOneAbstract(Long id) {
		T t = em.find(clazz, id);
		return t;
	}
	
	@SuppressWarnings("unchecked")
	public List<T> getAllAbstract() {
		return em.createQuery("from "+clazz.getName()).getResultList();
	}
	
	public T updateAbstract(T entity) {
		em.merge(entity);
		return entity;
	}
	
	public T deleteAbstract(Long id) {
		T t = getOneAbstract(id);
		em.remove(t);
		return t;
	}

}
