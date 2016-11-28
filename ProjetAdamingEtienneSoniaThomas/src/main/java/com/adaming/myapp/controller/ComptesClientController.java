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

import com.adaming.myapp.model.GestionCompteModel;
import com.adaming.myapp.servicecompte.IServiceCompte;

@Controller
public class ComptesClientController {

	//=========================
	// Attributes
	//=========================
	
	@Inject
	private IServiceCompte serviceCompte;
	private final Logger LOGGER = Logger.getLogger("ComptesClientController");
	
	//=========================
	// Methods
	//=========================
	
	@RequestMapping(value = "/toCompte/{idCompte}", method = RequestMethod.GET)
	public String toCompte(Model model, @PathVariable Long idCompte) {
		GestionCompteModel gestionCompteModel = new GestionCompteModel();
		gestionCompteModel.setCompte(serviceCompte.getOne(idCompte));
		model.addAttribute("gestionCompteModel", gestionCompteModel);
		LOGGER.info("<-------------------- toCompte --------------------->");
		return "gestionCompte";
	}
	
	@RequestMapping(value = "/toAddCompte", method = RequestMethod.GET)
	public String toAddCompte(Model model) {
		LOGGER.info("<-------------------- to addCompte ------------------------->");
		return "addCompte";
	}

}
