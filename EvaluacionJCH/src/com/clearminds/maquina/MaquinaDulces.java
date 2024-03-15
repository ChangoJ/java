package com.clearminds.maquina;

import com.clearminds.componentes.Celda;
import com.clearminds.componentes.Producto;

public class MaquinaDulces {
	private Celda celda1;
	private Celda celda2;
	private Celda celda3;
	private Celda celda4;
	private double saldo;
	
	public void configurarMaquina(String codigoCelda1, String codigoCelda2, String codigoCelda3, String codigoCelda4) {
        celda1 = new Celda(codigoCelda1);
        celda2 = new Celda(codigoCelda2);
        celda3 = new Celda(codigoCelda3);
        celda4 = new Celda(codigoCelda4);
    }
	
	public void mostrarConfiguracion() {
        System.out.println("Configuración de la máquina:");
        System.out.println("Celda 1: " + celda1.getCodigo());
        System.out.println("Celda 2: " + celda2.getCodigo());
        System.out.println("Celda 3: " + celda3.getCodigo());
        System.out.println("Celda 4: " + celda4.getCodigo());
    }

    public Celda buscarCelda(String codigoCelda) {
        if (celda1 != null && celda1.getCodigo().equals(codigoCelda)) {
            return celda1;
        } else if (celda2 != null && celda2.getCodigo().equals(codigoCelda)) {
            return celda2;
        } else if (celda3 != null && celda3.getCodigo().equals(codigoCelda)) {
            return celda3;
        } else if (celda4 != null && celda4.getCodigo().equals(codigoCelda)) {
            return celda4;
        } else {
            return null;
        }
    }
    
    public void cargarProducto(Producto producto, String codigoCelda, int cantidadInicial) {
        Celda celdaRecuperada = buscarCelda(codigoCelda);
        if (celdaRecuperada != null) {
            celdaRecuperada.ingresarProducto(producto, cantidadInicial);
        }
    }
    
    public void mostrarProductos() {
        System.out.println("Productos en las celdas:");
        mostrarProductosEnCelda(celda1);
        mostrarProductosEnCelda(celda2);
        mostrarProductosEnCelda(celda3);
        mostrarProductosEnCelda(celda4);
    	System.out.println("Saldo: "+saldo);
    }

    private void mostrarProductosEnCelda(Celda celda) {
    	Producto producto = celda.getProducto();
        
    	if (celda.getProducto() != null) {
        	
            System.out.println("**********Celda: " + celda.getCodigo() + "\nStock: " + celda.getStock() + "\nProducto: " + producto.getNombre() + ""
            		+ "\nPrecio: " + producto.getPrecio()+ "\nCodigo: " + producto.getCodigo());
            
    	}else {
        	System.out.println("*******Celda: " + celda.getCodigo());
        	System.out.println("La celda no tiene producto!!!");
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
        if (celda1 != null && celda1.getProducto() != null && celda1.getProducto().getCodigo().equals(codigoProducto)) {
            return celda1;
        } else if (celda2 != null && celda2.getProducto() != null && celda2.getProducto().getCodigo().equals(codigoProducto)) {
            return celda2;
        } else if (celda3 != null && celda3.getProducto() != null && celda3.getProducto().getCodigo().equals(codigoProducto)) {
            return celda3;
        } else if (celda4 != null && celda4.getProducto() != null && celda4.getProducto().getCodigo().equals(codigoProducto)) {
            return celda4;
        } else {
            return null;
        }
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
}
