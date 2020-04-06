/***********************************************************************
 * Module:  Salle.java
 * Author:  hp
 * Purpose: Defines the Class Salle
 ***********************************************************************/
package model;
import java.util.*;

/** @pdOid 3fc12d8a-526a-42d7-8846-d3f287886d8a */
public class Salle {
   /** @pdOid bf8fc78b-54fa-4d54-8909-70642e090c49 */
   public int idSalle;
   /** @pdOid 295f3d13-54a3-4a50-94bb-f70caeb8ab6d */
   public java.lang.String nomination;
   /** @pdOid fec38ba0-5e29-4046-9f1f-e599dd3c1bf0 */
   public int capacite;
   /** @pdOid b0d83532-32df-496d-a808-16e816576fe3 */
   public boolean salleDeSport;
   /** @pdOid 2dcb4dc1-ba2a-455b-ac1f-349568cafb90 */
   public boolean salleDeLaboratoire;
   /** @pdOid 03093711-a78d-45bb-ad30-479e287add85 */
   public boolean salleEquipeeDeRideauxNoirsEtPojecteursVideo;
public int getIdSalle() {
	return idSalle;
}
public void setIdSalle(int idSalle) {
	this.idSalle = idSalle;
}
public java.lang.String getNomination() {
	return nomination;
}
public void setNomination(java.lang.String nomination) {
	this.nomination = nomination;
}
public int getCapacite() {
	return capacite;
}
public void setCapacite(int capacite) {
	this.capacite = capacite;
}
public boolean isSalleDeSport() {
	return salleDeSport;
}
public void setSalleDeSport(boolean salleDeSport) {
	this.salleDeSport = salleDeSport;
}
public boolean isSalleDeLaboratoire() {
	return salleDeLaboratoire;
}
public void setSalleDeLaboratoire(boolean salleDeLaboratoire) {
	this.salleDeLaboratoire = salleDeLaboratoire;
}
public boolean isSalleEquipeeDeRideauxNoirsEtPojecteursVideo() {
	return salleEquipeeDeRideauxNoirsEtPojecteursVideo;
}
public void setSalleEquipeeDeRideauxNoirsEtPojecteursVideo(boolean salleEquipeeDeRideauxNoirsEtPojecteursVideo) {
	this.salleEquipeeDeRideauxNoirsEtPojecteursVideo = salleEquipeeDeRideauxNoirsEtPojecteursVideo;
}

}