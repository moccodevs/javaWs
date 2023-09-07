package facturacion;

public class Cliente {
	private String nombre;
	private String apellido;
	private String direccion;
	
	public Cliente() {
		
	}
	public Cliente(String nombre,String apellido) {
		this.nombre=nombre;
		this.apellido=apellido;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	
	@Override
	public String toString() {
		return "Cliente: " + nombre + ", " + apellido ;
	}
	
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getDireccion() {
		return direccion;
	}
	
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	
}
