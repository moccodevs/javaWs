package CuentaAhorro;

public class CuentaDeAhorro {

	private static double tasaInteresAnual=0.20;  //variable de clase
	private float saldo;


public CuentaDeAhorro(){
}


public void setSaldo(float saldo) {
	this.saldo=saldo;
}

public float getSaldo() {
	return saldo;
}

public double calcularInteresMensual() {
	return (getSaldo() * (tasaInteresAnual/12))+getSaldo();
}

public static void modificarTasaInteres(double nuevaTasa) {
	tasaInteresAnual=nuevaTasa;
}


}