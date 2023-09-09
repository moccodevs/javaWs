package software;

public abstract class Recurso {

	private String nombre;
	private double costoAdquisicion;
	private int codigo;
	private static int contador=10000;
	private static double porcentajeGanancia=0.03;
	
	public Recurso() {
		codigo=contador;
		contador ++;
	}
	
	public Recurso(String nombre) {
		this();
		this.nombre=nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getCostoAdquisicion() {
		return costoAdquisicion;
	}

	public void setCostoAdquisicion(double costoAdquisicion) {
		this.costoAdquisicion = costoAdquisicion;
	}

	public int getCodigo() {
		return codigo;
	}
	
	public double getPrecioVenta() {
		return (costoAdquisicion * porcentajeGanancia) + costoAdquisicion;
	}



	
}
