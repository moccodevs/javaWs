package facturacion;

import recursos.RecursoMultimedia;

public class Factura {
	static int generadorCodigoFactura=0;
	private int codigoFactura;
	private Cliente cliente;
	private RecursoMultimedia[] recursosMultimedia;
	
	public Factura() {
		codigoFactura=generadorCodigoFactura;
		generadorCodigoFactura++;
		cliente= new Cliente();
	}
	public Factura(RecursoMultimedia[] recursosMultimedia) {
		this();
		this.recursosMultimedia=recursosMultimedia;
	}
	public void setRecursosMultimedia(RecursoMultimedia[] recursosMultimedia) {
		this.recursosMultimedia = recursosMultimedia;
	}
	
	public RecursoMultimedia[] getRecursosMultimedia() {
		return recursosMultimedia;
	}
	
	public void listarInfoFactura() {
		System.out.println("---------------------------------------------------------");
		System.out.println("FACTURA: #"+codigoFactura+"|"+cliente.toString());
		System.out.println("Productos:");
		for (RecursoMultimedia recursoMultimedia : recursosMultimedia) {
			System.out.println("COD#"+recursoMultimedia.getCodigoRecurso()+"| "+ recursoMultimedia.getNombre()+" | Precio:"+recursoMultimedia.getPrecioVenta());
		}
		System.out.println("Importe total: "+getImporteTotal());
	}
	
	public double getImporteTotal() {
		double total = 0;
		for (RecursoMultimedia recursoMultimedia : recursosMultimedia) {
			total+=recursoMultimedia.getPrecioVenta();
		}
		return total;
	}
	
	public int getCodigoFactura() {
		return codigoFactura;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	
	
	
}
