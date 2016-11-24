package com.adaming.myapp.test;

import static org.junit.Assert.*;

import java.util.Date;
import java.util.List;

import org.hamcrest.core.IsEqual;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.adaming.myapp.entities.Compte;
import com.adaming.myapp.entities.CompteCourant;
import com.adaming.myapp.entities.Employe;
import com.adaming.myapp.servicecompte.IServiceCompte;

public class ServiceCompteTest {
	
	private static ClassPathXmlApplicationContext context;
	private static IServiceCompte serviceCompte;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		context = new ClassPathXmlApplicationContext("app.xml");
		serviceCompte =(IServiceCompte)context.getBean("ServiceCompteImpl");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		context.close();
	}

	@Test
	public void testAdd() {
		Compte c = new CompteCourant(12L, 158.2, new Date());		
		serviceCompte.add(c);
		assertNotNull(c.getIdCompte());
	}	
	
	@Ignore
	@Test
	public void testGetOne() {
		Compte c = serviceCompte.getOne(1L);
		assertTrue(c != null);
	}
	@Ignore
	@Test
	public void testGetAll() {
		List<Compte> comptes = serviceCompte.getAll();
		assertTrue(comptes != null);
		
	}
	@Ignore
	@Test
	public void testUpdate() {
		Compte c1 = serviceCompte.getOne(1L);
		c1.setSolde(152.2);
		serviceCompte.update(c1);
		Compte c2 = serviceCompte.getOne(1L);
		Assert.assertThat(152.2, IsEqual.equalTo(c2.getSolde()));
	}
	@Ignore
	@Test
	public void testDelete() {
		List<Compte> comptes = serviceCompte.getAll();
		int size1 = comptes.size();
		serviceCompte.delete(1L);
		int size2 =comptes.size();
		assertTrue(size1-size2==1);
	}
	@Ignore
	@Test
	public void testGetCompteByEmploye() {
		List<Compte> comptes = serviceCompte.getCompteByEmploye(1L);
		for (Compte c : comptes) {
			if(c.getEmploye().getIdEmploye().equals(1L)){
				assert(true);
			}
		}
	}

}
