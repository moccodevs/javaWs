package poo.tp1;
/*
toString: Redefinir el método para que devuelva una cadena de la forma "Marca Modelo - Patente". Ejemplo "Fiat Argo - AA234BB"
Arrancar: Imprime por consola un mensaje que el auto se está encendido. Para nombrar el auto, utilice el metodo toString. Ejemplo "Encenciendo el Fiat Argo - AA234BB"
Avanzar (parámetro velocidad): imprime en consola el texto "Avanzando... a xxx km/h"
Frenar: imprime en consola el texto "Frenando..."
 */
public class Automovil {
	private String marca;
	private String modelo;
	private int anio;
	private String patente;
	private String color;
	private int velocidadMaxima;
	
	//constructor
	public Automovil() {
		
	}
	
	@Override
	public String toString() {
		return this.getMarca()+" "+this.getModelo()+" - "+this.getPatente();
	}
	public void arrancar() {
		System.out.println("Encendiendo el "+this.toString());
	}
	public void avanzar() {
		System.out.println("Avanzando...a "+this.getVelMax()+" km/h");
	}
	public void frenar() {
		System.out.println("Frenando...");
	}
	
	//Seters
	
	public void setMarca(String marca) {
		this.marca=marca;
	}
	public void setModelo(String modelo) {
		this.modelo=modelo;
	}
	public void setAnio(int anio) {
		this.anio=anio;
	}
	public void setPatente(String patente) {
		this.patente=patente;
	}
	public void setColor(String color) {
		this.color=color;
	}
	public void setVelMax(int velocidadMaxima) {
		this.velocidadMaxima=velocidadMaxima;
	}
	
	//Geters

	public String getMarca() {
		return this.marca;
	}
	public String getModelo() {
		return this.modelo;
	}
	public int getAnio() {
		return this.anio;
	}
	public String getPatente() {
		return this.patente;
	}
	public String getColor() {
		return this.color;
	}
	public int getVelMax() {
		return this.velocidadMaxima;
	}
	
}
