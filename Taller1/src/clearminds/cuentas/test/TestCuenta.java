package clearminds.cuentas.test;

import clearminds.cuentas.Cuenta;

public class TestCuenta {

	public static void main(String[] args) {
		Cuenta cuenta1 = new Cuenta("03476");
		Cuenta cuenta2 = new Cuenta("03476","C",98);
		Cuenta cuenta3 = new Cuenta("03476");
		Cuenta cuenta4 = new Cuenta("0987");
		Cuenta cuenta5 = new Cuenta("0557","C",10);
		Cuenta cuenta6 = new Cuenta("0666");
		
		cuenta1.setSaldo(444);
		cuenta2.setTipo("D");
		cuenta3.setSaldo(567);
		cuenta4.setSaldo(10);
		
		System.out.println("------VALORES INICIALES---");
		cuenta1.imprimirConMiEstilo();
		cuenta2.imprimirConMiEstilo();
		cuenta3.imprimirConMiEstilo();
		System.out.println("------VALORES MODIFICADOS---");
		
		cuenta4.imprimirConMiEstilo();
		cuenta5.imprimirConMiEstilo();
		cuenta6.imprimirConMiEstilo();

	}

}
