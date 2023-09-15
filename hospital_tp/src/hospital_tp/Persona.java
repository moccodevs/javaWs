package hospital_tp;
/*datos (nombre,
apellido, domicilio, tipo y número de documento) y la obra social con la que cuenta*/

import dataType.Documento;
import dataType.ObraSocial;
import dataType.TipoDomicilio;

public class Persona {
	private String nombre;
	private String apellido;
	private TipoDomicilio domicilio=new TipoDomicilio();
	private Documento documento= new Documento();
	private ObraSocial obraSocial;
	private int telefono;
	
	
	public Persona() {
		
	}
	public Persona(String nombre,String apellido) {
		this.nombre=nombre;
		this.apellido=apellido;
	}
	@Override
	public String toString() {
		return apellido+", "+nombre;
	}
	
	public boolean equals(Persona persona) {
		if (persona instanceof Persona) {
			return this.documento==persona.documento;
			
		}
		return false;
	};
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public TipoDomicilio getDomicilio() {
		return domicilio;
	}
	public void setDomicilio(TipoDomicilio domicilio) {
		this.domicilio = domicilio;
	}
	public Documento getDocumento() {
		return documento;
	}
	public void setDocumento(Documento documento) {
		this.documento = documento;
	}
	public ObraSocial getObraSocial() {
		return obraSocial;
	}
	public void setObraSocial(ObraSocial obraSocial) {
		this.obraSocial = obraSocial;
	}
	public int getTelefono() {
		return telefono;
	}
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	
	
}
