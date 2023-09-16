package produccion;

import gastos.Gasto;

public class Producto {
	static int generadorDeCodigo=1;
	private String nombre;
	private int codigo;
	private Gasto[] gastos;
	
	
	public Producto() {
		codigo=generadorDeCodigo;
		generadorDeCodigo++;
	}
	public Producto(String nombre) {
		this();
		this.nombre=nombre;
	}
	
	public void listarGastos() {
		for (Gasto gasto: gastos) {
			gasto.listarGasto();
		}
	}
	
	public double getGastosTotales() {
		double gastoTotal=0;
		for (Gasto gasto : gastos) {
			gastoTotal+=gasto.getGasto();
		}
		return gastoTotal;
	}
	
	public boolean equals(Producto producto) {
		if (producto instanceof Producto) {
			return producto.codigo==producto.codigo;
		}
		return false;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public Gasto[] getGastos() {
		return gastos;
	}
	public void setGastos(Gasto[] gastos) {
		this.gastos = gastos;
	}
	
}
