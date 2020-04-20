package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import prjctwrk.Connect;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Miniwindow extends JFrame {

	Connect conx=new Connect();
	Fenetre f;
	private JPanel contentPane;
	

//	/**
//	 * Launch the application.
//	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					Miniwindow frame = new Miniwindow();
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Create the frame.
	 */
	public Miniwindow(int rowsalle, int colperiode, String jour, Fenetre v) {
		f=v;
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		System.out.println("miniwindow row  "+rowsalle+" periode  "+colperiode+" jour "+jour);
		
		
		
		
		
		JLabel lblNewLabel = new JLabel("Classe");
		contentPane.add(lblNewLabel);
		
		JComboBox comboBox = new JComboBox(conx.ListerClasses());
		contentPane.add(comboBox);
		
		JLabel lblNewLabel_1 = new JLabel("Cours");
		contentPane.add(lblNewLabel_1);
		
		JComboBox comboBox_1 = new JComboBox(conx.ListerCours());
		contentPane.add(comboBox_1);
		
		JButton btnNewButton = new JButton("ajouter");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String classe=String.valueOf(comboBox.getSelectedItem());
				String coursEnseignant=String.valueOf(comboBox_1.getSelectedItem());

				int realPeriode = 0;
				if(jour=="Lundi")
					realPeriode=colperiode;
				if(jour=="Mardi")
					realPeriode=colperiode+8;
				if(jour=="Mercredi")
					realPeriode=colperiode+16;
				if(jour=="Jeudi")
					realPeriode=colperiode+24;
				if(jour=="Vendredi")
					realPeriode=colperiode+32;
				if(jour=="Samedi")
					realPeriode=colperiode+40;
					
				System.out.println("button clicked  "+comboBox.getSelectedItem().toString()+"  "+comboBox_1.getSelectedItem());
				if(conx.CheckForTeacherAndClassAvailability(classe, coursEnseignant, realPeriode)==true) {
					System.err.println("placeholder for new small teacher and or class occupied at that time window");
					
					JOptionPane.showMessageDialog(rootPane, "Prof et/ou classe dèjà occupé dans cette période de ce jour.");
				}
				else {
					conx.OccuperSallePeriode(classe, rowsalle, coursEnseignant, realPeriode);
					
					Miniwindow.super.dispose();

				}
			}
		});
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("vider");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int realPeriode = 0;
				if(jour=="Lundi")
					realPeriode=colperiode;
				if(jour=="Mardi")
					realPeriode=colperiode+8;
				if(jour=="Mercredi")
					realPeriode=colperiode+16;
				if(jour=="Jeudi")
					realPeriode=colperiode+24;
				if(jour=="Vendredi")
					realPeriode=colperiode+32;
				if(jour=="Samedi")
					realPeriode=colperiode+40;
				conx.ViderOccupation(rowsalle, realPeriode);
				Miniwindow.super.dispose();
			}
		});
		contentPane.add(btnNewButton_1);
		
		
		System.out.println();
	}

}