package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JTable;

import prjctwrk.connect;
import java.awt.FlowLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import net.miginfocom.swing.MigLayout;
import javax.swing.BoxLayout;
import java.beans.PropertyChangeListener;
import java.util.List;
import java.beans.PropertyChangeEvent;

public class Fenetre {
connect conx=new connect();
	private JFrame frame;
	private JTable table;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Fenetre window = new Fenetre();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Fenetre() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 560, 485);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	
		 table = new JTable(21,9){
			
			  public boolean isCellEditable(int row, int column){
			    return false;
			  }
			
			};
			
		table.setValueAt("yeet", 0, 0);
		table.setRowHeight(16);
		
		
		System.out.println("rowcount  "+table.getRowCount()+ "rowheight "+table.getRowHeight()+ "rowwidth "+table.getWidth());
				for(int i=0;i<table.getRowCount();i++) {
				
					for(int j=0; j<table.getColumnCount();j++) {
						table.setValueAt(conx.getCoursClasse(i, j), i, j);
						table.isCellEditable(i, j);
					
						
					}
				}
				table.setValueAt("yeet", 0, 0);
		frame.getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Lundi");
		rdbtnNewRadioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {for(int i=0;i<table.getRowCount();i++) {
				
				for(int j=0; j<table.getColumnCount();j++) {
					table.setValueAt(conx.getCoursClasse(i, j), i, j);
					table.isCellEditable(i, j);
				
					
				}
			}
				
			}
		});
		buttonGroup.add(rdbtnNewRadioButton);
		frame.getContentPane().add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setActionCommand("Lundi");
		rdbtnNewRadioButton.setSelected(true);
		
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Mardi");
		buttonGroup.add(rdbtnNewRadioButton_1);
		frame.getContentPane().add(rdbtnNewRadioButton_1);
		rdbtnNewRadioButton_1.setActionCommand("Mardi");
		rdbtnNewRadioButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {for(int i=0;i<table.getRowCount();i++) {
				
				for(int j=0; j<table.getColumnCount();j++) {
					table.setValueAt(conx.getCoursClasse(i, j+8), i, j);
					table.isCellEditable(i, j);
				
					
				}
			}
				
			}
		});

		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Mercredi");
		buttonGroup.add(rdbtnNewRadioButton_2);
		frame.getContentPane().add(rdbtnNewRadioButton_2);
		rdbtnNewRadioButton_2.setActionCommand("Mercredi");
		rdbtnNewRadioButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {for(int i=0;i<table.getRowCount();i++) {
				
				for(int j=0; j<table.getColumnCount();j++) {
					table.setValueAt(conx.getCoursClasse(i, j+16), i, j);
					table.isCellEditable(i, j);
				
					
				}
			}
				
			}
		});
		
		JRadioButton rdbtnNewRadioButton_3 = new JRadioButton("Jeudi");
		buttonGroup.add(rdbtnNewRadioButton_3);
		frame.getContentPane().add(rdbtnNewRadioButton_3);
		rdbtnNewRadioButton_3.setActionCommand("Jeudi");
		rdbtnNewRadioButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {for(int i=0;i<table.getRowCount();i++) {
				
				for(int j=0; j<table.getColumnCount();j++) {
					table.setValueAt(conx.getCoursClasse(i, j+24), i, j);
					table.isCellEditable(i, j);
				
					
				}
			}
				
			}
		});
		
		JRadioButton rdbtnNewRadioButton_4 = new JRadioButton("Vendredi");
		buttonGroup.add(rdbtnNewRadioButton_4);
		frame.getContentPane().add(rdbtnNewRadioButton_4);
		rdbtnNewRadioButton_4.setActionCommand("Vendredi");
		rdbtnNewRadioButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {for(int i=0;i<table.getRowCount();i++) {
				
				for(int j=0; j<table.getColumnCount();j++) {
					table.setValueAt(conx.getCoursClasse(i, j+32), i, j);
					table.isCellEditable(i, j);
				
					
				}
			}
				
			}
		});
		
		JRadioButton rdbtnNewRadioButton_5 = new JRadioButton("Samedi");
		
		buttonGroup.add(rdbtnNewRadioButton_5);
		frame.getContentPane().add(rdbtnNewRadioButton_5);
		rdbtnNewRadioButton_5.setActionCommand("Samedi");
		rdbtnNewRadioButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for(int i=0;i<table.getRowCount();i++) {
					for(int j=0; j<table.getColumnCount();j++) {
					table.setValueAt(conx.getCoursClasse(i, j+40), i, j);
					table.isCellEditable(i, j);
				
					
				}
				
			}
				
					
					//table.removeColumn(table.getColumnModel().getColumn(8));

				
				
			}
		});
		
		table.addMouseListener(new java.awt.event.MouseAdapter() {
		    @Override
		    public void mouseClicked(java.awt.event.MouseEvent evt) {
		        int row = table.rowAtPoint(evt.getPoint());
		        int col = table.columnAtPoint(evt.getPoint());
		        if (row >= 0 && col >= 0) {
			           System.out.println(row+"  "+col);
			           Miniwindow miniwind= new Miniwindow(row, col);
			           miniwind.setVisible(true);

		        }
		    }
		});
		
		
		frame.getContentPane().add(table);
		
		
	}

}
