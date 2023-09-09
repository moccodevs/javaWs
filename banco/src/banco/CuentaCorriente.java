package banco;

public class CuentaCorriente extends Cuenta {
	public static double coheficienteImpuestoMinimo=0.001;
	public static double coheficienteImpuestoMaximo=0.002;
	public static double coheficienteAlaExtraccion=0.005;
	public static double MontoMinimo=100000;
	
	public CuentaCorriente() {
		super();
	}
	@Override
	public void depositar(double monto) {
		if (monto)
		super.depositar(monto);
	}
}
