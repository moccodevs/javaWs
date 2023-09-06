package recursos;

import data_abstraction.TipoGenero;
import data_abstraction.TipoNombreCompleto;

public class Pelicula extends RecursoMultimedia {
	private TipoGenero genero;
	private TipoNombreCompleto director;
	
	public Pelicula(TipoGenero genero) {
		super();
		director = new TipoNombreCompleto();
		this.genero=genero;
	}
	
	public TipoGenero getGenero() {
		return genero;
	}

	public void setGenero(TipoGenero genero) {
		this.genero = genero;
	}

	public TipoNombreCompleto getDirector() {
		return director;
	}

	public void setDirector(TipoNombreCompleto director) {
		this.director = director;
	}
	
}
