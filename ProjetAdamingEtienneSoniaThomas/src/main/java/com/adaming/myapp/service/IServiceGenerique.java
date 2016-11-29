/*
 * IServiceGenerique<T>
 * Version: 1.0.0
 * Date: 22/11/2016
 * Author: S. Ferhaten - E. Lorteau - T. Saint Georges
 */

package com.adaming.myapp.service;

import java.io.Serializable;
import java.util.List;

import com.adaming.myapp.exception.NullListException;

public interface IServiceGenerique<T extends Serializable> {
	
	T add(T entity);
	
	T getOne(Long id);
	
	List<T> getAll() throws NullListException;
	
	T update(T entity);
	
	T delete(Long id);

}
