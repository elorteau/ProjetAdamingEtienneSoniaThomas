/*
 * AbstractServiceOperationJPA
 * Version: 1.0.0
 * Date: 22/11/2016
 * Author: S. Ferhaten - E. Lorteau - T. Saint Georges
 */

package com.adaming.myapp.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.adaming.myapp.entities.Banque;
import com.adaming.myapp.entities.Client;
import com.adaming.myapp.entities.Compte;
import com.adaming.myapp.entities.Employe;
import com.adaming.myapp.servicebanque.IServiceBanque;

public class ServiceBanqueTest {

    private static ClassPathXmlApplicationContext context;
    private static IServiceBanque serviceBanque;
    
    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        context = new ClassPathXmlApplicationContext("app.xml");
        serviceBanque = (IServiceBanque) context.getBean("ServiceBanqueImpl");
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
        context.close();
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
        Banque b = serviceBanque.getOne(1L);
        assertNotNull(b);
        
    }

    @Test
    public void testGetAll() {
        List<Banque> banques = serviceBanque.getAll();
        assertNotNull(banques);
        
        
    }

    @Test
    public void testUpdate() {
        Banque b = serviceBanque.getOne(1L);
        Banque b1 = b;
        serviceBanque.update(b);
        assertNotSame("les deux objets sont differents", b1, b);
    }

    @Test
    public void testDelete() {
        List<Banque> banques = serviceBanque.getAll();
        int s1= banques.size();
        serviceBanque.delete(1L);
        int s2 = banques.size();
        assert(s1-s2==1);
        
    }

    @Test
    public void testGetEmployeByBanque() {
        List<Employe> employes = serviceBanque.getEmployeByBanque(1L);
        assertNotNull(employes);
    }

    @Test
    public void testGetClientByBanque() {
        List<Client> clients = serviceBanque.getClientByBanque(1L);
        assertNotNull(clients);
    }

    @Test
    public void testGetCompteByBanque() {
        List<Compte> comptes = serviceBanque.getCompteByBanque(1L);
        assertNotNull(comptes);
    }

}
