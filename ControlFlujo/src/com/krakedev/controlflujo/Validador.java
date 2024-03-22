package com.krakedev.controlflujo;

public class Validador {
<<<<<<< HEAD
	public void validarEdad(int edad) {
		if(edad >= 18) {
			System.out.println("Es mayor de edad");
		}else if(edad >= 12 && edad <18){
			System.out.println("Es adolescente");
		}else if(edad > 0 && edad <12) {
			System.out.println("Es niño");
		}else {
			System.out.println("Edad incorrecta");
=======
	public void ValidarEdad(int edad) {
		if(edad >18) {
			System.out.println("Es mayor de edad");
		}else if(edad >=12 && edad <18){
			System.out.println("Es adolescente");
		}else if(edad >=0 && edad <12){
			System.out.println("Es niño");
		}else{
			System.out.println("edad incorrecta");
>>>>>>> fdb198a4350df93e09ca5dcd809b272037d5a476
		}
	}
}
