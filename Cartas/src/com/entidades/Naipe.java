package com.entidades;

import java.util.ArrayList;
import java.util.Collections;

public class Naipe {
	private ArrayList<Numero> numerosPosibles = new ArrayList<Numero>();
	private ArrayList<Carta> cartas = new ArrayList<Carta>();

	public Naipe() {
		String[] numeros = { "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K" };
		int[] valores = { 11, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10 };
		String[] palos = { "picas", "corazones", "diamantes", "treboles" };

		for (int i = 0; i < 12; i++) {
			numerosPosibles.add(new Numero(numeros[i], valores[i]));

		}

		for (String palo : palos) {
			for (Numero numero : numerosPosibles) {
				cartas.add(new Carta(numero, palo));
			}
		}

	}
	
	public ArrayList<Carta> barajar(){
		ArrayList<Carta> auxiliar = new ArrayList<Carta>();
		
		Collections.shuffle(cartas);
		auxiliar = cartas;
		
		
		return auxiliar;
	}

	public ArrayList<Carta> getCartas() {
		return cartas;
	}

}
