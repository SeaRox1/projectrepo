package prjctwrk;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Vector;

import model.Classe;
import model.Cours;
import model.Enseigant;
import model.Etudier;

public class Connect {

	Connection cnx = null; // Créer une cnx (lien) vers une base de données
	Statement st; // Pour envoyer et exécuter des requêtes sql
	ResultSet rs; // récupération des résultats

	public Connect() {
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

	public void InsertPeriods() {
		try {
			st = cnx.createStatement();
			st.executeUpdate("INSERT INTO `periode` (`id_periode`, `jour`, `heureDebut`, `heureFin`) VALUES\r\n"
					+ "(1, 'Lundi', '08:30:00', '09:30:00'),\r\n" + "(2, 'Lundi', '09:30:00', '10:30:00'),\r\n"
					+ "(3, 'Lundi', '10:30:00', '11:30:00'),\r\n" + "(4, 'Lundi', '11:30:00', '12:30:00'),\r\n"
					+ "(5, 'Lundi', '14:30:00', '15:30:00'),\r\n" + "(6, 'Lundi', '15:30:00', '16:30:00'),\r\n"
					+ "(7, 'Lundi', '16:30:00', '17:30:00'),\r\n" + "(8, 'Lundi', '17:30:00', '18:30:00'),\r\n"
					+ "(9, 'Mardi', '08:30:00', '09:30:00'),\r\n" + "(10, 'Mardi', '09:30:00', '10:30:00'),\r\n"
					+ "(11, 'Mardi', '10:30:00', '11:30:00'),\r\n" + "(12, 'Mardi', '11:30:00', '12:30:00'),\r\n"
					+ "(13, 'Mardi', '14:30:00', '15:30:00'),\r\n" + "(14, 'Mardi', '15:30:00', '16:30:00'),\r\n"
					+ "(15, 'Mardi', '16:30:00', '17:30:00'),\r\n" + "(16, 'Mardi', '17:30:00', '18:30:00'),\r\n"
					+ "(17, 'Mercredi', '08:30:00', '09:30:00'),\r\n" + "(18, 'Mercredi', '09:30:00', '10:30:00'),\r\n"
					+ "(19, 'Mercredi', '10:30:00', '11:30:00'),\r\n" + "(20, 'Mercredi', '11:30:00', '12:30:00'),\r\n"
					+ "(21, 'Mercredi', '14:30:00', '15:30:00'),\r\n" + "(22, 'Mercredi', '15:30:00', '16:30:00'),\r\n"
					+ "(23, 'Mercredi', '16:30:00', '17:30:00'),\r\n" + "(24, 'Mercredi', '17:30:00', '18:30:00'),\r\n"
					+ "(25, 'Jeudi', '08:30:00', '09:30:00'),\r\n" + "(26, 'Jeudi', '09:30:00', '10:30:00'),\r\n"
					+ "(27, 'Jeudi', '10:30:00', '11:30:00'),\r\n" + "(28, 'Jeudi', '11:30:00', '12:30:00'),\r\n"
					+ "(29, 'Jeudi', '14:30:00', '15:30:00'),\r\n" + "(30, 'Jeudi', '15:30:00', '16:30:00'),\r\n"
					+ "(31, 'Jeudi', '16:30:00', '17:30:00'),\r\n" + "(32, 'Jeudi', '17:30:00', '18:30:00'),\r\n"
					+ "(33, 'Vendredi', '08:30:00', '09:30:00'),\r\n" + "(34, 'Vendredi', '09:30:00', '10:30:00'),\r\n"
					+ "(35, 'Vendredi', '10:30:00', '11:30:00'),\r\n" + "(36, 'Vendredi', '11:30:00', '12:30:00'),\r\n"
					+ "(37, 'Vendredi', '14:30:00', '15:30:00'),\r\n" + "(38, 'Vendredi', '15:30:00', '16:30:00'),\r\n"
					+ "(39, 'Vendredi', '16:30:00', '17:30:00'),\r\n" + "(40, 'Vendredi', '17:30:00', '18:30:00'),\r\n"
					+ "(41, 'Samedi', '08:30:00', '09:30:00'),\r\n" + "(42, 'Samedi', '09:30:00', '10:30:00'),\r\n"
					+ "(43, 'Samedi', '10:30:00', '11:30:00'),\r\n" + "(44, 'Samedi', '11:30:00', '12:30:00');\r\n");
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
			for (int i = 0; i < 4; i++) {
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
		Vector v = new Vector();
		Etudier ee = new Etudier();
		try {
			st = cnx.createStatement();
			rs = st.executeQuery("select * from etudier");
			while (rs.next()) {
				ee.setIdSalleEtudier(rs.getInt("id_salle"));
				ee.setIdPeriodeEtudier(rs.getInt("idPeriode"));
				ee.setIdCoursEtudier(rs.getInt("id_cours"));
				ee.setIdClasseEtudier(rs.getInt("id_classe"));
				v.add(ee);
			}
			for (int i = 0; i < v.size(); i++) {

				System.out.println("salle " + ee.getIdSalleEtudier() + "  periode  " + ee.getIdPeriodeEtudier()
						+ " cours " + ee.getIdCoursEtudier() + "  Classe  " + ee.getIdClasseEtudier());
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Mission Failed");
			e.printStackTrace();
		}
		return v;

	}

	public String getCoursClasse(int salle, int periode) {

		Etudier ee1 = new Etudier();
		String q = null;

		try {

			st = cnx.createStatement();
			rs = st.executeQuery("select * from etudier where id_salle=" + salle + " and idPeriode=" + periode);
			if (rs.next()) {

				ee1.setIdCoursEtudier(rs.getInt("id_cours"));
				ee1.setIdClasseEtudier(rs.getInt("id_classe"));

				int a = ee1.getIdCoursEtudier();
				int b = ee1.getIdClasseEtudier();
				q = "Cours " + String.valueOf(a) + "Salle " + String.valueOf(b);

			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return q;

	}

	public Vector ListerClasses() {
		Classe cc = new Classe();
		Vector w = new Vector<>();
		String x = null;
		Vector y = new Vector<>();

		try {
			st = cnx.createStatement();
			rs = st.executeQuery("select niveau_scolaire, numero from classe");
			while (rs.next()) {
				cc.setNiveauScolaire(rs.getInt("niveau_scolaire"));
				cc.setNumero(rs.getInt("numero"));
				w.add(cc);
			}
			for (int i = 0; i < w.size(); i++) {
				System.out.println(cc.getNumero());
				x = cc.getNiveauScolaire() + "ème " + cc.getNumero();
				y.add(x);

			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return y;

	}

	public Vector ListerCours() {
		Cours co = new Cours();
		Enseigant tc = new Enseigant();
		Vector w = new Vector<Object>();
		String x = null;
		Vector y = new Vector<>();

		try {
			st = cnx.createStatement();
			rs = st.executeQuery(
					"select cours.matiere, enseigant.nom_enseignant, enseigant.prenom_enseignant from cours, enseigant");
			while (rs.next()) {
				co.setMatiere(rs.getString("matiere"));
				tc.setNomEnseignant(rs.getString("nom_enseignant"));
				tc.setPrenomEnseignant(rs.getString("prenom_enseignant"));
				System.out.println("mat " + co.getMatiere() + "  teacher " + tc.getNomEnseignant() + " "
						+ tc.getPrenomEnseignant());
				x = co.getMatiere() + ", " + tc.getNomEnseignant() + " " + tc.getPrenomEnseignant();
				y.add(x);
				// w.addElement(co);
				// w.addElement(tc);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return y;

	}

	public void OccuperSallePeriode(String classe, int salle, String coursEnseignant, int periode) {
		String matiere = coursEnseignant.substring(0, coursEnseignant.indexOf(","));
		String profNom = coursEnseignant.substring(coursEnseignant.indexOf(",") + 2, coursEnseignant.lastIndexOf(" "));
		String profPrenom = coursEnseignant.substring(coursEnseignant.lastIndexOf(" ") + 1, coursEnseignant.length());

		String niveau = classe.substring(0, 1);
		String numniveau = classe.substring(classe.lastIndexOf(" ") + 1);
		System.out.println("classe '" + classe + "' | salle '" + salle + "'  | coursEnseignant  '" + coursEnseignant
				+ "'  | periode '" + periode);
		System.out.println("substring test: profPrenom  " + profPrenom + " profNom " + profNom + " niveau " + niveau
				+ " numniveau " + numniveau);
		try {

			st = cnx.createStatement();
			st.executeUpdate(
					"insert into etudier (id_classe, id_salle, id_enseignant, id_cours, idPeriode) select classe.id_classe, salle.id_salle, enseigant.id_enseignant, cours.id_cours, periode.id_periode from classe, salle, enseigant, cours, periode where classe.niveau_scolaire="
							+ niveau + " and classe.numero=" + numniveau + " and salle.nomination=" + salle
							+ " and enseigant.nom_enseignant='" + profNom + "' and enseigant.prenom_enseignant='"
							+ profPrenom + "' and cours.matiere='" + matiere + "' and periode.id_periode=" + periode);
			System.out.println("etudier entry entered");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
