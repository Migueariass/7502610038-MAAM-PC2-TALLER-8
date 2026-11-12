package ejercicio2;

class Persona {
    protected String nombre;
    protected int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void mostrarDetalles() {
        System.out.println("Nombre: " + nombre + " | Edad: " + edad + " años");
    }
}

public class Estudiante extends Persona {
    private String matricula;

    public Estudiante(String nombre, int edad, String matricula) {
        super(nombre, edad);
        this.matricula = matricula;
    }

    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println("Matrícula: " + matricula);
    }

    public static void main(String[] args) {
        Estudiante est = new Estudiante("Miguel Angel Arias", 20, "7502610038");
        System.out.println("--- Detalles del Estudiante ---");
        est.mostrarDetalles();
    }
}