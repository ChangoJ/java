package com.entidades;

import java.util.ArrayList;

import com.servicios.Juego;

public class Jugadores {
	private ArrayList<String> jugadores = new ArrayList<String>();

	public ArrayList<String> getJugadores() {
		return jugadores;
	}

	public void setJugadores(ArrayList<String> jugadores) {
		this.jugadores = jugadores;
	}

	public void jugar() {
		String ganador;
		jugadores.add("Jordan");
		jugadores.add("Carola");
		jugadores.add("Sara");

		Juego juego = new Juego();
		juego.entregarCartas(5);
		int contador = 0;
		for (int i = 0; i < jugadores.size(); i++) {
			contador++;
			System.out.println("Numero de jugador: " + jugadores.get(i));
		}
		System.out.println("Total de jugadores: "+contador);
		ganador = juego.determinarGanador();
		
		System.out.println("El ganador es: "+ganador);
	}

}
