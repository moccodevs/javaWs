package asegurados;

public class Cliente extends Persona {
	private static int contador;
	private int codCliente;
	
	public Cliente(int edad) {
		codCliente=contador;
		contador++;
		setEdad(edad);
	}
	public Cliente(int edad, int nroDocumento, String nombre, String apellido) {
		this(edad);
		setNroDocumento(nroDocumento);
		setNombre(nombre);
		setApellido(apellido);
	}
	
	public boolean equals(Persona cliente2) {
		Cliente b= (Cliente)cliente2;
		if (b instanceof Cliente) {
			return this.getNroDocumento()==b.getNroDocumento();
		}
		return false;
	}
	@Override
	public String toString() {
		
		return "N°"+getCodCliente()+"-"+getApellido()+"-"+getNombre()+"-"+getNroDocumento();
		
	}
	
	public int getCodCliente() {
		return codCliente;
	}
	
	public int getContador() {
		return contador;
	}
	
}
