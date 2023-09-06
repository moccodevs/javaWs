package seguros;
import asegurados.Cliente;
import asegurados.Persona;

public class SeguroBienesMuebles extends Poliza {
	private static double prorrateoMeses=96;
	private double valorProducto;
	
	public SeguroBienesMuebles(double valorProducto,Cliente cliente) {
		super();
		setCliente(cliente);
		setValorProducto(valorProducto);
		setSumaAsegurada(getValorProducto());
		setCuotaMensual(calcularCuotaMensual(valorProducto));
	}
	
	public SeguroBienesMuebles(double valorProducto,Cliente cliente, Persona beneficiario) {
		this(valorProducto,cliente);
		setBeneficiario(beneficiario);
	}
	protected SeguroBienesMuebles(){};
	
	public double calcularCuotaMensual(double montoTotal) {
		return montoTotal/prorrateoMeses;
	}
	
	public static double getProrrateoMeses() {
		return prorrateoMeses;
	}

	public static void setProrrateoMeses(double prorrateoMeses) {
		SeguroBienesMuebles.prorrateoMeses = prorrateoMeses;
	}

	public double getValorProducto() {
		return valorProducto;
	}

	public void setValorProducto(double valorProducto) {
		this.valorProducto = valorProducto;
	}
	
	
}
