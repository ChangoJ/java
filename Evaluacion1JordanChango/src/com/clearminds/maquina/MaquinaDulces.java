package com.clearminds.maquina;

import java.util.ArrayList;

import com.clearminds.componentes.Celda;
import com.clearminds.componentes.Producto;

public class MaquinaDulces {
	private ArrayList<Celda> celdas = new ArrayList<Celda>();
	private double saldo;

	public void configurarMaquina(String codigoCelda1, String codigoCelda2, String codigoCelda3, String codigoCelda4) {
		celdas.add(new Celda(codigoCelda1));
		celdas.add(new Celda(codigoCelda2));
		celdas.add(new Celda(codigoCelda3));
		celdas.add(new Celda(codigoCelda4));
	}
	
	public void configurarMaquina(String codigoCelda1, String codigoCelda2, String codigoCelda3, String codigoCelda4, String codigoCelda5, String codigoCelda6) {
		celdas.add(new Celda(codigoCelda1));
		celdas.add(new Celda(codigoCelda2));
		celdas.add(new Celda(codigoCelda3));
		celdas.add(new Celda(codigoCelda4));
		celdas.add(new Celda(codigoCelda5));
		celdas.add(new Celda(codigoCelda6));
	}


	public void mostrarConfiguracion() {
		System.out.println("Configuración de la máquina:");
		for (Celda celda : celdas) {
			System.out.println("Celda: " + celda.getCodigo());
		}
	}
	
	public void agregarCelda(Celda celda) {
		celdas.add(celda);
	}

	 public Celda buscarCelda(String codigoCelda) {
	        for (Celda celda : celdas) {
	            if (celda.getCodigo().equals(codigoCelda)) {
	                return celda;
	            }
	        }
	        return null;
	    }

	public void cargarProducto(Producto producto, String codigoCelda, int cantidadInicial) {
		Celda celdaRecuperada = buscarCelda(codigoCelda);
		if (celdaRecuperada != null) {
			celdaRecuperada.ingresarProducto(producto, cantidadInicial);
		}
	}

	public void mostrarProductos() {
		System.out.println("Productos en las celdas:");
		for (Celda celda : celdas) {
			mostrarProductosEnCelda(celda);
		}


	}

	private void mostrarProductosEnCelda(Celda celda) {
		Producto producto = celda.getProducto();

		if (celda.getProducto() != null) {

			System.out.println("Celda: " + celda.getCodigo() + " Stock: " + celda.getStock() + " Producto: "
					+ producto.getNombre() + "" + " Precio: " + producto.getPrecio());

		} else {
			System.out.println("Celda: " + celda.getCodigo()+ " stock: "+celda.getStock()+" Sin productos asignado");
			
		}
	}

	public Producto buscarProductoEnCelda(String codigoCelda) {
		Celda celda = buscarCelda(codigoCelda);
		return (celda != null) ? celda.getProducto() : null;
	}

	public double consultarPrecio(String codigoCelda) {
		Celda celda = buscarCelda(codigoCelda);
		return (celda != null && celda.getProducto() != null) ? celda.getProducto().getPrecio() : 0.0;
	}

	public Celda buscarCeldaProducto(String codigoProducto) {
		  for (Celda celda : celdas) {
	            if (celda.getProducto() != null && celda.getProducto().getCodigo().equals(codigoProducto)) {
	                return celda;
	            }
	        }
	        return null;
	}

	public void incrementarProductos(String codigoProducto, int cantidadIncremento) {
		Celda celdaEncontrada = buscarCeldaProducto(codigoProducto);
		if (celdaEncontrada != null) {
			int stockActual = celdaEncontrada.getStock();
			celdaEncontrada.setStock(stockActual + cantidadIncremento);
		}
	}

	public void vender(String codigoCelda) {
		Celda celda = buscarCelda(codigoCelda);
		if (celda != null && celda.getStock() > 0) {
			Producto producto = celda.getProducto();
			double precioProducto = producto.getPrecio();
			celda.setStock(celda.getStock() - 1);
			saldo += precioProducto;
			mostrarProductos();
			System.out.println("Saldo de la máquina: " + saldo);
		} else {
			System.out.println("No hay suficiente stock en la celda " + codigoCelda);
		}
	}

	public double venderConCambio(String codigoCelda, double valorIngresado) {
		Celda celda = buscarCelda(codigoCelda);
		if (celda != null && celda.getStock() > 0) {
			Producto producto = celda.getProducto();
			double precioProducto = producto.getPrecio();
			if (valorIngresado >= precioProducto) {
				celda.setStock(celda.getStock() - 1);
				saldo += precioProducto;
				double cambio = valorIngresado - precioProducto;
				mostrarProductos();
				System.out.println("Saldo de la máquina: " + saldo);
				return cambio;
			} else {
				System.out.println("El valor ingresado no es suficiente para comprar el producto.");
			}
		} else {
			System.out.println("No hay suficiente stock en la celda " + codigoCelda);
		}
		return 0.0;
	}
	
	public ArrayList<Producto> buscarMenores(double limite){
		ArrayList<Producto> menores = new ArrayList<Producto>();
		for (Celda itemCelda : celdas) {
			if(itemCelda.getProducto().getPrecio() < limite) {
				menores.add(itemCelda.getProducto());
			}
		}
		
		return menores;
		
	}
	
	public void imprimirMenores(ArrayList<Producto> menores) {
		System.out.println("Produtos Menores: "+menores.size());
		for (Producto itemMenor : menores) {
			System.out.println("Nombre: "+itemMenor.getNombre()+ " Precio: "+itemMenor.getPrecio());
		}
	}
}
