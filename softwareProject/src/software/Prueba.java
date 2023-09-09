package software;

public class Prueba {

	public static void main(String[] args) {
    
	EmpresaDeSoftware empresa = new EmpresaDeSoftware();
	Cliente cliente1 = new Cliente("Juan","Pisso");
	Cliente cliente2 = new Cliente("Mar","Michellini");
	Cliente cliente3 = new Cliente("Jorge","Lituano");
    
	Recurso[] recursos = new Recurso[2];
	Recurso[] recursos2 = new Recurso[1];
	Recurso[] recursos3 = new Recurso[2];
	
	
	Cancion cancion1=new Cancion("Hare Hare", 1900);
	
	recursos[0] = cancion1;
	recursos[0].setCostoAdquisicion(459);
	recursos[1] = new Software("Windows");
	recursos[1].setCostoAdquisicion(459);
	
	recursos2[0]= new Software("Juego Age of Empires");
	recursos2[0].setCostoAdquisicion(2599);
	
	
	Cancion[] canciones1 = new Cancion[1];
	canciones1[0]= cancion1; 
	
	Cancion[] canciones2 = new Cancion[1];
	canciones1[0]= cancion1; 
	
	
	AlbumMusica album1=new AlbumMusica("Breakout");
	album1.setCostoAdquisicion(7500);
	album1.setListaCanciones(canciones1);
	
	AlbumMusica album2= new AlbumMusica("Cant be tamed");
	album2.setCostoAdquisicion(5500);
	album2.setListaCanciones(canciones2);
	
	recursos3[0]= album1;
	recursos3[1]= album2;


	Venta factura1= new Venta();
	factura1.setRecursosVendidos(recursos);
	factura1.setCliente(cliente1);
	
	Venta factura2=new Venta();
	factura2.setRecursosVendidos(recursos2);
	factura2.setCliente(cliente2);
	
	Venta factura3=new Venta();
	factura3.setCliente(cliente3);
	factura3.setRecursosVendidos(recursos3);
	
	Venta[] facturas= new Venta[3];
	facturas[0]= factura1;
	facturas[1]= factura2;
	facturas[2]= factura3;
	
	empresa.setFacturas(facturas);
	empresa.verDetalleFacturas();
	
	
	
	
	}

	
}