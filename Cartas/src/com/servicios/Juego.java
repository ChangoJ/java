package com.servicios;

import java.util.ArrayList;

import com.entidades.Carta;
import com.entidades.Jugadores;
import com.entidades.Naipe;

public class Juego {
	private Naipe naipe;
	ArrayList<Carta> naipeBarajado;
	private Jugadores jugadores;
	private ArrayList<ArrayList<Carta>> cartasJugador = new ArrayList<>();

	public Juego(ArrayList<String> idsJugadores, Jugadores jugadores) {
		this.jugadores = jugadores;
		for (String idJugador : idsJugadores) {
			ArrayList<Carta> cartaJugador = new ArrayList<Carta>();
			cartasJugador.add(cartaJugador);
		}
	}

	public Juego() {
		Naipe naipe = new Naipe();
		naipeBarajado = naipe.barajar();
		System.out.println(naipeBarajado);
		System.out.println("Hola");
	}

	public int devolverTotal(int idJugador) {

		ArrayList<Carta> manoJugador = cartasJugador.get(idJugador);

		int sumaTotal = 0;

		for (Carta carta : manoJugador) {
			sumaTotal += carta.getNumero().getValor();
		}

		return sumaTotal;

	}

	public String determinarGanador() {
		int idGanador = 0;
		String ganador;
		int sumaGanador = devolverTotal(idGanador);
		for (int i = 1; i < cartasJugador.size(); i++) {
			int sumaActual = devolverTotal(i);
			if (sumaActual > sumaGanador) {
				sumaGanador = sumaActual;
				idGanador = i;
			}
		}
		ganador = jugadores.getJugadores().get(idGanador);

		return ganador;
	}

	public void entregarCartas(int cartasPorJugador) {

		Naipe naipe = new Naipe();
		naipeBarajado = naipe.barajar();
		int numeroJugadores = jugadores.getJugadores().size();
		int cartaActual = 0;
		for (int i = 0; i < cartasPorJugador; i++) {
			for (int j = 0; j < numeroJugadores; j++) {
				ArrayList<Carta> cartaJugador = cartasJugador.get(j);

				cartaJugador.add(naipeBarajado.get(cartaActual));
				cartaActual++;
				if (cartaActual >= naipeBarajado.size()) {
					cartaActual = 0;
				}
			}
		}

	}

	public ArrayList<ArrayList<Carta>> getCartasJugador() {
		return cartasJugador;
	}

}
