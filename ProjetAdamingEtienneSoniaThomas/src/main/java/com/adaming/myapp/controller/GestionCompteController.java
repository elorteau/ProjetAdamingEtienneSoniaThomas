/*
 * AbstractDaoEmployeJPA
 * Version: 1.0.0
 * Date: 25/11/2016
 * Author: S. Ferhaten - E. Lorteau - T. Saint Georges
 */

package com.adaming.myapp.controller;

import java.util.logging.Logger;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.adaming.myapp.servicecompte.IServiceCompte;

@Controller
public class GestionCompteController {

	//=========================
	// Attributes
	//=========================
	
	@Inject
	private IServiceCompte serviceCompte;
	private final Logger LOGGER = Logger.getLogger("ComptesClientController");
	
	//=========================
	// Methods
	//=========================
	
	@RequestMapping(value = "toCompte/deleteCompte/{idCompte}", method = RequestMethod.GET)
	public String deleteCompte(Model model, @PathVariable Long idCompte) {
		serviceCompte.delete(idCompte);
		LOGGER.info("<---------------------- delete Compte ------------------------>");
		return "home";
	}
	
	@RequestMapping(value = "addOperation/{idCompte}", method = RequestMethod.GET)
	public String addOperation(Model model) {
		return "home";
	}
	
}
