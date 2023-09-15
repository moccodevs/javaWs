package hospital_tp;

import dataType.PracticaMedica;
import dataType.tipoCausa;

public class Prueba {

	public static void main(String[] args) {
		
		Hospital hospital = new Hospital();
		
		Persona paciente=new Persona("Carlos","Capo");
		Medico medico = new Medico("Sergio","Contreras");		
		
		PracticaMedica[] practicas= new PracticaMedica[5];
		
		practicas[0]= new PracticaMedica("cirugia",1300);
		practicas[1]= new PracticaMedica("practica2",2000);
		practicas[2]= new PracticaMedica("practica3",3000);
		practicas[3]= new PracticaMedica("practica4",3111);
		practicas[4]= new PracticaMedica("practica5",4000);
		
		Habitacion[] habitaciones= new Habitacion[3];
		habitaciones[0]=new Habitacion(1000);
		habitaciones[1]=new Habitacion(1311);
		habitaciones[2]=new Habitacion(2211);
		
		Internacion[] internaciones = new Internacion[3];
		
		internaciones[0] = new Internacion(paciente);
		internaciones[0].setHabitacion(habitaciones[1]);
		internaciones[1] = new Internacion(paciente);
		internaciones[1].setHabitacion(habitaciones[2]);
		internaciones[2] = new Internacion(paciente);
		internaciones[2].setHabitacion(habitaciones[2]);
		
		internaciones[0].setCausa(tipoCausa.COVID);
		internaciones[0].setCantidadDias(0);
		internaciones[2].setHabitacion(habitaciones[0]);
		internaciones[2].setMedico(medico);
		
		internaciones[0].setPracticas(practicas);
		internaciones[1].setPracticas(practicas);
		internaciones[2].setPracticas(practicas);
		
		
		hospital.setInternaciones(internaciones);
		
		hospital.listarInternaciones();
		
	}

}
