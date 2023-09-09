package software;

public class EmpresaDeSoftware {

	private Venta[] facturas;

	public Venta[] getFacturas() {
		return facturas;
	}

	public void setFacturas(Venta[] facturas) {
		this.facturas = facturas;
	}
	
	public void verDetalleFacturas() {
		double total=0;
		System.out.println("FACTURACIONES:");
		for (Venta facturas : facturas) {
			facturas.listarInfoVenta();
			total += facturas.getImporteTotalVenta();
		}
		System.out.println("---------------------------------------------------------");
		System.out.println("TOTAL VENTAS: "+ total);
	}
}
