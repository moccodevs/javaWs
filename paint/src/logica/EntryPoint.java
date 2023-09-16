package logica;
import java.awt.event.KeyEvent;
import gui.Window;

public class EntryPoint {
	private static int value=99999;
	private static int a,b;
	
	public static void main(String[] args) {
		
		Window ventana = new Window();
	
		for (int i=0;i<value;i++) {
			
			ventana.pintarLinea(i,i+24,33,10);
			
		}
		System.out.println(ventana.countComponents());
	}
}
