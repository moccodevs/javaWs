package primerProyecto;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ventana ventana = new Ventana();
		ventana.setVisible(true);
		Bicharraco dientudo = new Bicharraco("dientudo",2,AttackType.fogonazo);
		Bicharraco peludo = new Bicharraco("peludo",3,AttackType.cabezazo);
		dientudo.atacarA(peludo);
	}
}