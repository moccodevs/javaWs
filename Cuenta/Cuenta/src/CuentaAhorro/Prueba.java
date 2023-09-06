package CuentaAhorro;

public class Prueba {
	public static void main(String[] args) {

	CuentaDeAhorro[] cuenta = new CuentaDeAhorro[2];
	
	CuentaDeAhorro cuenta1 = new CuentaDeAhorro();
	CuentaDeAhorro cuenta2 = new CuentaDeAhorro();
			
	cuenta [0]= cuenta1;
	cuenta [1]= cuenta2;

	cuenta1.setSaldo(10000);
	cuenta2.setSaldo(20000);
	
	System.out.println(cuenta1.calcularInteresMensual());
	CuentaDeAhorro.modificarTasaInteres(0.04);
	System.out.println("el resultado del interes mensual con la nueva tasa es " + cuenta1.calcularInteresMensual());
	System.out.println("el resultado del interes mensual con la nueva tasa es " + cuenta2.calcularInteresMensual());
	
	CuentaDeAhorro.modificarTasaInteres(0.05);
	System.out.println("el resultado del interes mensual con la nueva tasa es " + cuenta1.calcularInteresMensual());
	System.out.println("el resultado del interes mensual con la nueva tasa es " + cuenta2.calcularInteresMensual());

	}
}
