package ar.edu.unlu.controlador;


import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JTextField;

import ar.edu.unlu.vista.Observer;

import ar.edu.unlu.modelo.*;

public class Controlador implements Observer {
	private Game game;
	private Mazo mazo;

	
	private Estado estadoJuego;

	public Controlador() {
		this.game = new Game();
		this.mazo = new Mazo();
		this.game.add(this); //observer
		
		
	}
	
	

	public Estado getEstadoJuego() {
		return estadoJuego;
	}

	public void setEstadoJuego(Estado estadoJuego) {
		this.estadoJuego = estadoJuego;
	}

	public void mostrarEnTablaMatrizEntera(JTable table) {
		game.inicializarMatriz(game.getTunel());
		//mesa.inicializarMatriz(mesa.getTunel());
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 9; j++) {
				//table.setValueAt(mesa.getTunel()[i][j], i, j);
				table.setValueAt(game.getTunel()[i][j], i, j);
			}
		}
	}

	public void agregarJugador(JTextField texto1, JTextField texto2, JTextField texto3, JLabel notificacion) {
		game.añadirJugador(texto1.getText(), texto2.getText(), texto3.getText());
		notificacion.setVisible(true);

	}



	public void inicializarMazo() {
		mazo.crearMazo();
		mazo.mezclar();
		game.notificar("initMazo");

	}
	
	public void repartirCartasJugador() {
		for (Jugador player : game.getPlayers()) {
			player.extraerCartasMazo(mazo.getCartas());
		}
	}
	
	
	

	public void mostrarCartasJugador(JButton c1, JButton c2, JButton c3, JButton c4, JButton c5, JButton c6
			,JButton c7 , JButton c8 , JButton c9, JButton c10 ,JButton c11 ,JButton c12,JButton c13 , JButton c14,
			JButton c15, JButton c16, JButton c17,JButton c18, JButton c19) {

		
		for (Integer card : game.obtenerCartasJugador()) {
			switch (card) {
			case 1:
				c1.setVisible(true);
				break;
			case 2:
				c2.setVisible(true);
				break;
			case 3:
				c3.setVisible(true);
				break;
			case 4:
				c4.setVisible(true);
				break;
			case 5:
				c5.setVisible(true);
				break;
			case 6:
				c6.setVisible(true);
				break;
			case 7:
				c7.setVisible(true);
				break;
			case 8:
				c8.setVisible(true);
				break;
			case 9:
				c9.setVisible(true);
				break;
			case 10:
				c10.setVisible(true);
				break;
			case 11:
				c11.setVisible(true);
				break;
			case 12:
				c12.setVisible(true);
				break;
			case 13:
				c13.setVisible(true);
				break;
			case 14:
				c14.setVisible(true);
				break;
			case 15:
				c15.setVisible(true);
				break;
			case 16:
				c16.setVisible(true);
				break;
			case 17:
				c17.setVisible(true);
				break;
			case 18:
				c18.setVisible(true);
				break;
			case 19:
				c19.setVisible(true);
				break;
			default:
				break;
			}

		}

	}
	
	
	
	public String mostrarJugadores() {
		String salidaString;
		salidaString = game.getNamePlayers();
		return salidaString;
	}
	

	// falta implementar
	public void obtenerPosicionTable(int x, int y, Carta c) {
		game.validacionPosicion(x, y, c);
	}

	@Override
	public void update(String message) {
		if (message == "addPJs") {
			estadoJuego = this.estadoJuego.vistaHabilitadaPJ;
		}
		if (message == "initMazo") {
			estadoJuego = this.estadoJuego.vistaCardHabilitada;
		}

	}

}
