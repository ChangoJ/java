package com.cmc.evaluacion;

public class Utilitario {

	public double redondear(double numero) {
		double redondeado = Math.round(numero * 100.0) / 100.0;
		return redondeado;
	}
}
