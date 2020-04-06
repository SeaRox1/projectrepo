/***********************************************************************
 * Module:  Etudier.java
 * Author:  hp
 * Purpose: Defines the Class Etudier
 ***********************************************************************/
package model;
import java.util.*;

/** @pdOid af08190b-4999-4721-8e6d-6c156a65d147 */
public class Etudier {
	public int idClasseEtudier;
	public int idSalleEtudier;
	public java.lang.String nominationEtudier;
	public int idCoursEtudier;
	public java.lang.String matiereEtudier;
	private int idPeriodeEtudier;
	public int getIdClasseEtudier() {
		return idClasseEtudier;
	}
	public void setIdClasseEtudier(int idClasseEtudier) {
		this.idClasseEtudier = idClasseEtudier;
	}
	public int getIdSalleEtudier() {
		return idSalleEtudier;
	}
	public void setIdSalleEtudier(int idSalleEtudier) {
		this.idSalleEtudier = idSalleEtudier;
	}
	public java.lang.String getNominationEtudier() {
		return nominationEtudier;
	}
	public void setNominationEtudier(java.lang.String nominationEtudier) {
		this.nominationEtudier = nominationEtudier;
	}
	public int getIdCoursEtudier() {
		return idCoursEtudier;
	}
	public void setIdCoursEtudier(int idCoursEtudier) {
		this.idCoursEtudier = idCoursEtudier;
	}
	public java.lang.String getMatiereEtudier() {
		return matiereEtudier;
	}
	public void setMatiereEtudier(java.lang.String matiereEtudier) {
		this.matiereEtudier = matiereEtudier;
	}
	public int getIdPeriodeEtudier() {
		return idPeriodeEtudier;
	}
	public void setIdPeriodeEtudier(int idPeriodeEtudier) {
		this.idPeriodeEtudier = idPeriodeEtudier;
	}
}