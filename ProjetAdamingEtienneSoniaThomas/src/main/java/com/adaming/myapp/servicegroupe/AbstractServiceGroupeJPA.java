/*
 * AbstractServiceGroupeJPA
 * Version: 1.0.0
 * Date: 22/11/2016
 * Author: S. Ferhaten - E. Lorteau - T. Saint Georges
 */

package com.adaming.myapp.servicegroupe;

import java.util.List;

import com.adaming.myapp.daogroupe.IDaoGroupe;
import com.adaming.myapp.entities.Employe;
import com.adaming.myapp.entities.Groupe;
import com.adaming.myapp.service.AbstractServiceGeneriqueJPA;

public class AbstractServiceGroupeJPA extends AbstractServiceGeneriqueJPA<Groupe> {

	private IDaoGroupe daoGroupe;	
	
	//=============================
	//    Setter
	//=============================
	
	public void setDaogroupe(IDaoGroupe daoGroupe) {
		this.daoGroupe = daoGroupe;
	}
	
	//======================================================
	// r�d�finition des m�thodes sp�ciques de IDaoGroupe 
	//======================================================
	
	public Groupe addEmToGrAbstract(Long idGroupe, Long idEmploye) {
		return daoGroupe.addEmToGr(idGroupe, idEmploye);
	}
	
	public List <Employe> getEmployeByGroupeAbstract(Long idGroupe) {
		return daoGroupe.getEmployeByGroupe(idGroupe);
	}
	
}
