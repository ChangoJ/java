package com.krakedev;

public class TestAuto {

	public static void main(String[] args) {
		
		Auto auto = new Auto("Toyota",2024,25000.50);
		Auto auto2 = new Auto("Ford",2017,18000.70);
		

        System.out.println("Auto 1:");
        System.out.println("Marca: " + auto.getMarca());
        System.out.println("Año: " + auto.getAnio());
        System.out.println("Precio: " + auto.getPrecio());

        System.out.println("Auto 2:");
        System.out.println("Marca: " + auto2.getMarca());
        System.out.println("Año: " + auto2.getAnio());
        System.out.println("Precio: " + auto2.getPrecio());
		
	}

}
