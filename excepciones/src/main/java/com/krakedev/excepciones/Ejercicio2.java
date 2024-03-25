package com.krakedev.excepciones;

import java.io.File;
import java.io.IOException;

public class Ejercicio2 {
	public void metodo1() {
		String a = null;

		a.substring(0);
		//NPE UNCHECKED

	}

	public void metodo2() {
		try {
			File file = new File("archivo1.txt");
			file.createNewFile();
			//IOEXCEPTION - CHECKED	
		} catch (IOException io) {
			System.out.println(io);
		}
		
		
	}
	
	public void metodo3() throws IOException{
		File file = new File("archivo1.txt");
		file.createNewFile();
		//IOEXCEPTION - CHECKED
	}
	
	public void metodo4() {
		try {
			metodo3();
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

}
