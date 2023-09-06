package asegurados;

public class Persona {
	private int nroDocumento;
	private String apellido;
	private String nombre;
	private int edad;
	
	protected Persona() {
		
	}
	public Persona(int edad) {
		setEdad(edad);

	}
	
	public int getNroDocumento() {
		return nroDocumento;
	}
	public void setNroDocumento(int nroDocumento) {
		this.nroDocumento = nroDocumento;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	protected void setEdad(int edad) {
		this.edad = edad;
	}
	
}
