package recursos;


public class AlbumMusica extends RecursoMultimedia {
	static double coheficientePorcentajeAlbum=0.1;
	private Cancion[] canciones;
	
	public AlbumMusica(String nombre) {
		super();
		this.setNombre(nombre);
	}
	
	public Cancion[] getCanciones() {
		return canciones;
	}
	@Override
	public double getPrecioVenta() {
		double precioVenta=0;
		for (Cancion cancion:canciones) {
			precioVenta+=cancion.getCostoAdquisicion();
		}
		precioVenta-=precioVenta*coheficientePorcentajeAlbum;
		return  precioVenta;
	}
	public void setCanciones(Cancion[] canciones) {
		this.canciones = canciones;
	}

	
}
