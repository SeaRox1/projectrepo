/***********************************************************************
 * Module:  Periode.java
 * Author:  hp
 * Purpose: Defines the Class Periode
 ***********************************************************************/
package model;
import java.util.*;

/** @pdOid a2620b86-1dcb-41a7-ad87-d663e3daf121 */
public class Periode {
   /** @pdOid 97aaab11-6c44-4d39-aabe-1945f8576727 */
   private int idPeriode;
   /** @pdOid 394ce759-7743-4491-8e40-adce8265415f */
   private char jour;
   /** @pdOid 7102a4a1-513d-4d52-8f2a-2f51e1a74c4c */
   private java.util.Date heureDebut;
   /** @pdOid d34378f3-1c53-4824-9f9a-c3986c94677c */
   private java.util.Date heureFin;
public int getIdPeriode() {
	return idPeriode;
}
public void setIdPeriode(int idPeriode) {
	this.idPeriode = idPeriode;
}
public char getJour() {
	return jour;
}
public void setJour(char jour) {
	this.jour = jour;
}
public java.util.Date getHeureDebut() {
	return heureDebut;
}
public void setHeureDebut(java.util.Date heureDebut) {
	this.heureDebut = heureDebut;
}
public java.util.Date getHeureFin() {
	return heureFin;
}
public void setHeureFin(java.util.Date heureFin) {
	this.heureFin = heureFin;
}

}