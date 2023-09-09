package banco;

public class Cuenta {
	private static int generadorDeCodigo;
	private int codigo;
	private double saldo;
	private Cliente cliente;
	
	//TODO
	/*Para cada cuenta se debe permitir obtener el saldo de la cuenta (dinero disponible),
	 *depositar y extraer dinero.*/
	
	public Cuenta() {
		generadorDeCodigo++;
		this.codigo=generadorDeCodigo;
	}
	
	public void retirar(double monto) {
		if (monto<getSaldo()) {
			setSaldo(getSaldo()-monto);
		}
		else {
			System.out.println("Saldo insuficiente para esta operacion");			
		}
	}
	
	public void depositar(double monto) {
		setSaldo(getSaldo()+monto);
	}
	
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	
}
