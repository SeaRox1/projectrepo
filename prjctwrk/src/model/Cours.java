/***********************************************************************
 * Module:  Cours.java
 * Author:  hp
 * Purpose: Defines the Class Cours
 ***********************************************************************/
package model;
import java.util.*;

/** @pdOid 8e219823-44a3-44e7-b51a-61061a79cf44 */
public class Cours {
   /** @pdOid 6b4cdbc2-6548-4c62-8664-277d310957b4 */
   public int idCours;
   /** @pdOid c0e1157c-4c73-4cfb-b246-e4319b8fb34d */
   public java.lang.String matiere;
   /** @pdOid 9b54baa4-2ba9-4c50-a29a-932a35c232cd */
   public boolean sport;
   /** @pdOid 9c8f0dea-10db-497b-9355-4f28710b1816 */
   public boolean labo;
   /** @pdOid 9845e8d7-549d-45d9-b700-e28eafb4a6bb */
   public boolean video;
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