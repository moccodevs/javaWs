package gastos;

import dataType.TipoComercializacion;

public class GastoComercializacion extends Gasto {
	
	public static double costoFijo=2000;
	private TipoComercializacion tipoComercializacion;
	
	public static double getCostoFijo() {
		return costoFijo;
	}
	public static void setCostoFijo(double costoFijo) {
		GastoComercializacion.costoFijo = costoFijo;
	}
	public TipoComercializacion getTipoComercializacion() {
		return tipoComercializacion;
	}
	public void setTipoComercializacion(TipoComercializacion tipoComercializacion) {
		this.tipoComercializacion = tipoComercializacion;
	}
	@Override
	public double getGasto() {
		return costoFijo;
	}
	@Override
	public void listarGasto() {
		System.out.println("-----------------------------");
		System.out.println("DATOS DE COMERCIALIZACION");
		System.out.println("Tipo: "+tipoComercializacion+" | Costo: $"+costoFijo);
		
	}
}
