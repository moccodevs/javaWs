package hospital_tp;

import dataType.tipoComplejidad;

public class Habitacion {
	private tipoComplejidad complejidad;
	private boolean banioPrivado;
	public double costoDiario;
	public int numero;
	
	
	public Habitacion() {
		
	}
	public Habitacion(double costoDiario) {
		this.costoDiario=costoDiario;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public tipoComplejidad getComplejidad() {
		return complejidad;
	}
	public void setComplejidad(tipoComplejidad complejidad) {
		this.complejidad = complejidad;
	}
	public boolean isBanioPrivado() {
		return banioPrivado;
	}
	public void setBanioPrivado(boolean banioPrivado) {
		this.banioPrivado = banioPrivado;
	}
	public double getCostoDiario() {
		return costoDiario;
	}
	public void setCostoDiario(int costoDiario) {
		this.costoDiario = costoDiario;
	}
}
