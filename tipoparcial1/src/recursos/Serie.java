package recursos;

public class Serie extends Pelicula {
	private int episodios;

	public Serie(int episodios) {
		super(null);
		this.episodios=episodios;
	}
	public int getEpisodios() {
		return episodios;
	}

	public void setEpisodios(int episodios) {
		this.episodios = episodios;
	}	
}
