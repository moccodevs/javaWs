package principal;

import facturacion.Cliente;
import facturacion.EmpresaDeSoftware;
import facturacion.Factura;
import recursos.Cancion;
import recursos.Serie;
import recursos.Pelicula;
import recursos.RecursoMultimedia;
import recursos.Software;
import recursos.Album;

public class Test {

	public static void main(String[] args) {
		EmpresaDeSoftware empresa = new EmpresaDeSoftware();
		Cliente cliente1 = new Cliente("Martin","Gomez");
		Cliente cliente2 = new Cliente("Carlos","Pintos");
		
		
		
		RecursoMultimedia[] recursos = new RecursoMultimedia[2];
		RecursoMultimedia[] recursos2 = new RecursoMultimedia[1];
		
		recursos[0] = new Cancion("Morocha",1599) ;
		
		recursos[1] = new Software("Sistema operativo Windows");
		recursos[1].setCostoAdquisicion(1500);
		
		recursos2[0] = new Software("Juego - GTA V") ;
		recursos2[0].setCostoAdquisicion(4999);
		
		
		
		/*
		canciones[0] = new Cancion("Morocha");
		canciones[1] = new Cancion("Capo");
		canciones[0].setCostoAdquisicion(150);
		canciones[1].setCostoAdquisicion(183);
		
		Album[] albums = new Album[2] ;
		albums[0] = new Album("Back in black");
		albums[1] = new Album("Flick of the switch");
		albums[0].setCostoAdquisicion(10000);
		albums[1].setCostoAdquisicion(5000);
		albums[0].setCanciones(canciones);
		albums[1].setCanciones(canciones);
		
		Serie serie1 = new Serie(10);
		*/
		Factura factura1 = new Factura();
		factura1.setRecursosMultimedia(recursos);
		factura1.setCliente(cliente1);
		
		Factura factura2 = new Factura();
		factura2.setRecursosMultimedia(recursos2);
		factura2.setCliente(cliente2);
		
		Factura[] facturas = new Factura [2];
		
		facturas[0] = factura1; 
		facturas[1] = factura2; 
		
		
		empresa.setFacturas(facturas);
		empresa.verDetalleFacturaciones();
	}
	

}
