/*
 * AbstractDaoEmployeJPA
 * Version: 1.0.0
 * Date: 25/11/2016
 * Author: S. Ferhaten - E. Lorteau - T. Saint Georges
 */

package com.adaming.myapp.model;

import java.util.List;

import com.adaming.myapp.entities.Employe;
import com.adaming.myapp.entities.Groupe;

public class GestionGroupeModel {
	
	//=========================
	// Attributes
	//=========================
	
	private Long idGroupe;
	private Long code;
	private String nom;
	
	private List<Groupe> groupes;
	private Long selectedGroupe;
	private List<Employe> employes;

	//=========================
	// Getter / Setter
	//=========================
	
	public List<Employe> getEmployes() {
		return employes;
	}
	public void setEmployes(List<Employe> employes) {
		this.employes = employes;
	}
	public Long getIdGroupe() {
		return idGroupe;
	}
	public void setIdGroupe(Long idGroupe) {
		this.idGroupe = idGroupe;
	}
	public Long getCode() {
		return code;
	}
	public void setCode(Long code) {
		this.code = code;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public List<Groupe> getGroupes() {
		return groupes;
	}
	public void setGroupes(List<Groupe> groupes) {
		this.groupes = groupes;
	}
	public Long getSelectedGroupe() {
		return selectedGroupe;
	}
	public void setSelectedGroupe(Long selectedGroupe) {
		this.selectedGroupe = selectedGroupe;
	}
	
	

	
	

}
