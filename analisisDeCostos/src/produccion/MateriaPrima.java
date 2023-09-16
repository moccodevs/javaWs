package produccion;

public class MateriaPrima {
	private String nombre;
	private double costo;
	private boolean esNacional;
	
	public MateriaPrima() {
		
	}
	public MateriaPrima(String nombre, double costo) {
		this.costo=costo;
		this.nombre=nombre;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getCosto() {
		return costo;
	}
	public void setCosto(double costo) {
		this.costo = costo;
	}
	public boolean isEsNacional() {
		return esNacional;
	}
	public void setEsNacional(boolean esNacional) {
		this.esNacional = esNacional;
	}
}
