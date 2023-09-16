package gastos;

public abstract class Gasto {
	private String nombre;
	private String descripcion;
	
	public abstract double getGasto();
	public abstract void listarGasto();
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
}
