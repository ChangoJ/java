package com.cmc.evaluacion;

import java.util.ArrayList;

public class CalculadoraAmortizacion {

	public static double calcularCuota(Prestamo prestamo) {
		double interesMensual = (prestamo.getInteres() / 12) / 100;
		double monto = prestamo.getMonto();
		int plazo = prestamo.getPlazo();

		double cuota = (monto * interesMensual) / (1 - Math.pow(1 + interesMensual, -plazo));

		return cuota;
	}

	public static void generarTabla(Prestamo prestamo) {

		double cuotaCalculada = calcularCuota(prestamo);
		ArrayList<Cuota> cuotas = new ArrayList<Cuota>();
		Utilitario utilitario = new Utilitario();
		cuotas = prestamo.getCuotas();
		
		for (int i = 0; i < prestamo.getPlazo(); i++) {

			Cuota cuota = new Cuota(i + 1);

			if (i == 0) {
				cuota.setInicio(prestamo.getMonto());
			}

			cuota.setCuota(utilitario.redondear(cuotaCalculada));
			prestamo.getCuotas().add(cuota);
			
		}
		
		for(int i = 0; i < cuotas.size(); i++) {
			Cuota cuota = cuotas.get(i);
			if (i < cuotas.size() - 1) {
				
				calcularValoresCuota(prestamo.getInteres(), cuota, cuotas.get(i + 1));

			} else {
				calcularValoresCuota(prestamo.getInteres(), cuota, null);

			}
		}

	

	}

	public static void calcularValoresCuota(double interesPrestamo, Cuota cuotaActual, Cuota cuotaSiguiente) {

		double interes = (interesPrestamo / 12) / 100;
		double interesCuota = cuotaActual.getInicio() * interes;
		double abonoCapital = cuotaActual.getCuota() - interesCuota;
		double saldo = cuotaActual.getInicio() - abonoCapital;

		cuotaActual.setInteres(interesCuota);
		cuotaActual.setAbonoCapital(abonoCapital);
		cuotaActual.setSaldo(saldo);

		if (cuotaSiguiente != null) {

			cuotaSiguiente.setInicio(saldo);

		} else {
			cuotaActual.setAbonoCapital(abonoCapital + saldo);
			cuotaActual.setCuota(cuotaActual.getCuota() + saldo);
			cuotaActual.setSaldo(0);
		}

	}

	public static void mostrarTabla(Prestamo prestamo) {

		System.out.println("Tabla de amortización del préstamo:");
		System.out.println("Número | Cuota  | Inicio | Interés | Abono Capital | Saldo");
		System.out.println("-----------------------");
		
		for (Cuota cuota : prestamo.getCuotas()) {

			cuota.mostrarPrestamo();
		}

	}

}
