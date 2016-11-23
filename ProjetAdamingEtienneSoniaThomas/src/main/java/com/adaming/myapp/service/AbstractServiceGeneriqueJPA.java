/*
 * AbstractServiceGeneriqueJPA<T>
 * Version: 1.0.0
 * Date: 22/11/2016
 * Author: S. Ferhaten - E. Lorteau - T. Saint Georges
 */

package com.adaming.myapp.service;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;

import org.apache.log4j.Logger;

import com.adaming.myapp.dao.IDaoGenerique;


public abstract class AbstractServiceGeneriqueJPA<T extends Serializable> {

	//=========================
	// Attributes
	//=========================

	private IDaoGenerique<T> dao;
	private final Logger LOGGER = Logger.getLogger("AbstractServiceGenerique");
	private Class<T> clazz;
	
	//===========================
	//	Constructor
	//===========================
	
	@SuppressWarnings("unchecked")
	public AbstractServiceGeneriqueJPA() {
		this.clazz = (Class<T>)((ParameterizedType)getClass().getGenericSuperclass()).getActualTypeArguments()[0];
	}
	
	//===========================
	//	Setter
	//===========================
	
	public void setClazz(Class<T> clazz) {
		this.clazz = clazz;
	}
	
	public void setDao(IDaoGenerique<T> dao) {
		this.dao = dao;
		LOGGER.info("<---------- generique doa injected ---------->");
	}

	//==========================
	//  Methodes CRUD
	//==========================
	public T addAbstract(T entity) {
		dao.add(entity);
		return entity;
	}
	
	public T getOneAbstract(Long id) {
		
		return dao.getOne(id);
	}
	
	public List<T> getAllAbstract() {
		return dao.getAll();
	}
	
	public T updateAbstract(T entity) {
		dao.update(entity);
		return entity;
	}
	
	public T deleteAbstract(Long id) {
		return dao.delete(id);
	}

}
