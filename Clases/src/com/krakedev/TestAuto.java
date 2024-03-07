package com.krakedev;

public class TestAuto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Auto auto = new Auto();
		Auto auto2 = new Auto();
		
		auto.marca = "Toyota";
		auto.anio = 2024;
		auto.precio = 25000.50;
		
		auto2.marca = "Ford";
		auto2.anio = 2017;
		auto2.precio = 18000.70;

		System.out.println("Auto 1:");
        System.out.println("Marca: " + auto.marca);
        System.out.println("Año: " + auto.anio);
        System.out.println("Precio: " + auto.precio);

        System.out.println("Auto 2:");
        System.out.println("Marca: " + auto2.marca);
        System.out.println("Año: " + auto2.anio);
        System.out.println("Precio: " + auto2.precio);
		
	}

}
