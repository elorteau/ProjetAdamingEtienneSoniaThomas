/*
 * IServiceGroupe
 * Version: 1.0.0
 * Date: 22/11/2016
 * Author: S. Ferhaten - E. Lorteau - T. Saint Georges
 */

package com.adaming.myapp.servicegroupe;

import java.util.List;

import com.adaming.myapp.entities.Employe;
import com.adaming.myapp.entities.Groupe;
import com.adaming.myapp.service.IServiceGenerique;

public interface IServiceGroupe extends IServiceGenerique<Groupe> {
	 Groupe addEmToGr(Long idGroupe, Long idEmploye);
	 List <Employe> getEmployeByGroupe(Long idGroupe);

}
