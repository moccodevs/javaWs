package recursos;

import data_abstraction.TipoNombreCompleto;
import data_abstraction.TipoDuracion;

public class Cancion extends AlbumMusica {
	static int cantidadTotalCanciones=0;
	private TipoNombreCompleto artista;
	private TipoDuracion duracion;
	
	public Cancion(String nombre) {
		super(nombre);
		cantidadTotalCanciones++;
	}
	
	public TipoNombreCompleto getArtista() {
		return artista;
	}
	public void setArtista(String nombre, String apellido) {
		this.artista = new TipoNombreCompleto(nombre,apellido);
	}
	public TipoDuracion getDuracion() {
		return duracion;
	}
	public void setDuracion(TipoDuracion duracion) {
		this.duracion = duracion;
	}
	public static int getCantidadTotalCanciones() {
		return cantidadTotalCanciones;
	}
	public void setArtista(TipoNombreCompleto artista) {
		this.artista = artista;
	}
	
	
}
