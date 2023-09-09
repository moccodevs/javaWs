package software;

public class Prueba {

	public static void main(String[] args) {
		
		
	EmpresaDeSoftware empresa = new EmpresaDeSoftware();
	Cliente cliente1 = new Cliente("Juan","Pisso");
	Cliente cliente2 = new Cliente("Mar","Michellini");
	Cliente cliente3 = new Cliente("Jorge","Lituano");
		
	RecursosVendidos[] recursos = new RecursosVendidos[2];
	RecursosVendidos[] recursos2 = new RecursosVendidos[1];
	
	recursos[0] = new Cancion("Hare Hare", 3454);
	recursos[1] = new Software("Windows");
	recursos[1].setCostoAdquisicion(459);
	
	
	
	
	
	
		
	
	

	
	
	
	}

	
}
