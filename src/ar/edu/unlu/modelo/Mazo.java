package ar.edu.unlu.modelo;

import java.util.ArrayList;


public class Mazo{
	
	private ArrayList<Carta> cartas;
	
	public Mazo(){
		cartas = new ArrayList<>();
		
	}
	
	
	public ArrayList<Carta> getCartas() {
		return cartas;
	}


	public void setCartas(ArrayList<Carta> cartas) {
		this.cartas = cartas;
	}


	public void crearMazo() { //CREO 84 cartas = (9 camino + 10 acción) * 3 jugadores = 84 
		int acc = 1;
		for (int i = 1; i <= 57; i++) {
			if (acc < 19) {	
				cartas.add(new Carta(acc));
				acc++;
			}else 
				acc = 1;
		}
	}
	
	
	public void mezclar() { // mezclo esas 26 cartas
		Carta carta = null ;
		for (int i = 0; i < cartas.size(); i++) {
			int random = (int) (Math.random()*cartas.size());
			carta = cartas.get(i);
			cartas.set(i, cartas.get(random));
			cartas.set(random, carta);
			
		}
	}
	

	@Override
	public String toString() {
		return "Mazo [cartas=" + cartas + "]";
	}
	

}
