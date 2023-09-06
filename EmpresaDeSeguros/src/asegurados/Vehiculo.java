package asegurados;

public class Vehiculo {
	private String marca;
	private int modelo;
	private double valor;
	
	public Vehiculo(int modelo,double valor) {
		this.modelo=modelo;
		this.valor=valor;
	}
	
	public Vehiculo(int modelo,double valor, String marca) {
		this(modelo,valor);
		setMarca(marca);
	}
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public int getModelo() {
		return modelo;
	}
	public double getValor() {
		return valor;
	}
	
}
