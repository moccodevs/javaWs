package produccion;

public class ProductoEspecial extends Producto {
	private static double CoheficientePorcentajeAdicional = 0.03;
	private String descripcionAdicional;
	
	public ProductoEspecial() {
		super();
	}
	public ProductoEspecial(String descripcionAdicional) {
		this();
		this.descripcionAdicional=descripcionAdicional;
	}
	
	@Override
	public double getGastosTotales() {
		return super.getGastosTotales()+(super.getGastosTotales()*CoheficientePorcentajeAdicional);
	}
}
