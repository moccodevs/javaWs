package analisisDeCostos;

import produccion.Producto;

public class AnalisisDeCostos {
	private Producto[] productos;
	
	public void listarProductos() {
		System.out.println("PRODUCTOS:");
		for (Producto producto: productos) {
			System.out.println("________________________________________________________");
			System.out.println("PRODUCTO #"+producto.getCodigo()+"|"+producto.getNombre()+"|");
			producto.listarGastos();
			System.out.println();
			System.out.println("COSTO TOTAL:"+producto.getGastosTotales());
		}
	}

	public Producto[] getProductos() {
		return productos;
	}

	public void setProductos(Producto[] productos) {
		this.productos = productos;
	}
}
