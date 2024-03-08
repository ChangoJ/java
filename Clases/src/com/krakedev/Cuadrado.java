package com.krakedev;

public class Cuadrado {
	public double lado;
	
	public double calcularArea() {
		double area = Math.pow(lado, 2);
		return area;
	}
	
	public double calcularPerimetro() {
		double perimetro;
		perimetro = 4 * lado;
		
		return perimetro;
	}
	
}
