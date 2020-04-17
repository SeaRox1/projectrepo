package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JTable;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;

import prjctwrk.Connect;
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
import javax.swing.JScrollPane;
import java.awt.CardLayout;
import java.awt.GridLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;

public class Fenetre {
	Connect conx = new Connect();
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
		frame.setBounds(100, 20, 960, 720);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		table = new JTable(21, 9) {

			public boolean isCellEditable(int row, int column) {
				return false;
			}

		};
		TableColumn column = null;
		for (int i = 0; i < table.getColumnCount(); i++) {
		    column = table.getColumnModel().getColumn(i);
		
		        column.setPreferredWidth(100);
		  
		}
		table.setValueAt("yeet", 0, 0);

		table.setRowHeight(16);
		System.out.println("table width  "+table.getWidth());
//		TableColumnModel columnModel = table.getColumnModel();
//		for (int i = 0; i < 9; i++) {
//			columnModel.getColumn(i).setWidth(200);
//			columnModel.getColumn(0).setPreferredWidth(200);
//		}

		System.out.println("rowcount  " + table.getRowCount() + "rowheight " + table.getRowHeight() + "rowwidth "
				+ table.getWidth());
		for (int i = 0; i < table.getRowCount(); i++) {

			for (int j = 0; j < table.getColumnCount(); j++) {
				table.setValueAt(conx.getCoursClasse(i, j), i, j);
				table.isCellEditable(i, j);

			}
		}
		
		JLabel label = new JLabel("");
		
		JLabel label_1 = new JLabel("");
		
		JLabel label_2 = new JLabel("");
		
		JLabel label_3 = new JLabel("");
		
		JLabel label_4 = new JLabel("");
		
		JLabel label_5 = new JLabel("");
		
		JLabel label_6 = new JLabel("");
		
				JRadioButton rdbtnNewRadioButton = new JRadioButton("Lundi");
				rdbtnNewRadioButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						for (int i = 0; i < table.getRowCount(); i++) {

							for (int j = 0; j < table.getColumnCount(); j++) {
								table.setValueAt(conx.getCoursClasse(i, j), i, j);
								table.isCellEditable(i, j);

							}
						}
						table.setValueAt("yeet", 0, 0);
					}
				});
				buttonGroup.add(rdbtnNewRadioButton);
				rdbtnNewRadioButton.setActionCommand("Lundi");
				rdbtnNewRadioButton.setSelected(true);

		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Mardi");
		buttonGroup.add(rdbtnNewRadioButton_1);
		rdbtnNewRadioButton_1.setActionCommand("Mardi");
		rdbtnNewRadioButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for (int i = 0; i < table.getRowCount(); i++) {

					for (int j = 0; j < table.getColumnCount(); j++) {
						table.setValueAt(conx.getCoursClasse(i, j + 8), i, j);
						table.isCellEditable(i, j);

					}
				}

			}
		});

		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Mercredi");
		buttonGroup.add(rdbtnNewRadioButton_2);
		rdbtnNewRadioButton_2.setActionCommand("Mercredi");
		rdbtnNewRadioButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for (int i = 0; i < table.getRowCount(); i++) {

					for (int j = 0; j < table.getColumnCount(); j++) {
						table.setValueAt(conx.getCoursClasse(i, j + 16), i, j);
						table.isCellEditable(i, j);

					}
				}

			}
		});

		JRadioButton rdbtnNewRadioButton_3 = new JRadioButton("Jeudi");
		buttonGroup.add(rdbtnNewRadioButton_3);
		rdbtnNewRadioButton_3.setActionCommand("Jeudi");
		rdbtnNewRadioButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for (int i = 0; i < table.getRowCount(); i++) {

					for (int j = 0; j < table.getColumnCount(); j++) {
						table.setValueAt(conx.getCoursClasse(i, j + 24), i, j);
						table.isCellEditable(i, j);

					}
				}

			}
		});

		JRadioButton rdbtnNewRadioButton_4 = new JRadioButton("Vendredi");
		buttonGroup.add(rdbtnNewRadioButton_4);
		rdbtnNewRadioButton_4.setActionCommand("Vendredi");
		rdbtnNewRadioButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for (int i = 0; i < table.getRowCount(); i++) {

					for (int j = 0; j < table.getColumnCount(); j++) {
						table.setValueAt(conx.getCoursClasse(i, j + 32), i, j);
						table.isCellEditable(i, j);

					}
				}

			}
		});

		JRadioButton rdbtnNewRadioButton_5 = new JRadioButton("Samedi");

		buttonGroup.add(rdbtnNewRadioButton_5);
		rdbtnNewRadioButton_5.setActionCommand("Samedi");
		rdbtnNewRadioButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

//				TableColumnModel tcm = table.getColumnModel();
//				
//				tcm.removeColumn( tcm.getColumn(8) );
//				tcm.removeColumn( tcm.getColumn(7) );
//				tcm.removeColumn( tcm.getColumn(6) );
//				tcm.removeColumn( tcm.getColumn(5) );

				for (int i = 0; i < table.getRowCount(); i++) {
					for (int j = 0; j < table.getColumnCount(); j++) {
						table.setValueAt(conx.getCoursClasse(i, j + 40), i, j);
						table.isCellEditable(i, j);

					}

				}

				// table.removeColumn(table.getColumnModel().getColumn(8));

			}
		});

		table.addMouseListener(new java.awt.event.MouseAdapter() {
			@Override
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				int row = table.rowAtPoint(evt.getPoint());
				int col = table.columnAtPoint(evt.getPoint());
				String jour = buttonGroup.getSelection().getActionCommand();
				if (row >= 0 && col >= 0) {
					System.out.println(row + "  " + col);
					Miniwindow miniwind = new Miniwindow(row, col, jour);
					miniwind.setVisible(true);

				}
			}
		});
		frame.getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

		frame.getContentPane().add(table);
		frame.getContentPane().add(table);
		frame.getContentPane().add(label);
		frame.getContentPane().add(label_1);
		frame.getContentPane().add(label_2);
		frame.getContentPane().add(label_3);
		frame.getContentPane().add(label_4);
		frame.getContentPane().add(label_5);
		frame.getContentPane().add(label_6);
		frame.getContentPane().add(rdbtnNewRadioButton);
		frame.getContentPane().add(rdbtnNewRadioButton_1);
		frame.getContentPane().add(rdbtnNewRadioButton_2);
		frame.getContentPane().add(rdbtnNewRadioButton_3);
		frame.getContentPane().add(rdbtnNewRadioButton_4);
		frame.getContentPane().add(rdbtnNewRadioButton_5);

	}

}
