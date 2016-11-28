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

import com.adaming.myapp.entities.Retrait;
import com.adaming.myapp.entities.Versement;
import com.adaming.myapp.entities.Virement;
import com.adaming.myapp.model.GestionCompteModel;
import com.adaming.myapp.servicecompte.IServiceCompte;
import com.adaming.myapp.serviceoperation.IServiceOperation;

@Controller
@RequestMapping(value = "toCompte/")
public class GestionCompteController {

	//=========================
	// Attributes
	//=========================
	
	@Inject
	private IServiceCompte serviceCompte;
	@Inject
	private IServiceOperation serviceOperation;
	private final Logger LOGGER = Logger.getLogger("ComptesClientController");
	
	//=========================
	// Methods
	//=========================
	
	@RequestMapping(value = "deleteCompte/{idCompte}", method = RequestMethod.GET)
	public String deleteCompte(Model model, @PathVariable Long idCompte) {
		serviceCompte.delete(idCompte);
		LOGGER.info("<---------------------- delete Compte ------------------------>");
		return "home";
	}
	
	@RequestMapping(value = "doVersement/{idCompte}", method = RequestMethod.GET)
	public String doVersement(Model model, GestionCompteModel gestionCompteModel, @PathVariable Long idCompte) {
		Versement versement = new Versement(gestionCompteModel.getDateOperation(), gestionCompteModel.getMontantOperation());
		serviceOperation.doVersement(versement, idCompte);
		model.addAttribute("gestionCompteModel", gestionCompteModel);
		LOGGER.info("<----------------Versement added---------------->");
		return "gestionCompte";
	}
	
	@RequestMapping(value ="doRetrait/{idCompte}", method = RequestMethod.GET)
	public String doRetrait(Model model, GestionCompteModel gestionCompteModel, @PathVariable Long idCompte){
		Retrait retrait = new Retrait(gestionCompteModel.getDateOperation(), gestionCompteModel.getMontantOperation());
		serviceOperation.doRetrait(retrait, idCompte);
		model.addAttribute("gestionCompteModel", gestionCompteModel);
		LOGGER.info("<-----------------Retrait added-------------->");
		return"gestionCompte";
	}
	
	@RequestMapping(value ="doVirement/{idCompte}", method = RequestMethod.GET)
	public String doVirement(Model model, GestionCompteModel gestionCompteModel, @PathVariable Long idCompte){
		Virement virement = new Virement(gestionCompteModel.getDateOperation(), gestionCompteModel.getMontantOperation());
		Long idCompteCredite = gestionCompteModel.getCompteCible().getIdCompte();
		serviceOperation.doVirement(virement, idCompte, idCompteCredite);
		model.addAttribute("gestionCompteModel", gestionCompteModel);
		LOGGER.info("<------------------Virement added----------------->");		
		return "gestionCompte";
	}
	
	
}
