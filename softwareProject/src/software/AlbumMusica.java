package software;

public class AlbumMusica extends Recurso{

	private Cancion[] listaCanciones;
	private static double descuentoAlbum=0.01;
	
	public AlbumMusica(String nombre) {
		super(nombre);
	}

	public Cancion[] getListaCanciones() {
		return listaCanciones;
	}

	public void setListaCanciones(Cancion[] listaCanciones) {
		this.listaCanciones = listaCanciones;
	}

	@Override
	public double getPrecioVenta() {
		double precio=0;
		for (Cancion cancion: listaCanciones) {
			precio += cancion.getCostoAdquisicion();
		}
		precio -= precio*descuentoAlbum;
		return precio;
	}
	

	
}
