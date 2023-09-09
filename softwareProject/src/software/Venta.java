package software;

public class Venta{

	private static int generadorCodigoFactura=0;
	private int codigoFactura;
	private Cliente cliente;
	private Recurso[] recursosVendidos;
	private static double descuentoVenta=0.05;
	
	public Venta() {
		generadorCodigoFactura=codigoFactura;
		generadorCodigoFactura ++;
	}
	
	public Venta(Recurso[] recursosVendidos) {
		this();
		this.recursosVendidos=recursosVendidos;
	}
	
	public static int getGeneradorCodigoFactura() {
		return generadorCodigoFactura;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Recurso[] getRecursosVendidos() {
		return recursosVendidos;
	}

	public void setRecursosVendidos(Recurso[] recursosVendidos) {
		this.recursosVendidos = recursosVendidos;
	}

	public double getImporteTotalVenta() {					// saca el importe total de 1 venta(factura). //
		double total=0;
		int cantidad=0;
		for (Recurso recursosVendido: recursosVendidos) {
			total+=recursosVendido.getPrecioVenta();
			cantidad ++;
		}
		if (cantidad > 3) {
			total -=(total*descuentoVenta);
		}
		return total;
	}
	
	public void listarInfoVenta() {
		System.out.println("FACTURA: #"+codigoFactura+"|"+ cliente.toString());
		System.out.println("Productos:");
		for (Recurso recursosVendidos : recursosVendidos) {
			System.out.println("COD#"+recursosVendidos.getCodigo()+"| "+ recursosVendidos.getNombre()+" | Precio:"+recursosVendidos.getPrecioVenta());
		}
		System.out.println("Importe total: "+getImporteTotalVenta());
	}
	
}
