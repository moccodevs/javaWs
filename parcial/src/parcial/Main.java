package parcial;

class Persona {
    private int numeroDocumento;
    private String nombre;
    private String direccion;

    // Constructor, getters y setters
    // ...

    @Override
    public String toString() {
        return "Persona [numeroDocumento=" + numeroDocumento + ", nombre=" + nombre + ", direccion=" + direccion + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Persona persona = (Persona) obj;
        return numeroDocumento == persona.numeroDocumento;
    }
}

class EmpleadoComun extends Persona {
    private int legajo;
    private int antiguedad;
    private double sueldoBasico;

    // Constructor, getters y setters
    // ...

    public double calcularSueldo() {
        return sueldoBasico * antiguedad;
    }
}

class Supervisor extends EmpleadoComun {
    private String nombreArea;
    private int empleadosACargo;

    // Constructor, getters y setters
    // ...

    @Override
    public double calcularSueldo() {
        double sueldo = super.calcularSueldo();
        if (empleadosACargo >= 1 && empleadosACargo <= 10) {
            sueldo += sueldoBasico * antiguedad * 0.05;
        } else if (empleadosACargo >= 11 && empleadosACargo <= 20) {
            sueldo += sueldoBasico * antiguedad * 0.2;
        } else {
            sueldo += sueldoBasico * antiguedad * 0.3;
        }
        return sueldo;
    }
}

class Gerente extends EmpleadoComun {
    private String areaGerencia;
    private double comision;

    // Constructor, getters y setters
    // ...

    @Override
    public double calcularSueldo() {
        return super.calcularSueldo() + comision;
    }
}

public class Main {
    public static void main(String[] args) {
        EmpleadoComun empleado1 = new EmpleadoComun();
        Supervisor supervisor1 = new Supervisor();
        Gerente gerente1 = new Gerente();

        // Inicializar los objetos con datos adecuados
        
        System.out.println("Sueldo de EmpleadoComun: " + empleado1.calcularSueldo());
        System.out.println("Sueldo de Supervisor: " + supervisor1.calcularSueldo());
        System.out.println("Sueldo de Gerente: " + gerente1.calcularSueldo());
    }
}