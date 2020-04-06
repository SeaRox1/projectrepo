/***********************************************************************
 * Module:  Classe.java
 * Author:  hp
 * Purpose: Defines the Class Classe
 ***********************************************************************/
package model;
import java.util.*;

/** @pdOid ebc4d1d8-d14b-41ca-9c3a-4ae9f63b8e14 */
public class Classe {
   /** @pdOid 785bdea7-d436-4299-92e7-765e36212c17 */
   public int idClasse;
   /** @pdOid 3b30f711-4ab8-4170-8635-1f4dffc71582 */
   public int niveauScolaire;
   /** @pdOid 3c896307-a2d4-4664-9d14-d39a0802c908 */
   public int numero;
   /** @pdOid 081c8f5d-cdba-4e81-b51f-722b4c8e5d45 */
   public int nombreD_eleves;
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