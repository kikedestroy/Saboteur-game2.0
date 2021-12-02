package ar.edu.unlu.vista;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import ar.edu.unlu.controlador.Controlador;
import ar.edu.unlu.controlador.Estado;
import ar.edu.unlu.modelo.Game;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.BoxLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import net.miginfocom.swing.MigLayout;
import java.awt.FlowLayout;

public class ventana extends JFrame {

	private JPanel contentPane;
	private JTextField txtIngreseJugador;
	private JTextField txtIngresejugador2;
	private JTextField txtIngreseJugador3;
	private JButton btnOK;
	private JPanel panel_1;
	private JButton btnNewButton_1;
	private JLabel muestreoPlayers;
	
	
	private JLabel lblNotify;
	private JPanel panel_2;
	private JButton btnNewButton;
	
	Controlador controlador = new Controlador();

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public ventana() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 479, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.NORTH);
		
		JLabel lblNewLabel = new JLabel("In:");
		panel.add(lblNewLabel);
		
		txtIngreseJugador = new JTextField();
		txtIngreseJugador.setText("Player 1");
		panel.add(txtIngreseJugador);
		txtIngreseJugador.setColumns(10);
		
		txtIngresejugador2 = new JTextField();
		txtIngresejugador2.setText("Player 2");
		panel.add(txtIngresejugador2);
		txtIngresejugador2.setColumns(10);
		
		txtIngreseJugador3 = new JTextField();
		txtIngreseJugador3.setText("Player 3");
		panel.add(txtIngreseJugador3);
		txtIngreseJugador3.setColumns(10);
		
		btnOK = new JButton("OK");
		btnOK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controlador.agregarJugador(txtIngreseJugador, txtIngresejugador2, txtIngreseJugador3, lblNotify);
			}
		});
		panel.add(btnOK);
		
		lblNotify = new JLabel("OK !");
		panel.add(lblNotify);
		lblNotify.setVisible(false);
		
		panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.WEST);
		panel_1.setLayout(new BoxLayout(panel_1, BoxLayout.Y_AXIS));
		
		muestreoPlayers = new JLabel("...");
		
		btnNewButton_1 = new JButton("Ver Jugadores Registrados");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (controlador.getEstadoJuego() == Estado.vistaHabilitadaPJ)
				muestreoPlayers.setText(controlador.mostrarJugadores());
				
				
			}
		});
		panel_1.add(btnNewButton_1);
		
		
		panel_1.add(muestreoPlayers);
		
		panel_2 = new JPanel();
		contentPane.add(panel_2, BorderLayout.CENTER);
		panel_2.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		btnNewButton = new JButton("PLAY !");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Ventana2 ventana2 = new Ventana2(controlador);
				ventana2.setVisible(true);
				
			}
		});
		panel_2.add(btnNewButton);
		
	}

}
