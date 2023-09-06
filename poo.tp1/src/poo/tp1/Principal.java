package poo.tp1;

/* Crear un programa de prueba con:

Instancia de la clase creada.
Setee las propiedades.
Llame al método arrancar, avanzar y frenar.

*/

public class Principal {

	public static void main(String[] args) {
		Automovil auto1 = new Automovil();
		auto1.setMarca("Volkswagen");
		auto1.setModelo("Gol");
		auto1.setAnio(2009);
		auto1.setVelMax(190);
		auto1.setPatente("AA234CB");
		auto1.arrancar();
		auto1.avanzar();
		auto1.frenar();
	}

}
