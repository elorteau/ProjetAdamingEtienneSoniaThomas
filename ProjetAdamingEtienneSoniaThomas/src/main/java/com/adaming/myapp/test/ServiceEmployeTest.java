package com.adaming.myapp.test;

import static org.junit.Assert.*;

import java.util.List;

import org.hamcrest.core.IsEqual;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.adaming.myapp.entities.Employe;
import com.adaming.myapp.serviceemployee.IServiceEmploye;

public class ServiceEmployeTest {
	
	private static ClassPathXmlApplicationContext context;
	private static IServiceEmploye serviceEmploye;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
			context = new ClassPathXmlApplicationContext("app.xml");
			serviceEmploye =(IServiceEmploye)context.getBean("ServiceEmployeImpl");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		context.close();
	}

	@Test
	public void testAdd() {
		Employe e = new Employe(54L, "Jean");
		serviceEmploye.add(e);
		assertNotNull(e.getIdEmploye());
	}

	@Test
	public void testGetOne() {
		Employe e = serviceEmploye.getOne(1L);
		assertTrue(e != null);
	}

	@Test
	public void testGetAll() {
		List<Employe> employes =serviceEmploye.getAll();
		assertTrue(employes.size()>0);
	}

	@Test
	public void testUpdate() {
		Employe e1 = serviceEmploye.getOne(1L);
		e1.setNom("nommodif");
		serviceEmploye.update(e1);
		Employe e2 = serviceEmploye.getOne(1L);
		Assert.assertThat("nommodif", IsEqual.equalTo(e2.getNom()));
	}

	@Test
	public void testDelete() {
		List<Employe> employes = serviceEmploye.getAll();
		serviceEmploye.delete(1L);
		List<Employe> employes2 = serviceEmploye.getAll();
		assertTrue(employes.size()-1 == employes2.size());
	}

}
