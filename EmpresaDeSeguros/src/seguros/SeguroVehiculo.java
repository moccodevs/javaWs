package seguros;
import java.time.LocalDate;

import asegurados.Cliente;
import asegurados.Persona;
import asegurados.Vehiculo;

public class SeguroVehiculo extends SeguroBienesMuebles {
	private static double porcentajeDescuentoPorAnio=0.02;
	private static int anioActual= LocalDate.now().getYear();
	private Vehiculo vehiculo;
	
	public SeguroVehiculo(Cliente cliente,Vehiculo vehiculo) {
		super();
		setVehiculo(vehiculo);
		setCliente(cliente);
		setValorProducto(vehiculo.getValor());
		setCuotaMensual(calcularCuotaMensual(calcularMontoTotal()));
	}
	
	public SeguroVehiculo(Cliente cliente,Vehiculo vehiculo,Persona beneficiario) {
		this(cliente,vehiculo);
		setBeneficiario(beneficiario);
	}
	
	private double calcularMontoTotal() {
		int aniosAntiguedad=anioActual-vehiculo.getModelo();
		double porcentajeTotal=porcentajeDescuentoPorAnio*aniosAntiguedad;
		return getValorProducto()-(getValorProducto()*porcentajeTotal);
	}
	
	private void setVehiculo(Vehiculo vehiculo) {
		this.vehiculo=vehiculo;
	}
	public static double getPorcentajeDescuentoPorAnio() {
		return porcentajeDescuentoPorAnio;
	}

	public static void setPorcentajeDescuentoPorAnio(double porcentajeDescuentoPorAnio) {
		SeguroVehiculo.porcentajeDescuentoPorAnio = porcentajeDescuentoPorAnio;
	}
	
}
