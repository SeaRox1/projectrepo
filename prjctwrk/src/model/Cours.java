/***********************************************************************
 * Module:  Cours.java
 * Author:  hp
 * Purpose: Defines the Class Cours
 ***********************************************************************/
package model;
import java.util.*;

/** @pdOid 8e219823-44a3-44e7-b51a-61061a79cf44 */
public class Cours {
	 /** @pdOid 99316259-098d-42be-b585-2436edd40f85 */
	   private int idCours;
	   /** @pdOid 29363f6b-5ee1-483e-98b2-f7d935df515c */
	   private java.lang.String matiere;
	   /** @pdOid efc761f9-c637-48d7-9340-65575b1759ac */
	   private boolean sport;
	   /** @pdOid aaa98f94-16d2-4c13-86a6-f0e48c6a59aa */
	   private boolean labo;
	   /** @pdOid 5aab50b9-c194-4038-8c3e-913833c42ac7 */
	   private boolean video;
public int getIdCours() {
	return idCours;
}
public void setIdCours(int idCours) {
	this.idCours = idCours;
}
public java.lang.String getMatiere() {
	return matiere;
}
public void setMatiere(java.lang.String matiere) {
	this.matiere = matiere;
}
public boolean isSport() {
	return sport;
}
public void setSport(boolean sport) {
	this.sport = sport;
}
public boolean isLabo() {
	return labo;
}
public void setLabo(boolean labo) {
	this.labo = labo;
}
public boolean isVideo() {
	return video;
}
public void setVideo(boolean video) {
	this.video = video;
}

}