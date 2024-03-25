package com.krakedev.excepciones;

public class Ejercicio1 {

	public static void main(String[] args) {
		String a = null;
		try {
			a.substring(3);
			
		} catch (Exception e) {
			System.out.println("Entra al catch");
		}finally {
			System.out.println("finally");
		}
		System.out.println("Cierre");
		
	}

}
