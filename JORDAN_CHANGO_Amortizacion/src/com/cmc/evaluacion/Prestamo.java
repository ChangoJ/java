package com.cmc.evaluacion;

import java.util.ArrayList;

public class Prestamo {
	private double monto;
	private double interes;
	private int plazo;
	private ArrayList<Cuota> cuotas;

	public Prestamo(double monto, double interes, int plazo) {

		this.monto = monto;
		this.interes = interes;
		this.plazo = plazo;
		this.cuotas = new ArrayList<>(plazo);
	}
	
	public void mostrarPrestamo() {
		
	     
	        System.out.println("Monto: " + this.monto+", Interes: "+this.interes+", Plazo: "+this.plazo);
	        
	}

	public double getMonto() {
		return monto;
	}

	public double getInteres() {
		return interes;
	}

	public int getPlazo() {
		return plazo;
	}

	public void setMonto(double monto) {
		this.monto = monto;
	}

	public void setInteres(double interes) {
		this.interes = interes;
	}

	public void setPlazo(int plazo) {
		this.plazo = plazo;
	}

	public ArrayList<Cuota> getCuotas() {
		return cuotas;
	}


	
	

}
