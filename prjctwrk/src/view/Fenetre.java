package view;

import java.awt.EventQueue;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;

import model.Etudier;
import prjctwrk.connect;
import java.awt.FlowLayout;

public class Fenetre {
connect conx=new connect();
	private JFrame frame;
	private JTable table;

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
		frame.setBounds(100, 100, 448, 495);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblNewLabel = new JLabel("New label");
		frame.getContentPane().add(lblNewLabel);
		

		JTable table = new JTable(21,9){
			
			  public boolean isCellEditable(int row, int column){
			    return false;
			  }
			
			};
			
		table.setValueAt("yeet", 0, 0);
		table.setRowHeight(32);
		
		
		System.out.println("rowcount  "+table.getRowCount()+ "rowheight "+table.getRowHeight()+ "rowwidth "+table.getWidth());
				for(int i=0;i<table.getRowCount();i++) {
				
					for(int j=0; j<table.getColumnCount();j++) {
						table.setValueAt(conx.getCoursClasse(i, j), i, j);
						table.isCellEditable(i, j);
					
						
					}
				}
		frame.getContentPane().add(table);
	}
}
