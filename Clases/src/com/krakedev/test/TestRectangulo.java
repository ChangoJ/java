package com.krakedev.test;

import com.krakedev.Rectangulo;

public class TestRectangulo {
	public static void main(String[] args) {
		Rectangulo rectangulo = new Rectangulo(10,5);
		Rectangulo rectangulo2 = new Rectangulo(8,3);
		int area;
		int area2;
		double perimetro;
		
        
        area = rectangulo.calcularArea();
        area2 = rectangulo2.calcularArea();
        perimetro = rectangulo.calcularPerimetro();
		
		System.out.println("Area de rectangulo: "+area);
		System.out.println("\nArea de rectangulo 2: "+area2);
		System.out.println("\nPerimetro de rectangulo 2: "+perimetro);
		
	}
}
