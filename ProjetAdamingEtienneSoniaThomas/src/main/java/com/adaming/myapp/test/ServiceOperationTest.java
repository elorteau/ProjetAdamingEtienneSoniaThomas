/*
 * AbstractServiceOperationJPA
 * Version: 1.0.0
 * Date: 22/11/2016
 * Author: S. Ferhaten - E. Lorteau - T. Saint Georges
 */

package com.adaming.myapp.test;

import static org.junit.Assert.*;

import java.util.Date;
import java.util.List;

import org.hamcrest.core.IsEqual;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.adaming.myapp.entities.Compte;
import com.adaming.myapp.entities.CompteCourant;
import com.adaming.myapp.entities.Operation;
import com.adaming.myapp.entities.Operation;
import com.adaming.myapp.entities.Retrait;
import com.adaming.myapp.entities.Versement;
import com.adaming.myapp.entities.Virement;
import com.adaming.myapp.servicecompte.IServiceCompte;
import com.adaming.myapp.serviceoperation.IServiceOperation;

public class ServiceOperationTest {
	
	private static ClassPathXmlApplicationContext context;
	private static IServiceOperation serviceOperation;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		context = new ClassPathXmlApplicationContext("app.xml");
		serviceOperation = (IServiceOperation)context.getBean("ServiceOperationImpl");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	@Ignore
	public void testAdd() {
		Operation operation = new Versement(new Date(), 10.0);
		serviceOperation.add(operation);
		assertNotNull(operation.getIdOperation());
	}

	@Test
	@Ignore
	public void testGetOne() {
		List<Operation> operations = serviceOperation.getAll();
		Operation operation = serviceOperation.getOne(operations.get(0).getIdOperation());
		assertNotNull(operation);
	}

	@Test
	@Ignore
	public void testGetAll() {
		List<Operation> operations = serviceOperation.getAll();
		assertNotNull(operations.size());
	}

	@Test
	@Ignore
	public void testUpdate() {
		Operation operation = serviceOperation.getAll().get(0);
		double newMontant = 20.0;
		operation.setMontantOperation(newMontant);
		serviceOperation.update(operation);
		assertThat(newMontant, IsEqual.equalTo(serviceOperation.getOne(operation.getIdOperation()).getMontantOperation()));
	}

	@Test
	@Ignore
	public void testDelete() {
		List<Operation> operations = serviceOperation.getAll();
		serviceOperation.delete(operations.get(0).getIdOperation());
		assertTrue((operations.size() - 1) == serviceOperation.getAll().size());
	}

	@Test
	@Ignore
	public void testDoVersement() {
		IServiceCompte serviceCompte = (IServiceCompte)context.getBean("ServiceCompteImpl");
		Versement versement = new Versement(new Date(), 10.0);
		double solde = serviceCompte.getAll().get(0).getSolde();
		serviceOperation.doVersement(versement, serviceCompte.getAll().get(0).getIdCompte());
		assertThat((solde + versement.getMontantOperation()), IsEqual.equalTo(serviceCompte.getAll().get(0).getSolde()));
		}

	@Test
	@Ignore
	public void testDoRetrait() {
		IServiceCompte serviceCompte = (IServiceCompte)context.getBean("ServiceCompteImpl");
		Retrait retrait = new Retrait(new Date(), 10.0);
		double solde = serviceCompte.getAll().get(0).getSolde();
		serviceOperation.doRetrait(retrait, serviceCompte.getAll().get(0).getIdCompte());
		assertThat((solde - retrait.getMontantOperation()), IsEqual.equalTo(serviceCompte.getAll().get(0).getSolde()));
		}

	@Test
	@Ignore
	public void testDoVirement() {
		IServiceCompte serviceCompte = (IServiceCompte)context.getBean("ServiceCompteImpl");
		Virement virement = new Virement(new Date(), 10.0);
		double solde = serviceCompte.getAll().get(0).getSolde();
		serviceOperation.doVirement(virement, serviceCompte.getAll().get(0).getIdCompte(), serviceCompte.getAll().get(0).getIdCompte());
		assertThat(solde, IsEqual.equalTo(serviceCompte.getAll().get(0).getSolde()));
		}

}
