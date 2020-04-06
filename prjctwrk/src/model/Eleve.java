/***********************************************************************
 * Module:  Eleve.java
 * Author:  hp
 * Purpose: Defines the Class Eleve
 ***********************************************************************/
package model;
import java.util.*;

/** @pdOid 95dac953-7991-4d46-b0a3-016b4214cc36 */
public class Eleve {
   /** @pdOid 72350890-62dc-4f8b-9ff1-9f30f5def653 */
   public int idEleve;
   /** @pdOid fccaec19-ba4a-40e5-b193-0e14155909df */
   public java.lang.String nomEleve;
   /** @pdOid f2966a59-af5f-4fa4-beba-32a8c21bccce */
   public java.lang.String prenomEleve;
   /** @pdOid 8cdd9278-0542-4f32-a1e0-290eb2a57d76 */
   public java.util.Date dateDeNaissance;
   /** @pdOid 63f52ae2-95c1-49ec-b659-1acfecd1f4eb */
   public java.lang.String numTelephoneEleve;
   /** @pdOid 87b0e997-d204-4dc9-9283-87880cddc90c */
   public java.lang.String adresseEleve;
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