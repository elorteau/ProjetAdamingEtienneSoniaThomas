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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.adaming.myapp.model.GestionBanqueModel;
import com.adaming.myapp.servicebanque.IServiceBanque;

@Controller
public class GestionBanqueController {

	//=========================
	// Attributes
	//=========================

	@Inject
	private IServiceBanque serviceBanque;
	private final Logger LOGGER = Logger.getLogger("GestionBanqueController");
	
	//=========================
	// Methods
	//=========================
	
	@RequestMapping(value = "/printBanqueEmploye", method = RequestMethod.GET)
	public String printBanqueEmploye(Model model, GestionBanqueModel gestionBanqueModel) {
		gestionBanqueModel.setEmployes(serviceBanque.getEmployeByBanque(gestionBanqueModel.getSelectedBanque().getIdBanque()));
		model.addAttribute("gestionBanqueModel", gestionBanqueModel);
		LOGGER.info("<-------------------- Print Employe list by Banque -------------------->");
		return "getionBanque";
	}

	@RequestMapping(value = "/printBanqueClient", method = RequestMethod.GET)
	public String printBanqueClient(Model model, GestionBanqueModel gestionBanqueModel) {
		gestionBanqueModel.setClients(serviceBanque.getClientByBanque(gestionBanqueModel.getSelectedBanque().getIdBanque()));
		model.addAttribute("gestionBanqueModel", gestionBanqueModel);
		LOGGER.info("<-------------------- Print Client list by Banque -------------------->");
		return "getionBanque";
	}

	@RequestMapping(value = "/printBanqueCompte", method = RequestMethod.GET)
	public String printBanqueCompte(Model model, GestionBanqueModel gestionBanqueModel) {
		gestionBanqueModel.setComptes(serviceBanque.getCompteByBanque(gestionBanqueModel.getSelectedBanque().getIdBanque()));
		model.addAttribute("gestionBanqueModel", gestionBanqueModel);
		LOGGER.info("<-------------------- Print Compte list by Banque -------------------->");
		return "getionBanque";
	}

}
