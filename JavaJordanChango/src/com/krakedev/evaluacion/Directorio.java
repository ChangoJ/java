package com.krakedev.evaluacion;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class Directorio {
	private ArrayList<Contacto> contactos = new ArrayList<Contacto>();
	private Date fechaModificacion;
	private ArrayList<Contacto> correctos = new ArrayList<Contacto>();
	private ArrayList<Contacto> incorrectos = new ArrayList<Contacto>();

	
	public void depurar() {
		for (Contacto contacto : contactos) {
			if (contacto.getDireccion() == null) {
				incorrectos.add(contacto);
			}else {
				correctos.add(contacto);
			}
		}
		
		contactos.clear();
	}
	
	public int contarPerdidos() {
		int contador = 0;
		for (Contacto contacto : contactos) {
			if (contacto.getDireccion() == null) {
				contador++;
			}
		}

		return contador;
	}

	public int contarFijos() {
		int contador = 0;
		Telefono telefono;
		for (Contacto contacto : contactos) {
			
			for (int i = 0; i < contacto.getTelefonos().size(); i++) {
				telefono = contacto.getTelefonos().get(i);
				if(telefono.getTipo().equalsIgnoreCase("convencional") &&  telefono.getEstado().equalsIgnoreCase("C")) {
					contador++;
				}
			}

		}

		return contador;
	}

	public String consultarUltimaModificacion() {

		Date fechaActual = new Date();

		SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

		String fechaFormateada = formato.format(fechaActual);

		return fechaFormateada;
	}

	public boolean agregarContacto(Contacto contacto) {
		boolean contactoVerificar = false;

		contactoVerificar = buscarPorCedula(contacto.getCedula());

		if (!contactoVerificar) {
			contactos.add(contacto);
			consultarUltimaModificacion();
			return true;
		} else {
			return false;
		}

	}

	public boolean buscarPorCedula(String cedula) {
		boolean verificador = false;
		Contacto contactoEncontrado = null;
		for (Contacto contacto : contactos) {
			if (contacto.getCedula().equals(cedula)) {
				verificador = true;

			}
		}

		if (!verificador) {
			return false;
		} else {
			return true;
		}
	}

	public ArrayList<Contacto> getContactos() {
		return contactos;
	}

	public void setContactos(ArrayList<Contacto> contactos) {
		this.contactos = contactos;
	}

	public Date getFechaModificacion() {
		return fechaModificacion;
	}

	public void setFechaModificacion(Date fechaModificacion) {
		this.fechaModificacion = fechaModificacion;
	}

	public ArrayList<Contacto> getCorrectos() {
		return correctos;
	}

	public void setCorrectos(ArrayList<Contacto> correctos) {
		this.correctos = correctos;
	}

	public ArrayList<Contacto> getIncorrectos() {
		return incorrectos;
	}

	public void setIncorrectos(ArrayList<Contacto> incorrectos) {
		this.incorrectos = incorrectos;
	}
	
	

}
