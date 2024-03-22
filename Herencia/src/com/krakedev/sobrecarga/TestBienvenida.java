package com.krakedev.sobrecarga;

public class TestBienvenida {

	public static void main(String[] args) {
		Bienvenida bienvenida = new Bienvenida();
		
		bienvenida.saludar("Jordan");
		bienvenida.saludar("Jordan", "Chango");
	}

}
