package com.adaming.myapp.test;

import static org.junit.Assert.*;

import java.text.SimpleDateFormat;
import java.util.List;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.ParseException;

import com.adaming.myapp.entities.Client;
import com.adaming.myapp.entities.Compte;
import com.adaming.myapp.serviceclient.IServiceClient;

public class ServiceClientTest {
    private static ClassPathXmlApplicationContext context;
    private static IServiceClient serviceClient;

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        context = new ClassPathXmlApplicationContext("app.xml");
        serviceClient = (IServiceClient) context.getBean("ServiceClientImpl");
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
        context.close();
    }

    //===========================
    //  Les tests
    //===========================
    @Test
    public void testAdd() throws ParseException {
        SimpleDateFormat sf = new SimpleDateFormat("dd-MM-yyyy");
        Client client1 = null;
		try {
			client1 = new Client(123l, "ferhaten", "sonia", sf.parse("26-10-2016"), "paris");
		} catch (java.text.ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        serviceClient.add(client1);
        assertNotNull(client1.getIdClient());
    }

    @Test
    public void testGetOne() {
        Client c = serviceClient.getOne(1L);
        assertNotNull(c);
    }

    @Test
    public void testGetAll() {
        List<Client> clients = serviceClient.getAll();
        assertNotNull(clients);
    }

    @Test
    public void testUpdate() {
        Client c = serviceClient.getOne(1L);
        Client c1 = c;
        serviceClient.update(c);
        assertNotSame("les deux objets sont differents", c1, c);
    }

    @Test
    public void testDelete() {
        List<Client> clients = serviceClient.getAll();
        int c1= clients.size();
        serviceClient.delete(1L);
        int c2 = clients.size();
        assert(c1-c2==1);
        
    }

    @Test
    public void testGetClientByMc() {
    	
        List<Client> clients = serviceClient.getClientByMc("f");
        for(int i =0; i<clients.size(); i++){
            if(clients.get(i).getNom().contains("f")){
                i++;
                assert(true);
                
            }
        }
    }

    @Test
    public void testGetCompteByClient() {
        List<Compte> comptes = serviceClient.getCompteByClient(1L);
        assertNotNull(comptes);
    }

}