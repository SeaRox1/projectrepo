/***********************************************************************
 * Module:  Classe.java
 * Author:  hp
 * Purpose: Defines the Class Classe
 ***********************************************************************/
package model;
import java.util.*;

/** @pdOid ebc4d1d8-d14b-41ca-9c3a-4ae9f63b8e14 */
public class Classe {
	   /** @pdOid 1d8ec67b-f8d9-4099-965d-b643aa2458d4 */
	   private int idClasse;
	   /** @pdOid c2d2c2db-73d5-48bb-bfb4-ae7ad3b7354a */
	   private int niveauScolaire;
	   /** @pdOid 82666388-eddf-4e33-ae48-2d6925ab940b */
	   private int numero;
	   /** @pdOid 82c5b35f-a9b7-4880-8777-31ae9a33cfb1 */
	   private int nombreD_eleves;
	   
public int getIdClasse() {
	return idClasse;
}
public void setIdClasse(int idClasse) {
	this.idClasse = idClasse;
}
public int getNiveauScolaire() {
	return niveauScolaire;
}
public void setNiveauScolaire(int niveauScolaire) {
	this.niveauScolaire = niveauScolaire;
}
public int getNumero() {
	return numero;
}
public void setNumero(int numero) {
	this.numero = numero;
}
public int getNombreD_eleves() {
	return nombreD_eleves;
}
public void setNombreD_eleves(int nombreD_eleves) {
	this.nombreD_eleves = nombreD_eleves;
}

}