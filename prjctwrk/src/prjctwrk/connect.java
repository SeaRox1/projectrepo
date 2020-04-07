package prjctwrk;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;

import model.Etudier;

public class connect {

	Connection cnx = null; // Créer une cnx (lien) vers une base de données
	Statement st; // Pour envoyer et exécuter des requêtes sql
	ResultSet rs; // récupération des résultats

	public connect() {
		String chaine = "jdbc:mysql://localhost:3306/testbase1.4";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Chargé avec succès");
		} catch (ClassNotFoundException e1) {
			System.out.println("Problème driver");
			e1.printStackTrace();
		}
		try {
			cnx = DriverManager.getConnection(chaine, "root", "");
			System.out.println("Cnx avec succès");
		} catch (SQLException e1) {
			System.out.println("Problème cnx");
			e1.printStackTrace();
		}

	}
public void InsertPeriods(){
	try {
		st = cnx.createStatement();
		st.executeUpdate(
				"INSERT INTO `periode` (`id_periode`, `jour`, `heureDebut`, `heureFin`) VALUES\r\n" + 
				"(1, 'Lundi', '08:30:00', '09:30:00'),\r\n" + 
				"(2, 'Lundi', '09:30:00', '10:30:00'),\r\n" + 
				"(3, 'Lundi', '10:30:00', '11:30:00'),\r\n" + 
				"(4, 'Lundi', '11:30:00', '12:30:00'),\r\n" + 
				"(5, 'Lundi', '14:30:00', '15:30:00'),\r\n" + 
				"(6, 'Lundi', '15:30:00', '16:30:00'),\r\n" + 
				"(7, 'Lundi', '16:30:00', '17:30:00'),\r\n" + 
				"(8, 'Lundi', '17:30:00', '18:30:00'),\r\n" + 
				"(9, 'Mardi', '08:30:00', '09:30:00'),\r\n" + 
				"(10, 'Mardi', '09:30:00', '10:30:00'),\r\n" + 
				"(11, 'Mardi', '10:30:00', '11:30:00'),\r\n" + 
				"(12, 'Mardi', '11:30:00', '12:30:00'),\r\n" + 
				"(13, 'Mardi', '14:30:00', '15:30:00'),\r\n" + 
				"(14, 'Mardi', '15:30:00', '16:30:00'),\r\n" + 
				"(15, 'Mardi', '16:30:00', '17:30:00'),\r\n" + 
				"(16, 'Mardi', '17:30:00', '18:30:00'),\r\n" + 
				"(17, 'Mercredi', '08:30:00', '09:30:00'),\r\n" + 
				"(18, 'Mercredi', '09:30:00', '10:30:00'),\r\n" + 
				"(19, 'Mercredi', '10:30:00', '11:30:00'),\r\n" + 
				"(20, 'Mercredi', '11:30:00', '12:30:00'),\r\n" + 
				"(21, 'Mercredi', '14:30:00', '15:30:00'),\r\n" + 
				"(22, 'Mercredi', '15:30:00', '16:30:00'),\r\n" + 
				"(23, 'Mercredi', '16:30:00', '17:30:00'),\r\n" + 
				"(24, 'Mercredi', '17:30:00', '18:30:00'),\r\n" + 
				"(25, 'Jeudi', '08:30:00', '09:30:00'),\r\n" +
				"(26, 'Jeudi', '09:30:00', '10:30:00'),\r\n" + 
				"(27, 'Jeudi', '10:30:00', '11:30:00'),\r\n" + 
				"(28, 'Jeudi', '11:30:00', '12:30:00'),\r\n" + 
				"(29, 'Jeudi', '14:30:00', '15:30:00'),\r\n" + 
				"(30, 'Jeudi', '15:30:00', '16:30:00'),\r\n" + 
				"(31, 'Jeudi', '16:30:00', '17:30:00'),\r\n" + 
				"(32, 'Jeudi', '17:30:00', '18:30:00'),\r\n" + 
				"(33, 'Vendredi', '08:30:00', '09:30:00'),\r\n" + 
				"(34, 'Vendredi', '09:30:00', '10:30:00'),\r\n" + 
				"(35, 'Vendredi', '10:30:00', '11:30:00'),\r\n" + 
				"(36, 'Vendredi', '11:30:00', '12:30:00'),\r\n" + 
				"(37, 'Vendredi', '14:30:00', '15:30:00'),\r\n" + 
				"(38, 'Vendredi', '15:30:00', '16:30:00'),\r\n" + 
				"(39, 'Vendredi', '16:30:00', '17:30:00'),\r\n" + 
				"(40, 'Vendredi', '17:30:00', '18:30:00'),\r\n" + 
				"(41, 'Samedi', '08:30:00', '09:30:00'),\r\n" + 
				"(42, 'Samedi', '09:30:00', '10:30:00'),\r\n" + 
				"(43, 'Samedi', '10:30:00', '11:30:00'),\r\n" + 
				"(44, 'Samedi', '11:30:00', '12:30:00');\r\n" 
				);
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
	public void Add() {
		System.out.println("aa");

		try {
			System.out.println("bb");
			st = cnx.createStatement();
			for (int i = 0; i <4; i++) {
				if (i < 4) {
					st.executeUpdate("insert into periode (jour, heure_debut, heure_fin) values ('Samedi', " + (i + 8)
							+ "3000," + (i + 9) + "3000)");
					System.out.println("Enregistrement avec succès");
				}


			}

		} catch (

		SQLException e1) {
			System.out.println("Problème d'enregistrement");
			e1.printStackTrace();
		}

	}
	public Vector FetchCells() {
		Vector v=new Vector();
		Etudier ee=new Etudier();
		try {
			st = cnx.createStatement();
			rs=st.executeQuery("select * from etudier");
			while (rs.next()) {
				ee.setIdSalleEtudier(rs.getInt("id_salle"));
				ee.setIdPeriodeEtudier(rs.getInt("idPeriode"));
				ee.setIdCoursEtudier(rs.getInt("id_cours"));
				ee.setIdClasseEtudier(rs.getInt("id_classe"));
				v.add(ee);
			}
			for(int i=0; i<v.size();i++) {
				Etudier r=new Etudier();
				r=(Etudier) v.get(i);
				System.out.println("salle "+r.getIdSalleEtudier()+"  periode  "+r.getIdPeriodeEtudier()+" cours "+r.getIdCoursEtudier()+"  Classe  "+r.getIdClasseEtudier());
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Mission Failed");
			e.printStackTrace();
		}
		return v;
		
		
	
	}
	public String getCoursClasse(int salle, int periode){
		
		Etudier ee1=new Etudier();
		String q = null;

		try {
			
			st = cnx.createStatement();
			rs=st.executeQuery("select * from etudier where id_salle="+salle+" and idPeriode="+periode);
			if( rs.next()) {
			
				ee1.setIdCoursEtudier(rs.getInt("id_cours"));
				ee1.setIdClasseEtudier(rs.getInt("id_classe"));
				
				int a=ee1.getIdCoursEtudier();
				int b=ee1.getIdClasseEtudier();
				q="Cours "+ String.valueOf(a)+"Salle " +String.valueOf(b);
			
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return q;
		
	}

}
