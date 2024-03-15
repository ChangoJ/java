package com.cmc.directorio.entidades;

public class AdminContactos {
	public Contacto buscarMasPeso(Contacto contacto, Contacto contacto2) {
		if (contacto.getPeso() > contacto2.getPeso()) {
			return contacto;
		} else {
			return contacto2;

		}
	}

	public boolean compararOperadores(Contacto contacto, Contacto contacto2) {
		if (contacto.getTelefono().getOperadora() == contacto2.getTelefono().getOperadora()) {
			return true;
		} else {
			return false;
		}
	}
	
	public void activarUsuario(Contacto contacto) {
		if (contacto.getTelefono().isTieneWhatsapp()) {
			contacto.setActivo(true);
		} else {
			contacto.setActivo(false);
		}
	}

}
