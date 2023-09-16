package gastos;

import dataType.TipoTransporte;

public class GastoTransporte extends Gasto {
	private TipoTransporte medioDeTransporte;
	private double costoPorKm;
	private double distanciaEnKm;
	
	
	public GastoTransporte(double costoPorKm, double distanciaEnKm) {
		this.costoPorKm=costoPorKm;
		this.distanciaEnKm=distanciaEnKm;
		
	}
	
	@Override
	public double getGasto() {
		return costoPorKm*distanciaEnKm;
	}
	
	public double getDistanciaEnKm() {
		return distanciaEnKm;
	}

	public void setDistanciaEnKm(double distanciaEnKm) {
		this.distanciaEnKm = distanciaEnKm;
	}

	public TipoTransporte getMedioDeTransporte() {
		return medioDeTransporte;
	}
	public void setMedioDeTransporte(TipoTransporte medioDeTransporte) {
		this.medioDeTransporte = medioDeTransporte;
	}
	public double getCostoPorKm() {
		return costoPorKm;
	}
	public void setCostoPorKm(double costoPorKm) {
		this.costoPorKm = costoPorKm;
	}

	@Override
	public void listarGasto() {
		System.out.println("TRANSPORTE");
		System.out.println("Medio:"+getMedioDeTransporte()+"| Costo: $"+getGasto());
		
	}

	
	
}
