package com.krakedev;

public class TestAuto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Auto auto = new Auto();
		Auto auto2 = new Auto();
		
		auto.setMarca("Toyota");
        auto.setAnio(2024);
        auto.setPrecio(25000.50);
        
        auto2.setMarca("Ford");
        auto2.setAnio(2017);
        auto2.setPrecio(18000.70);

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
