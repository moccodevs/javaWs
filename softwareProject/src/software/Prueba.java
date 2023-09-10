package software;

public class Prueba {

	public static void main(String[] args) {
    
	EmpresaDeSoftware empresa = new EmpresaDeSoftware();
	Cliente cliente1 = new Cliente("Juan","Pisso");
    
	Recurso[] recursos = new Recurso[2];
	
	Cancion cancion1=new Cancion("Hare Hare", 1900);
	
	Cancion[] canciones1 = new Cancion[2];
	canciones1[0]= cancion1; 
	canciones1[1]= new Cancion("capocapo",1200);
	
	AlbumMusica album1=new AlbumMusica("Breakout");
	album1.setListaCanciones(canciones1);
	
	AlbumMusica album2=new AlbumMusica("Album2");
	album2.setListaCanciones(canciones1);
	
	recursos[0]=album1;
	recursos[1]=album2;
	
	Venta factura1= new Venta();
	factura1.setRecursosVendidos(recursos);
	factura1.setCliente(cliente1);
	
	Venta[] facturas= new Venta[1];
	facturas[0]= factura1;

	empresa.setFacturas(facturas);
	empresa.verDetalleFacturas();
	
	}
}