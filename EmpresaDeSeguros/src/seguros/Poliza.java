package seguros;

import asegurados.Cliente;
import asegurados.Persona;

public class Poliza {
	private static int contador;
	private int nroPoliza;
	private Cliente cliente;
	private Persona beneficiario;
	private double cuotaMensual;
	private double sumaAsegurada;
	
	public Poliza() {
		nroPoliza = contador;
		contador++;
	}

	public String toString() {
		return "CLIENTE: " + cliente.toString()+" / N°POLIZA:"+ getNroPoliza()+" / SUMA ASEGURADA:"+getSumaAsegurada()+" / CUOTA:" +getCuotaMensual();
	}
	public static int getContador() {
		return contador;
	}

	public int getNroPoliza() {
		return nroPoliza;
	}

	public void setNroPoliza(int nroPoliza) {
		this.nroPoliza = nroPoliza;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Persona getBeneficiario() {
		return beneficiario;
	}

	public void setBeneficiario(Persona beneficiario) {
		this.beneficiario = beneficiario;
	}

	public double getCuotaMensual() {
		return cuotaMensual;
	}

	protected void setCuotaMensual(double cuotaMensual) {
		this.cuotaMensual = cuotaMensual;
	}

	public double getSumaAsegurada() {
		return sumaAsegurada;
	}

	public void setSumaAsegurada(double sumaAsegurada) {
		this.sumaAsegurada = sumaAsegurada;
	}
	
}
