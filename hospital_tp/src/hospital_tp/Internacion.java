package hospital_tp;

import dataType.PracticaMedica;
import dataType.tipoCausa;

public class Internacion {
	static double costoDesinfeccion=5000;
	static int generadorDeCodigo=1;
	private int codigo;
	private tipoCausa causa;
	private Persona paciente;
	private Medico medico;
	private Habitacion habitacion;
	private int cantidadDias ;
	private PracticaMedica[] practicas;
	private boolean derivacion;
	
	
	public Internacion() {
		codigo=generadorDeCodigo;
		generadorDeCodigo++;
	}
	
	public Internacion(Persona paciente) {
		this();
		this.paciente=paciente;
	}
	public double getCostoInternacion() {
		double costo=0;
		if (causa==tipoCausa.COVID) {
			costo=costoDesinfeccion;
		}
		for (PracticaMedica practica:practicas) {
			costo+=practica.getCosto();
		}
		costo+=(cantidadDias*habitacion.getCostoDiario());
		return costo;
		
	}

	public tipoCausa getCausa() {
		return causa;
	}

	public void setCausa(tipoCausa causa) {
		this.causa = causa;
	}

	public Persona getPersona() {
		return paciente;
	}

	public void setPersona(Persona paciente) {
		this.paciente = paciente;
	}

	public Medico getMedico() {
		return medico;
	}

	public void setMedico(Medico medico) {
		this.medico = medico;
	}

	public Habitacion getHabitacion() {
		return habitacion;
	}

	public void setHabitacion(Habitacion habitacion) {
		this.habitacion = habitacion;
	}

	public int getCantidadDias() {
		return cantidadDias;
	}

	public void setCantidadDias(int cantidadDias) {
		this.cantidadDias = cantidadDias;
	}

	public boolean isDerivacion() {
		return derivacion;
	}

	public void setDerivacion(boolean derivacion) {
		this.derivacion = derivacion;
	}

	public PracticaMedica[] getPracticas() {
		return practicas;
	}

	public void setPracticas(PracticaMedica[] practicas) {
		this.practicas = practicas;
	}

	public int getCodigo() {
		return codigo;
	}
	
	
	
}
