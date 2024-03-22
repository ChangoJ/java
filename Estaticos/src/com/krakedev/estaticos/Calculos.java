package com.krakedev.estaticos;

public class Calculos {
	
	//final poner en constante la variable
	//no se puede cambiar
	//MAYUSCULAS SIEMPRE
	public final double IVA = 12;

	public double calcularIva(double monto) {
		return (monto * IVA) / 100;
	}
	
}