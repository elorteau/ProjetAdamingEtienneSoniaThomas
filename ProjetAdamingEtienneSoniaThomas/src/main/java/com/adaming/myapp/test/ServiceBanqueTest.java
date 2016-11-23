/*
 * AbstractServiceOperationJPA
 * Version: 1.0.0
 * Date: 22/11/2016
 * Author: S. Ferhaten - E. Lorteau - T. Saint Georges
 */

package com.adaming.myapp.test;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.adaming.myapp.entities.Banque;
import com.adaming.myapp.servicebanque.IServiceBanque;

public class ServiceBanqueTest {

	private static ClassPathXmlApplicationContext context;
	private static IServiceBanque serviceBanque;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	
	//=====================
	// les tests
	//=====================
	@Test
	public void testAdd() {
		Banque banque1= new Banque("Bnp", "paris", 75001 );
		serviceBanque.add(banque1);
		assertNotNull(banque1.getIdBanque());
	}

	@Test
	public void testGetOne() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetAll() {
		fail("Not yet implemented");
	}

	@Test
	public void testUpdate() {
		fail("Not yet implemented");
	}

	@Test
	public void testDelete() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetEmployeByBanque() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetClientByBanque() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetCompteByBanque() {
		fail("Not yet implemented");
	}

}
