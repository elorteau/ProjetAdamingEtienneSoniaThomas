/*
 * AbstractDaoEmployeJPA
 * Version: 1.0.0
 * Date: 25/11/2016
 * Author: S. Ferhaten - E. Lorteau - T. Saint Georges
 */

package com.adaming.myapp.controller;

import java.util.List;

import javax.inject.Inject;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.adaming.myapp.entities.Employe;
import com.adaming.myapp.model.GestionGroupeModel;
import com.adaming.myapp.servicegroupe.IServiceGroupe;

@Controller
public class GestionGroupeController {

	//=========================
	// Attributes
	//=========================
	
	@Inject
	private IServiceGroupe serviceGroupe;
	private final Logger LOGGER = Logger.getLogger("groupeController");

	//=========================
	// Methods
	//=========================
	
	@RequestMapping(value="/printEmployeByGroupe", method = RequestMethod.GET)
	public String getEmployeByGroupe(Model model, GestionGroupeModel groupeModel){
		Long idGroupe = groupeModel.getSelectedGroupe();
		List<Employe> employes =  serviceGroupe.getEmployeByGroupe(idGroupe);
		groupeModel.setEmployes(employes);
		groupeModel.setGroupes(serviceGroupe.getAll());
		model.addAttribute("gestionGroupeModel", groupeModel);
		return "gestionGroupe";
	}

}
