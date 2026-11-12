package ejercicio3;

class Empleado {
    protected String nombre;
    protected double salario;

    public Empleado(String nombre, double salario) {
        this.nombre = nombre;
        this.salario = salario;
    }

    public void mostrarDetalles() {
        System.out.println("Nombre: " + nombre + " | Salario: $" + salario);
    }
}

public class Gerente extends Empleado {
    private String departamento;

    public Gerente(String nombre, double salario, String departamento) {
        super(nombre, salario);
        this.departamento = departamento;
    }

    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println("Departamento: " + departamento);
    }

    public static void main(String[] args) {
        Empleado emp = new Empleado("Isabella Valenzuela", 2500000);
        Gerente ger = new Gerente("Miguel Arias", 5800000, "Desarrollo de Software");

        System.out.println("--- Prueba de Empleado y Gerente ---");
        emp.mostrarDetalles();
        System.out.println("------------------------------------");
        ger.mostrarDetalles();
    }
}
// Ejercicio 3 Taller 8
