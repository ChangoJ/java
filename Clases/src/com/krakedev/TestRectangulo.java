package com.krakedev;

public class TestRectangulo {
	public static void main(String[] args) {
		Rectangulo rectangulo = new Rectangulo();
		Rectangulo rectangulo2 = new Rectangulo();
		int area;
		int area2;
		double perimetro;
		
		rectangulo.base = 10;
		rectangulo.altura = 5;
		
		rectangulo2.base = 8;
		rectangulo2.altura = 3;
		
		area = rectangulo.calcularArea();
		area2 = rectangulo2.calcularArea();
		perimetro = rectangulo.calcularPerimetro();
		
		System.out.println("Area de rectangulo: "+area);
		System.out.println("\nArea de rectangulo 2: "+area2);
		System.out.println("\nPerimetro de rectangulo 2: "+perimetro);
		
	}
}
