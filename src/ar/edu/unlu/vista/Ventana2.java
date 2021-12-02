package ar.edu.unlu.vista;


import java.awt.Dimension;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import ar.edu.unlu.controlador.Controlador;
import ar.edu.unlu.controlador.Estado;

import javax.swing.JButton;

import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.BoxLayout;

import javax.swing.ListSelectionModel;

public class Ventana2 extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private Controlador controlador;
	
	/**
	 * Create the frame.
	 */
	public Ventana2(Controlador controlador) {
		this.controlador = controlador;
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 638, 579);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.Y_AXIS));
		
		//TABLEE 
		
		table = new JTable();
		table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		table.setCellSelectionEnabled(true);
		table.setFont(new Font("Tahoma", Font.PLAIN, 20));

		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
			},
			new String[] {
				"New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column"
			}
		));
		table.setRowHeight(50); //tamaño de ancho de la celda
		
		contentPane.add(table);
		controlador.mostrarEnTablaMatrizEntera(table);
		
		table.getSelectedRow(); //devuelve valor de la fila
		table.getSelectedColumn();//devuelve valor de la columna
		
		//TABLEE
		
		
		
		JPanel panel = new JPanel();
		contentPane.add(panel);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 20));
		
		
		JButton card1 = new JButton("");
		card1.setIcon(new ImageIcon("C:\\Users\\Kike\\Desktop\\Saboteur\\CardsResize\\1.png"));
		panel.add(card1);
		card1.setPreferredSize(new Dimension(35, 50));
		card1.setVisible(false);
		
		JButton card2 = new JButton("");
		card2.setIcon(new ImageIcon("C:\\Users\\Kike\\Desktop\\Saboteur\\CardsResize\\2.png"));
		panel.add(card2);
		card2.setPreferredSize(new Dimension(35, 50));
		card2.setVisible(false);
		
		JButton card3 = new JButton("");
		card3.setIcon(new ImageIcon("C:\\Users\\Kike\\Desktop\\Saboteur\\CardsResize\\3.png"));
		panel.add(card3);
		card3.setPreferredSize(new Dimension(35, 50));
		card3.setVisible(false);
		
		JButton card4 = new JButton("");
		card4.setIcon(new ImageIcon("C:\\Users\\Kike\\Desktop\\Saboteur\\CardsResize\\4.png"));
		panel.add(card4);
		card4.setPreferredSize(new Dimension(35, 50));
		card4.setVisible(false);
		
		JButton card5 = new JButton("");
		card5.setIcon(new ImageIcon("C:\\Users\\Kike\\Desktop\\Saboteur\\CardsResize\\5.png"));
		panel.add(card5);
		card5.setPreferredSize(new Dimension(35, 50));
		card5.setVisible(false);
		
		JButton card6 = new JButton("");
		card6.setIcon(new ImageIcon("C:\\Users\\Kike\\Desktop\\Saboteur\\CardsResize\\6.png"));
		panel.add(card6);
		card6.setPreferredSize(new Dimension(35, 50));
		card6.setVisible(false);
		
		JButton card7 = new JButton("");
		card7.setIcon(new ImageIcon("C:\\Users\\Kike\\Desktop\\Saboteur\\CardsResize\\7.png"));
		panel.add(card7);
		card7.setPreferredSize(new Dimension(35, 50));
		card7.setVisible(false);
		
		JButton card8 = new JButton("");
		card8.setIcon(new ImageIcon("C:\\Users\\Kike\\Desktop\\Saboteur\\CardsResize\\8.png"));
		panel.add(card8);
		card8.setPreferredSize(new Dimension(35, 50));
		card8.setVisible(false);
		
		JButton card9 = new JButton("");
		card9.setIcon(new ImageIcon("C:\\Users\\Kike\\Desktop\\Saboteur\\CardsResize\\9.png"));
		panel.add(card9);
		card9.setPreferredSize(new Dimension(35, 50));
		card9.setVisible(false);
		
		JButton card10 = new JButton("");
		card10.setIcon(new ImageIcon("C:\\Users\\Kike\\Desktop\\Saboteur\\CardsResize\\10.png"));
		panel.add(card10);
		card10.setPreferredSize(new Dimension(35, 50));
		card10.setVisible(false);
		
		JButton card11 = new JButton("");
		card11.setIcon(new ImageIcon("C:\\Users\\Kike\\Desktop\\Saboteur\\CardsResize\\11.png"));
		panel.add(card11);
		card11.setPreferredSize(new Dimension(35, 50));
		card11.setVisible(false);
		
		JButton card12 = new JButton("");
		card12.setIcon(new ImageIcon("C:\\Users\\Kike\\Desktop\\Saboteur\\CardsResize\\12.png"));
		panel.add(card12);
		card12.setPreferredSize(new Dimension(35, 50));
		card12.setVisible(false);
		
		JButton card13 = new JButton("");
		card13.setIcon(new ImageIcon("C:\\Users\\Kike\\Desktop\\Saboteur\\CardsResize\\13.png"));
		panel.add(card13);
		card13.setPreferredSize(new Dimension(35, 50));
		card13.setVisible(false);
		
		JButton card14 = new JButton("");
		card14.setIcon(new ImageIcon("C:\\Users\\Kike\\Desktop\\Saboteur\\CardsResize\\14.png"));
		panel.add(card14);
		card14.setPreferredSize(new Dimension(35, 50));
		card14.setVisible(false);
		
		JButton card15 = new JButton("");
		card15.setIcon(new ImageIcon("C:\\Users\\Kike\\Desktop\\Saboteur\\CardsResize\\15.png"));
		panel.add(card15);
		card15.setPreferredSize(new Dimension(35, 50));
		card15.setVisible(false);
		
		JButton card16 = new JButton("");
		card16.setIcon(new ImageIcon("C:\\Users\\Kike\\Desktop\\Saboteur\\CardsResize\\16.png"));
		panel.add(card16);
		card16.setPreferredSize(new Dimension(35, 50));
		card16.setVisible(false);
		
		JButton card17 = new JButton("");
		card17.setIcon(new ImageIcon("C:\\Users\\Kike\\Desktop\\Saboteur\\CardsResize\\17.png"));
		panel.add(card17);
		card17.setPreferredSize(new Dimension(35, 50));
		card17.setVisible(false);
		
		JButton card18 = new JButton("");
		card18.setIcon(new ImageIcon("C:\\Users\\Kike\\Desktop\\Saboteur\\CardsResize\\18.png"));
		panel.add(card18);
		card18.setPreferredSize(new Dimension(35, 50));
		card18.setVisible(false);
		
		JButton card19 = new JButton("");
		card19.setIcon(new ImageIcon("C:\\Users\\Kike\\Desktop\\Saboteur\\CardsResize\\19.png"));
		panel.add(card19);
		card19.setPreferredSize(new Dimension(35, 50));
		card19.setVisible(false);
		
		
		
		controlador.inicializarMazo();
		controlador.repartirCartasJugador();
		if (controlador.getEstadoJuego() == Estado.vistaCardHabilitada )
			controlador.mostrarCartasJugador(card1, card2, card3, card4, card5, card6,card7,card8,card9,
					card10,card11,card12,card13,card14,card15,card16,card17,card18,card19);
		
	}



}
