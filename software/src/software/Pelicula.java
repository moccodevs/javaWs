package software;

public class Pelicula extends Recurso{
	
	private TipoGenero genero;
	private String director;
	
	public Pelicula() {
	}
	
	public Pelicula(String nombre, TipoGenero genero) {
		super(nombre);
		this.genero=genero;
	}
	
	public TipoGenero getGenero() {
		return genero;
	}
	
	public void setGenero(TipoGenero genero) {
		this.genero = genero;
	}
	
	public String getDirector() {
		return director;
	}
	
	public void setDirector(String director) {
		this.director = director;
	}
	
	
}
