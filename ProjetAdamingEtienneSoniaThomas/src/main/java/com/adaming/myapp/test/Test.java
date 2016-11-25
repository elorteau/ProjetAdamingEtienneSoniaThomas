package com.adaming.myapp.test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;

import java.util.Date;

import org.hamcrest.core.IsEqual;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.adaming.myapp.entities.*;
import com.adaming.myapp.servicebanque.IServiceBanque;
import com.adaming.myapp.serviceclient.IServiceClient;
import com.adaming.myapp.serviceclient.ServiceClientImpl;
import com.adaming.myapp.servicecompte.IServiceCompte;
import com.adaming.myapp.serviceemployee.IServiceEmploye;
import com.adaming.myapp.serviceoperation.IServiceOperation;

public class Test {
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("app.xml");
		IServiceCompte serviceCompte = (IServiceCompte)context.getBean("ServiceCompteImpl");
		Employe employe = new Employe(456L, "nomda");
		IServiceEmploye serviceEmploye = (IServiceEmploye)context.getBean("ServiceEmployeImpl");
		serviceEmploye.add(employe);
		Compte compte = new CompteCourant(0L, 156.0, new Date(), 0.0);
		serviceCompte.add(compte);
		serviceCompte.addCompteToEmploye(compte.getIdCompte(), employe.getIdEmploye());
		System.out.println(serviceCompte.getCompteByEmploye(employe.getIdEmploye()));
		
	}

}
