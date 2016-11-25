/*
 * IServiceClient
 * Version: 1.0.0
 * Date: 22/11/2016
 * Author: S. Ferhaten - E. Lorteau - T. Saint Georges
 */

package com.adaming.myapp.serviceclient;

import java.util.List;

import com.adaming.myapp.entities.Client;
import com.adaming.myapp.entities.Compte;
import com.adaming.myapp.service.IServiceGenerique;

public interface IServiceClient extends IServiceGenerique<Client> {
	 List<Compte> getCompteByClient(Long idClient);
	 List<Client> getClientByMc(String MC);
	 Client addClientToBanque(Long idClient, Long idBanque);
	 
}
