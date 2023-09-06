package asegurados;

public class Beneficiario extends Persona {
	public Beneficiario(int edad) {
		super(edad);
	}
	
	public Beneficiario(int edad, int nroDocumento, String nombre, String apellido) {
		this(edad);
		setNroDocumento(nroDocumento);
		setNombre(nombre);
		setApellido(apellido);
	}
	
	public String toString() {
		return getApellido()+"-"+getNombre()+"-"+getNroDocumento();
	}
}
