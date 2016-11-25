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
@RequestMapping(value="/gestionBanque")
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
	
	@RequestMapping(value = "/printBanque", method = RequestMethod.GET)
	public String printBanque(Model model, GestionBanqueModel gestionBanqueModel) {
		String action = gestionBanqueModel.getAction();

		if (action.equals("employes")) {
			gestionBanqueModel.setEmployes(serviceBanque.getEmployeByBanque(gestionBanqueModel.getSelectedBanque()));
			model.addAttribute("gestionBanqueModel", gestionBanqueModel);
			LOGGER.info("<-------------------- Print Employe list by Banque -------------------->");
			return "printBanqueEmployes";
		}
		else if (action.equals("clients")) {
			gestionBanqueModel.setClients(serviceBanque.getClientByBanque(gestionBanqueModel.getSelectedBanque()));
			model.addAttribute("gestionBanqueModel", gestionBanqueModel);
			LOGGER.info("<-------------------- Print Client list by Banque -------------------->");
			return "printBanqueClients";
		}
		else if (action.equals("comptes")) {
			gestionBanqueModel.setComptes(serviceBanque.getCompteByBanque(gestionBanqueModel.getSelectedBanque()));
			model.addAttribute("gestionBanqueModel", gestionBanqueModel);
			LOGGER.info("<-------------------- Print Compte list by Banque -------------------->");
			return "printBanqueComptes";
		}
		return "redirect:/";
	}

}
