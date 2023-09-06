package recursos;

public abstract class RecursoMultimedia {
	public static int generadorCodigo=10000;
	public static double coheficientePorcentajeGanancia= 0.3;
	private int codigoRecurso;
	private int nombre;
	private double costoAdquisicion;
	
	public RecursoMultimedia() {
		generadorCodigo++;
		codigoRecurso=generadorCodigo;
	}
	
	public double calcularPrecioVenta() {
		return (costoAdquisicion*coheficientePorcentajeGanancia)+costoAdquisicion;
	}

	public static double getCoheficientePorcentajeGanancia() {
		return coheficientePorcentajeGanancia;
	}

	public static void setCoheficientePorcentajeGanancia(int coheficientePorcentajeGanancia) {
		RecursoMultimedia.coheficientePorcentajeGanancia = coheficientePorcentajeGanancia;
	}

	public int getNombre() {
		return nombre;
	}

	public void setNombre(int nombre) {
		this.nombre = nombre;
	}

	public double getCostoAdquisicion() {
		return costoAdquisicion;
	}

	public void setCostoAdquisicion(double costoAdquisicion) {
		this.costoAdquisicion = costoAdquisicion;
	}

	public static int getGeneradorCodigo() {
		return generadorCodigo;
	}
	public int getCodigoRecurso() {
		return codigoRecurso;
	}
	
}
