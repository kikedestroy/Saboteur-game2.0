package ar.edu.unlu.modelo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Stack;


import ar.edu.unlu.controlador.Controlador;
import ar.edu.unlu.controlador.Observable;

import ar.edu.unlu.vista.Observer;

import ar.edu.unlu.vista.*;

public class Game implements Observable {
	static final int fila = 5;
	static final int columna = 9;
	
	private int ronda;
	private int turno;
	
	private ArrayList<Jugador> players = new ArrayList<>();
	
	private ArrayList<Observer> observadores = new ArrayList<>();
	
	private String[][] tunel = new String[fila][columna];

	
	public String[][] getTunel() {
		return tunel;
	}

	public void setTunel(String[][] tunel) {
		this.tunel = tunel;
	}

	public ArrayList<Jugador> getPlayers() {
		return players;
	}

	public void setPlayers(ArrayList<Jugador> players) {
		this.players = players;
	}

	public String getNamePlayers() {
		String concat = "";
			for (Jugador jugadores : this.players) {
				concat = concat + "\n" + jugadores.getNombre();
			}
			return concat;
		}
	
	public void añadirJugador(String nombre1, String nombre2, String nombre3) {
		Jugador jugador1 = new Jugador(nombre1, TipoEnano.MINERO, 0);
		Jugador jugador2 = new Jugador(nombre2, TipoEnano.MINERO, 0);
		Jugador jugador3 = new Jugador(nombre3, TipoEnano.SABOTEADOR, 0);
		
		
		this.players.add(jugador1);
		this.players.add(jugador2);
		this.players.add(jugador3);
		notificar("addPJs");

	}
	
	public ArrayList<Integer> obtenerCartasJugador() {
		Jugador jugador ;
		ArrayList<Carta>  miscartasJugador;
		ArrayList<Integer> nroCartasArrayList = new ArrayList<>(); 
		
		
		jugador = this.players.get(0);
		
		miscartasJugador = jugador.getCartasJugador();
		
		for (Carta miCartaJugador : miscartasJugador) {
			nroCartasArrayList.add(miCartaJugador.getNroCarta());
		}
		
		return nroCartasArrayList;
		
		
	}

	

	public void validacionPosicion(int x, int y, Carta c) {

		if (tunel[x][y] == ".") {
			switch (c.getNroCarta()) {
			case 1: {

				tunel[x][y] = "╬"; // ocupado por posicion
				break;
			}
			case 2: {
				tunel[x][y] = "║"; // ocupado por posicion
				tunel[x][y - 1] = "f"; // izquierda
				tunel[x][y + 1] = "f"; // derecha
				break;
			}
			case 3: {
				tunel[x][y] = "╗"; // ocupado por posicion
				tunel[x - 1][y] = "f"; // arriba
				tunel[x][y + 1] = "f"; // derecha
				break;
			}
			case 4: {
				tunel[x][y] = "╔"; // ocupado por posicion
				tunel[x - 1][y] = "f"; // arriba
				tunel[x][y - 1] = "f"; // izquierda
				break;
			}
			case 5: {
				tunel[x][y] = "╝"; // ocupado por posicion
				tunel[x + 1][y] = "f"; // abajo
				tunel[x][y + 1] = "f"; // derecha
				break;
			}
			case 6: {
				tunel[x][y] = "╚"; // ocupado por posicion
				tunel[x + 1][y] = "f"; // abajo
				tunel[x][y + 1] = "f"; // derecha
				break;
			}
			case 7: {
				tunel[x][y] = "╣"; // ocupado por posicion
				tunel[x][y + 1] = "f"; // derecha
				break;
			}
			case 8: {
				tunel[x][y] = "╠"; // ocupado por posicion
				tunel[x][y - 1] = "f"; // izquierda
				break;
			}

			case 9: {
				tunel[x][y] = "═"; // ocupado por posicion
				tunel[x - 1][y] = "f"; // arriba
				tunel[x + 1][y] = "f"; // abajo
				break;
			}

			}
		}
	}

	public void imprimirMatriz(String[][] matriz) {
		for (int x = 0; x < matriz.length; x++) {
			for (int y = 0; y < matriz[x].length; y++) {
				System.out.print(matriz[x][y] + "  ");
			}
			System.out.println("");
		}

	}// fin imprimirMatriz

	public void inicializarMatriz(String[][] matriz) {
		for (int x = 0; x < matriz.length; x++) {
			for (int y = 0; y < matriz[x].length; y++) {
				matriz[x][y] = ".";
			}
		} // cierra incializarMatriz
		matriz[2][1] = "╬";
	}

	@Override
	public void add(Observer observer) {
		observadores.add(observer);
	}

	@Override
	public void remove(Observer observer) {
		observadores.remove(observer);

	}

	@Override
	public void notificar(String message) {

		if (message == "addPJs") {
			for (Observer observer : observadores) {
				observer.update("addPJs");
			}
		}

		if (message == "initMazo") {
			for (Observer observer : observadores) {
				observer.update("initMazo");
			}
		}

	}

	public static void main(String[] args) {

		ventana ventana = new ventana();
	
		ventana.setVisible(true);
		
		
		
	}

}
