/***********************************************************************
 * Module:  Periode.java
 * Author:  hp
 * Purpose: Defines the Class Periode
 ***********************************************************************/
package model;
import java.util.*;

/** @pdOid a2620b86-1dcb-41a7-ad87-d663e3daf121 */
public class Periode {
	 /** @pdOid d43b6355-78c5-4e76-851f-e1d1748694f9 */
	   private int idPeriode;
	   /** @pdOid d79b9347-7bd5-4b93-9372-413778107fb5 */
	   private java.lang.String jour;
	   /** @pdOid c05f9d13-d930-4965-9eb7-1dd821d2e177 */
	   private java.util.Date heureDebut;
	   /** @pdOid 2e2c1222-d9f2-4a46-a4b6-fe5b4e5c65b8 */
	   private java.util.Date heureFin;
	public int getIdPeriode() {
		return idPeriode;
	}
	public void setIdPeriode(int idPeriode) {
		this.idPeriode = idPeriode;
	}
	public java.lang.String getJour() {
		return jour;
	}
	public void setJour(java.lang.String jour) {
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