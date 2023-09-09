package software;

public class Software extends Recurso{

	private String fabricante;
	private SistemaOperativoCompatible[] sistemaOperativoCompatible;
	
	
	public Software(String nombre){
		super(nombre);
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
