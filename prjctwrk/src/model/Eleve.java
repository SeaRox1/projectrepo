/***********************************************************************
 * Module:  Eleve.java
 * Author:  hp
 * Purpose: Defines the Class Eleve
 ***********************************************************************/
package model;
import java.util.*;

/** @pdOid 95dac953-7991-4d46-b0a3-016b4214cc36 */
public class Eleve {
	  /** @pdOid ee2a931c-75a3-46a4-97f1-5e2ff7d6f76b */
	   private int idEleve;
	   /** @pdOid 7b9f8924-ea26-499b-9eed-b050b82cfff1 */
	   private java.lang.String nomEleve;
	   /** @pdOid 546b451a-ecd2-4c78-aa0f-ec24a473bbe1 */
	   private java.lang.String prenomEleve;
	   /** @pdOid a19ec93e-16e3-469c-ae55-cc72d341700a */
	   private java.util.Date dateDeNaissance;
	   /** @pdOid 83db3d51-bfdd-4bc5-b8d1-dc383c9a901d */
	   private java.lang.String numTelephoneEleve;
	   /** @pdOid 5f079e36-761f-4e1b-ab7e-24ecb3a7511c */
	   private java.lang.String adresseEleve;
public int getIdEleve() {
	return idEleve;
}
public void setIdEleve(int idEleve) {
	this.idEleve = idEleve;
}
public java.lang.String getNomEleve() {
	return nomEleve;
}
public void setNomEleve(java.lang.String nomEleve) {
	this.nomEleve = nomEleve;
}
public java.lang.String getPrenomEleve() {
	return prenomEleve;
}
public void setPrenomEleve(java.lang.String prenomEleve) {
	this.prenomEleve = prenomEleve;
}
public java.util.Date getDateDeNaissance() {
	return dateDeNaissance;
}
public void setDateDeNaissance(java.util.Date dateDeNaissance) {
	this.dateDeNaissance = dateDeNaissance;
}
public java.lang.String getNumTelephoneEleve() {
	return numTelephoneEleve;
}
public void setNumTelephoneEleve(java.lang.String numTelephoneEleve) {
	this.numTelephoneEleve = numTelephoneEleve;
}
public java.lang.String getAdresseEleve() {
	return adresseEleve;
}
public void setAdresseEleve(java.lang.String adresseEleve) {
	this.adresseEleve = adresseEleve;
}

}