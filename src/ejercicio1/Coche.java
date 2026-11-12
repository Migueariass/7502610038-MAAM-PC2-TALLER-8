package ejercicio1;


class Vehiculo {
    protected String marca;
    protected int velocidadMaxima;

    public Vehiculo(String marca, int velocidadMaxima) {
        this.marca = marca;
        this.velocidadMaxima = velocidadMaxima;
    }

    public void mostrarInformacion() {
        System.out.println("Marca: " + marca + " | Velocidad Máxima: " + velocidadMaxima + " km/h");
    }
}

public class Coche extends Vehiculo {
    private int numeroDePuertas;

    public Coche(String marca, int velocidadMaxima, int numeroDePuertas) {
        super(marca, velocidadMaxima);
        this.numeroDePuertas = numeroDePuertas;
    }

    public void mostrarInformacionCoche() {
        mostrarInformacion();
        System.out.println("Número de puertas: " + numeroDePuertas);
    }

    public static void main(String[] args) {
        Coche miCoche = new Coche("Mazda", 240, 4);
        System.out.println("--- Información del Vehículo y Coche ---");
        miCoche.mostrarInformacionCoche();
    }
}
// Ejercicio 1 completado
