package hospital_tp;

public class Medico extends Persona {
	private String especialidadPrincipal;
	private int numeroDeMatricula;
	
	
	public Medico(String nombre, String apellido) {
		super(nombre,apellido);
	}
	public String getEspecialidadPrincipal() {
		return especialidadPrincipal;
	}
	public void setEspecialidadPrincipal(String especialidadPrincipal) {
		this.especialidadPrincipal = especialidadPrincipal;
	}
	public int getNumeroDeMatricula() {
		return numeroDeMatricula;
	}
	public void setNumeroDeMatricula(int numeroDeMatricula) {
		this.numeroDeMatricula = numeroDeMatricula;
	}
	
}
