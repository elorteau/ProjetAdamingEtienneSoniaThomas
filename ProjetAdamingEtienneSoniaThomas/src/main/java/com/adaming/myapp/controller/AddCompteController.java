/*
 * AbstractDaoEmployeJPA
 * Version: 1.0.0
 * Date: 25/11/2016
 * Author: S. Ferhaten - E. Lorteau - T. Saint Georges
 */

package com.adaming.myapp.controller;



import javax.inject.Inject;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.adaming.myapp.entities.Compte;
import com.adaming.myapp.entities.CompteCourant;
import com.adaming.myapp.entities.CompteEpargne;
import com.adaming.myapp.model.AddCompteModel;
import com.adaming.myapp.servicecompte.IServiceCompte;

@Controller
public class AddCompteController {

	//=========================
	// Attributes
	//=========================
@Inject
private IServiceCompte serviceCompte;
private final Logger LOGGER = Logger.getLogger("CompteController");
	

	//=========================
	// Methods
	//=========================
@RequestMapping(value= "toAddCompte/addCompte/{idClient}", method = RequestMethod.GET)
public String addCompte(AddCompteModel compteModel, @PathVariable Long idClient){
	String action = compteModel.getAction();
	if(action.equals("courant")){
		
		Compte compteCourant = new CompteCourant(compteModel.getNumeroCompte(), compteModel.getSolde(), compteModel.getDateCreation(), compteModel.getDecouvert());
		serviceCompte.add(compteCourant);
		serviceCompte.addCompteToClient(compteCourant.getIdCompte(), idClient);
		LOGGER.info("<--------new compteCourant added-------------->");
		//serviceCompte.addCompteToClient(compteModel.getIdCompte(), compteModel.getClient().getIdClient());
		return "home";
	}
	if(action.equals("epargne")){
		Compte compteEpargne = new CompteEpargne(compteModel.getNumeroCompte(), compteModel.getSolde(), compteModel.getDateCreation(), compteModel.getTauxInteret());
		serviceCompte.add(compteEpargne);
		serviceCompte.addCompteToClient(compteEpargne.getIdCompte(), idClient);
		LOGGER.info("<--------new compteEpargne added-------------->");
		//serviceCompte.addCompteToClient(compteModel.getIdCompte(), compteModel.getClient().getIdClient());
		return "home";
	}
	return "redirect:/";
}
}
