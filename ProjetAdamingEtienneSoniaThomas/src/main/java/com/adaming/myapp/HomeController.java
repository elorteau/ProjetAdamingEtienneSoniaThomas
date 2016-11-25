package com.adaming.myapp;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {

	private static final Logger LOGGER = LoggerFactory
			.getLogger(HomeController.class);

	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		LOGGER.info("Welcome home! The client locale is {}.", locale);

		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG,
				DateFormat.LONG, locale);

		String formattedDate = dateFormat.format(date);
		// comments
		model.addAttribute("serverTime", formattedDate);

		return "home";

	}

	// ============================
	// Home
	// ============================

	@RequestMapping(value = "/toHome", method = RequestMethod.GET)
	public String toHome() {
		LOGGER.info("<-----------toHome-------------->");
		return "redirect:/";
	}

	// ============================
	// Banque
	// ============================

	@RequestMapping(value = "/toAddBanque", method = RequestMethod.GET)
	public String toAddBanque() {
		LOGGER.info("<-----------toAddBnaque-------------->");
		return "addBanque";
	}

	@RequestMapping(value = "/toGestionBanque", method = RequestMethod.GET)
	public String toGestionBanque() {
		LOGGER.info("<-----------toGestionBanque-------------->");
		return "gestionBanque";
	}

	// ============================
	// Client
	// ============================

	@RequestMapping(value = "/toAddClient", method = RequestMethod.GET)
	public String toAddClient() {
		LOGGER.info("<-----------toAddClient-------------->");
		return "addClient";
	}

	@RequestMapping(value = "/toGestionClient", method = RequestMethod.GET)
	public String toGestionClient() {
		LOGGER.info("<-----------toGestionClient-------------->");
		return "gestionClient";
	}

	// ============================
	// Employe
	// ============================

	@RequestMapping(value = "/toAddEmploye", method = RequestMethod.GET)
	public String toAddEmploye() {
		LOGGER.info("<-----------toAddEmploye-------------->");
		return "addEmploye";
	}

	@RequestMapping(value = "/toGestionEmploye", method = RequestMethod.GET)
	public String toGestionEmploye() {
		LOGGER.info("<-----------toGestionEmploye-------------->");
		return "gestionEmploye";
	}

	// ============================
	// Groupe
	// ============================

	@RequestMapping(value = "/toAddGroupe", method = RequestMethod.GET)
	public String toAddGroupe() {
		LOGGER.info("<-----------toAddGroupe-------------->");
		return "addGroupe";
	}

	@RequestMapping(value = "/toGestionGroupe", method = RequestMethod.GET)
	public String toGestionGroupe() {
		LOGGER.info("<-----------toGestionGroupe-------------->");
		return "gestionGroupe";
	}

}
