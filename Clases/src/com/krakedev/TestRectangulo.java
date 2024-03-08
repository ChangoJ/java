package com.krakedev;

public class TestRectangulo {
	public static void main(String[] args) {
		Rectangulo rectangulo = new Rectangulo();
		Rectangulo rectangulo2 = new Rectangulo();
		int area;
		int area2;
		double perimetro;
		
		 
        rectangulo.setBase(10);
        rectangulo.setAltura(5);
        
        rectangulo2.setBase(8);
        rectangulo2.setAltura(3);
        
        area = rectangulo.calcularArea();
        area2 = rectangulo2.calcularArea();
        perimetro = rectangulo.calcularPerimetro();
		
		System.out.println("Area de rectangulo: "+area);
		System.out.println("\nArea de rectangulo 2: "+area2);
		System.out.println("\nPerimetro de rectangulo 2: "+perimetro);
		
	}
}
