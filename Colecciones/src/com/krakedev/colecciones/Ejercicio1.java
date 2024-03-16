package com.krakedev.colecciones;

import java.util.ArrayList;
import java.util.Iterator;

public class Ejercicio1 {
	public static void main(String[] args) {
		ArrayList<String> cadenas;
		String valorRecuperado;
		cadenas = new ArrayList<String>();
		
		System.out.println(cadenas.size());
		
		cadenas.add("Uno"); //0
		cadenas.add("Dos"); //1
		cadenas.add("Tres"); //2
		
		valorRecuperado = cadenas.get(2);
		

		System.out.println(cadenas.size());
		
		System.out.println(valorRecuperado);
		
		String cadena;
		for (int i = 0; i < cadenas.size(); i++) {
			cadena = cadenas.get(i);
			System.out.println(cadena);
		}	
	}
	
	
}
