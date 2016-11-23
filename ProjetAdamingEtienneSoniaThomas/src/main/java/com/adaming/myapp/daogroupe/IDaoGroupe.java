/*
 * IDaoGroupe
 * Version: 1.0.0
 * Date: 22/11/2016
 * Author: S. Ferhaten - E. Lorteau - T. Saint Georges
 */

package com.adaming.myapp.daogroupe;

import java.util.List;

import com.adaming.myapp.dao.IDaoGenerique;
import com.adaming.myapp.entities.Employe;
import com.adaming.myapp.entities.Groupe;

public interface IDaoGroupe extends IDaoGenerique<Groupe> {
	 Groupe addEmToGr(Long idGroupe, Long idEmploye);
	 List <Employe> getEmployeByGroupe(Long idGroupe);

}
