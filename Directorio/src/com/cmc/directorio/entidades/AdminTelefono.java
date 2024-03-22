package com.cmc.directorio.entidades;

public class AdminTelefono {
	public void activarMensajeria(Telefono telefono) {
		if (telefono.getOperadora() == "Movi") {
			telefono.setTieneWhatsapp(true);
		}
	}

	public int contarMovi(Telefono telefono, Telefono telefono2, Telefono telefono3) {
		int contador = 0;
		
		if (telefono.getOperadora() == "Movi") {
			contador++;
		} 
		if (telefono2.getOperadora() == "Movi") {
			contador++;
		}
		if (telefono3.getOperadora() == "Movi") {
			contador++;
		}

		return contador;
	}
	
	public int contarClaro(Telefono telefono, Telefono telefono2, Telefono telefono3, Telefono telefono4) {
		int contador = 0;
		
		if (telefono.getOperadora() == "Claro") {
			contador++;
		} 
		if (telefono2.getOperadora() == "Claro") {
			contador++;
		}
		if (telefono3.getOperadora() == "Claro") {
			contador++;
		}
		
		if (telefono4.getOperadora() == "Claro") {
			contador++;
		}

		return contador;
	}
}
