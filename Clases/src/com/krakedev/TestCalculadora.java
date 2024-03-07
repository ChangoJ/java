package com.krakedev;

public class TestCalculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculadora calculadora = new Calculadora();
		int resultadoSuma;
		double resultadoResta;
		double resultadoMultiplicar;
		double resultadoDividir;
		double resultadoPromediar;
		
		resultadoSuma = calculadora.sumar(5,3);
		resultadoResta = calculadora.restar(5,3);
		resultadoDividir = calculadora.multiplicar(10,5);
		resultadoMultiplicar = calculadora.dividir(10,2);
		resultadoPromediar = calculadora.promediar(10,8,9);
		calculadora.mostrarResultado();
		
		
		System.out.println("Suma: "+resultadoSuma);
		System.out.println("Resta: "+resultadoResta);
		System.out.println("Multiplicacion: "+resultadoMultiplicar);
		System.out.println("Division: "+resultadoDividir);
		System.out.println("Promedio: "+resultadoPromediar);
		
	}

}
