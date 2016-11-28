/*
 * AbstractDaoEmployeJPA
 * Version: 1.0.0
 * Date: 25/11/2016
 * Author: S. Ferhaten - E. Lorteau - T. Saint Georges
 */

package com.adaming.myapp.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.adaming.myapp.entities.Compte;
import com.adaming.myapp.model.GestionEmployeModel;
import com.adaming.myapp.servicecompte.IServiceCompte;
import com.adaming.myapp.serviceemployee.IServiceEmploye;

@Controller
public class GestionEmployeController {

	//=========================
	// Attributes
	//=========================
	
	@Inject
	private IServiceEmploye serviceGestionEmploye;
	private IServiceCompte serviceCompte;
	private final Logger LOGGER = Logger.getLogger("GestionEmploye");

	//=========================
	// Methods
	//=========================
	
	/*
	 * getbymc
	 */
	
	/*
	 * suppression employe
	 */
	@RequestMapping(value = "/gestionEmploye/deleteEmploye", method= RequestMethod.GET)
	public String deleteEmploye(GestionEmployeModel employeModel){
		serviceGestionEmploye.delete(employeModel.getIdEmploye());
		LOGGER.info("<-------------------Employe deleted----------------->");
		return "gestionEmploye";
	}
	
	
	/*
	 * afficher la liste de compte
	 */
	@RequestMapping(value ="/getComptesByEmploye", method=RequestMethod.GET)
	public String getComptesByEmploye(Model model, GestionEmployeModel gestionEmployeModel){
		gestionEmployeModel.setComptes(serviceCompte.getCompteByEmploye(gestionEmployeModel.getSelectedEmploye()));
		model.addAttribute("gestionEmployeModel", gestionEmployeModel);
		return "gestionEmploye";
	}

}
