package facturacion;

public class EmpresaDeSoftware {
	private Factura[] facturas;

	public Factura[] getFacturas() {
		return facturas;
	}

	public void setFacturas(Factura[] facturas) {
		this.facturas = facturas;
	}
	
	public void verDetalleFacturaciones() {
		double total=0;
		System.out.println("FACTURACIONES:");
		for (Factura factura : facturas) {
			factura.listarInfoFactura();
			total += factura.getImporteTotal();
		}
		System.out.println("---------------------------------------------------------");
		System.out.println("TOTAL VENTAS: "+ total);
	}
	
}
