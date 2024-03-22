package com.krakedev.evaluacion;

public class Telefono {
	private String numero;
	private String tipo;
	private String estado;
	
	
	
	public Telefono(String numero, String tipo) {
		this.numero = numero;
		this.tipo = tipo;
		
		if(this.numero !=null && this.tipo !=null && (this.tipo.equalsIgnoreCase("Movil") || this.tipo.equalsIgnoreCase("Convencional"))) {
			if(this.tipo.equalsIgnoreCase("Movil") && this.numero.length() == 10) {
				this.estado = "C";
			}else if(this.tipo.equalsIgnoreCase("Convencional") && this.numero.length() == 7){
				this.estado = "C";
			}else {

				this.estado = "E";
			}
		}else {
		}
	}
	
	public String getNumero() {
		return numero;
	}
	public String getTipo() {
		return tipo;
	}
	public String getEstado() {
		return estado;
	}
	
	
	
}
