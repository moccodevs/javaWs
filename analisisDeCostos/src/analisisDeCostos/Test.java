package analisisDeCostos;
import dataType.TipoComercializacion;
import dataType.TipoTransporte;
import gastos.Gasto;
import gastos.GastoComercializacion;
import gastos.GastoFabricacion;
import gastos.GastoTransporte;
import gastos.ManoDeObra;
import gastos.Persona;
import produccion.MateriaPrima;
import produccion.Producto;

public class Test {

	public static void main(String[] args) {
		Producto[] productos = new Producto[2];
		
		Persona contacto = new Persona("Sergio Contreras", 154389094);
		Persona contacto2 = new Persona("Ariel Martinez", 156389044);
		
		Producto producto1 = new Producto("Yerba Mate");
		Producto producto2 = new Producto("Hamburguesas");
		
		MateriaPrima[] materiasPrimas1 = new MateriaPrima [2];
		materiasPrimas1[0]= new MateriaPrima("yerba",400);
		materiasPrimas1[1]= new MateriaPrima("Yuyos",100);
		
		MateriaPrima[] materiasPrimas2 = new MateriaPrima [2];
		materiasPrimas2[0]= new MateriaPrima("Carne",400);
		materiasPrimas2[1]= new MateriaPrima("Soja",100);
		
		Gasto[] gastos1 = new Gasto[3];
		Gasto[] gastos2 = new Gasto[3];
		
		ManoDeObra manoDeObra1 = new ManoDeObra();
		manoDeObra1.setCostoHora(100);
		manoDeObra1.setHorasDuracion(2);
		ManoDeObra manoDeObra2 = new ManoDeObra();
		manoDeObra2.setCostoHora(300);
		manoDeObra2.setHorasDuracion(1);
		
		GastoFabricacion gastoFabricacion1= new GastoFabricacion(materiasPrimas1);
		gastoFabricacion1.setNombre("FABRICA1");
		gastoFabricacion1.setManoDeObra(manoDeObra1);
		gastoFabricacion1.setContacto(contacto);
		GastoFabricacion gastoFabricacion2= new GastoFabricacion(materiasPrimas2);
		
		GastoTransporte gastoTransporte1 = new GastoTransporte(20, 50);
		gastoTransporte1.setMedioDeTransporte(TipoTransporte.avion);
		
		GastoTransporte gastoTransporte2 = new GastoTransporte(10, 30);
		gastoTransporte2.setMedioDeTransporte(TipoTransporte.camion);
		
		GastoComercializacion gastoCom1 = new GastoComercializacion();
		gastoCom1.setTipoComercializacion(TipoComercializacion.online);
		
		GastoComercializacion gastoCom2 = new GastoComercializacion();
		gastoCom2.setTipoComercializacion(TipoComercializacion.tiendas);
		
		gastoFabricacion2.setNombre("FABRICA2");
		gastoFabricacion2.setManoDeObra(manoDeObra2);
		gastoFabricacion2.setContacto(contacto2);
		
		gastos1[0]= gastoFabricacion1;
		gastos1[1]= gastoTransporte1;
		gastos1[1].setNombre("Transporte");
		gastos1[2]= gastoCom1;
		gastos1[2].setNombre("Comercializacion");
		
		gastos2[0]= gastoFabricacion2;
		gastos2[1]= gastoTransporte2;
		gastos2[1].setNombre("Transporte");
		gastos2[2]= gastoCom2;
		gastos2[2].setNombre("Comercializacion");
		
		producto1.setGastos(gastos1);
		producto2.setGastos(gastos2);
		
		AnalisisDeCostos analisis = new AnalisisDeCostos();
		
		
		productos[0] = producto1;
		productos[1] = producto2;
		
		analisis.setProductos(productos);
		
		analisis.listarProductos();
		
	}

}
