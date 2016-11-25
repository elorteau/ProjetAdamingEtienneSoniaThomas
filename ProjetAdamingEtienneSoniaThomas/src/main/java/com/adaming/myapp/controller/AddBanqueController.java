/*
 * AbstractDaoEmployeJPA
 * Version: 1.0.0
 * Date: 25/11/2016
 * Author: S. Ferhaten - E. Lorteau - T. Saint Georges
 */

package com.adaming.myapp.controller;

import javax.inject.Inject;

import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.adaming.myapp.entities.Banque;
import com.adaming.myapp.model.AddBanqueModel;
import com.adaming.myapp.servicebanque.IServiceBanque;

public class AddBanqueController {

	//=========================
	// Attributes
	//=========================

	@Inject
	private IServiceBanque serviceBanque;
	private final Logger LOGGER = Logger.getLogger("BanqueController");
	
	//=========================
	// Methods
	//=========================

	 @RequestMapping(value = "/addBanque", method = RequestMethod.GET)
	 public String addBanque(AddBanqueModel banqueModel){
		 Banque banque = new Banque(banqueModel.getNom(), banqueModel.getAdresse(), banqueModel.getCodePostal());
		 serviceBanque.add(banque);
		 LOGGER.info("<--------------------new Banque added-------------------->");
		 return "redirect:/";
		 
	 }
}
