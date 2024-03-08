package clearminds.cuentas;

public class Cuenta {
	private String id;
	private String tipo;
	private double saldo;
	
	
	
	public Cuenta(String id) {
		this.id = id;
		this.tipo = "A";
	}
	

	public Cuenta(String id, String tipo, double saldo) {
		this.id = id;
		this.tipo = tipo;
		this.saldo = saldo;
	}
	
	public void imprimirConMiEstilo() {
		System.out.println("*****************\n"
				+ "CUENTA\n"
				+ "**********************\n"
				+ "Número de cuenta: "+getId()+"\n"
				+ "Tipo: "+getTipo()+"\n"
				+ "Saldo: "+getSaldo()+"\n"
				+ "************\n");
	}
	
	public String getId() {
		return id;
	}
	
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	

}
