package software;

public class Cancion extends Recurso{

	private String artista;
	private double duracion;
	private static int cantidadCanciones=0;
	
	public Cancion(String nombre, double costo) {
		super(nombre);
		this.setCostoAdquisicion(costo);
		cantidadCanciones++;
		
	}
	
	public String getArtista() {
		return artista;
	}
	
	public void setArtista(String artista) {
		this.artista = artista;
	}
	
	public double getDuracion() {
		return duracion;
	}
	
	public void setDuracion(double duracion) {
		this.duracion = duracion;
	}

	public static int getCantidadCanciones() {
		return cantidadCanciones;
	}
	
	
}
