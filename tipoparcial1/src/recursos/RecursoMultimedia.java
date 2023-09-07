package recursos;

public abstract class RecursoMultimedia {
	public static int generadorCodigo=10000;
	public static double coheficientePorcentajeGanancia= 0.3;
	private int codigoRecurso;
	private String nombre;
	private double costoAdquisicion;
	
	public RecursoMultimedia() {
		codigoRecurso=generadorCodigo;
		generadorCodigo++;
	}
	public RecursoMultimedia(String nombre) {
		this();
		this.nombre=nombre;
	}
	public double getPrecioVenta() {
		return (costoAdquisicion*coheficientePorcentajeGanancia)+costoAdquisicion;
	}

	public static double getCoheficientePorcentajeGanancia() {
		return coheficientePorcentajeGanancia;
	}

	public static void setCoheficientePorcentajeGanancia(int coheficientePorcentajeGanancia) {
		RecursoMultimedia.coheficientePorcentajeGanancia = coheficientePorcentajeGanancia;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getCostoAdquisicion() {
		return costoAdquisicion;
	}

	public void setCostoAdquisicion(double costoAdquisicion) {
		this.costoAdquisicion = costoAdquisicion;
	}

	public int getCodigoRecurso() {
		return codigoRecurso;
	}
	
}
