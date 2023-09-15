package hospital_tp;

public class Hospital {
	private Internacion[] internaciones;

	public Internacion[] getInternaciones() {
		return internaciones;
	}

	public void setInternaciones(Internacion[] internaciones) {
		this.internaciones = internaciones;
	}
	
	
	public void listarInternaciones(){
		int totalInternaciones=0;
		System.out.println("INTERNACIONES:");
		for (Internacion internacion: internaciones) {
			System.out.println("#"+internacion.getCodigo()+"|"+internacion.getPersona().toString()+"| Habitacion #"+internacion.getHabitacion().getNumero()+"| costo: $"+internacion.getCostoInternacion());
			totalInternaciones+=internacion.getCostoInternacion();
		}
		System.out.println("Costo total de internaciones: $" + totalInternaciones);
	}
}
