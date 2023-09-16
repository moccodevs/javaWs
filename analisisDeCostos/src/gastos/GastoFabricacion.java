package gastos;
import produccion.MateriaPrima;

public class GastoFabricacion extends Gasto {
	private Persona contacto;
	private MateriaPrima[] materiasPrimas;
	private ManoDeObra manoDeObra;
	
	
	public GastoFabricacion(MateriaPrima[] materiasPrimas) {
		this.materiasPrimas=materiasPrimas;
	}
	
	@Override
	public double getGasto() {
		return this.getGastoManoDeObra()+this.getGastoMateriasPrimas();
	}
	
	public double getGastoManoDeObra() {
		return manoDeObra.getCostoHora()*manoDeObra.getHorasDuracion();
	}
	
	public double getGastoMateriasPrimas() {
		double total=0;
		for (MateriaPrima materiaPrima : materiasPrimas) {
			total+=materiaPrima.getCosto();
		}
		return total;
	}
	
	@Override
	public void setNombre(String nombreFabrica) {
		super.setNombre(nombreFabrica);
	}
	
	public void listarMateriasPrimas() {
		for (MateriaPrima materiaPrima : materiasPrimas) {
			System.out.println(materiaPrima.getNombre()+" | Costo: $"+ materiaPrima.getCosto());
		}
	}
	
	public Persona getContacto() {
		return contacto;
	}

	public void setContacto(Persona contacto) {
		this.contacto = contacto;
	}

	public MateriaPrima[] getMateriasPrimas() {
		return materiasPrimas;
	}

	public void setMateriasPrimas(MateriaPrima[] materiasPrimas) {
		this.materiasPrimas = materiasPrimas;
	}

	public ManoDeObra getManoDeObra() {
		return manoDeObra;
	}

	public void setManoDeObra(ManoDeObra manoDeObra) {
		this.manoDeObra = manoDeObra;
	}

	@Override
	public void listarGasto() {
		System.out.println("-----------------------------");
		System.out.println("DATOS DE FABRICACION:");
		System.out.println("Fabrica:"+this.getNombre());
		System.out.println("Contacto de fabrica: " + contacto.getNombre()+" |Telefono: "+contacto.getNumeroDeTelefono());
		System.out.println("Materias primas:");
		listarMateriasPrimas();
		System.out.println("Gasto de mano de obra:"+getGastoManoDeObra());
		System.out.println("-----------------------------");
		
	}
	
}
