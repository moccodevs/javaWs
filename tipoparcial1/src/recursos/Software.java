package recursos;

import data_abstraction.SistemaOperativoCompatible;

public class Software extends RecursoMultimedia {
	private String fabricante;
	private SistemaOperativoCompatible[] sistemaOperativoCompatible;
	
	public Software(String fabricante) {
		super();
		this.fabricante=fabricante;
	}
	public String getFabricante() {
		return fabricante;
	}
	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}
	public SistemaOperativoCompatible[] getSistemaOperativoCompatible() {
		return sistemaOperativoCompatible;
	}
	public void setSistemaOperativoCompatible(SistemaOperativoCompatible[] sistemaOperativoCompatible) {
		this.sistemaOperativoCompatible = sistemaOperativoCompatible;
	}
	
	
}
