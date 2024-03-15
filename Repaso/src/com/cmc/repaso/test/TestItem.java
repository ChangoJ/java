package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Item;

public class TestItem {
	public static void main(String[] args) {
		Item item = new Item("Helado",20);
		Item item2 = new Item("Chocolate",5);
		
		item.imprimir();
		item.vender(2);
		item.imprimir();
		item.devolver(1);
		item.imprimir();
		
		
		item2.imprimir();
		item2.vender(5);
		item2.imprimir();
		item2.devolver(1);
		item2.imprimir();
	}
}
