package com.krakedev;

public class TestCuadrado {
	public static void main(String[] args) {
		Cuadrado cuadrado = new Cuadrado();
		Cuadrado cuadrado2 = new Cuadrado();
		Cuadrado cuadrado3 = new Cuadrado();
		double area;
		double area2;
		double area3;
		double perimetro;
		double perimetro2;
		double perimetro3;
		
		cuadrado.lado = 4;
		cuadrado2.lado = 3;
		cuadrado3.lado = 5;
		
		
		area = cuadrado.calcularArea();
		area2 = cuadrado2.calcularArea();
		area3 = cuadrado3.calcularArea();
		perimetro = cuadrado.calcularPerimetro();
		perimetro2 = cuadrado2.calcularPerimetro();
		perimetro3 = cuadrado3.calcularPerimetro();
		
		System.out.println("Area de rectangulo: "+area);
		System.out.println("\nArea de rectangulo 2: "+area2);
		System.out.println("\nArea de rectangulo 2: "+area3);
		System.out.println("\nPerimetro de rectangulo 2: "+perimetro);
		System.out.println("\nPerimetro de rectangulo 2: "+perimetro2);
		System.out.println("\nPerimetro de rectangulo 2: "+perimetro3);
		
	}
}
