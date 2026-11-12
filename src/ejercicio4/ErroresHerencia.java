package ejercicio4;

// Clases base para asi demostrar el error de herencia múltiple
class ClaseA {
    public void metodoA() {
        System.out.println("Método ejecutado desde ClaseA");
    }
}

class ClaseB {
    public void metodoB() {
        System.out.println("Método ejecutado desde ClaseB");
    }
}

/*
 * CASO 1: HERENCIA MÚLTIPLE (ERROR DE COMPILACIÓN)
 * En Java no está permitido heredar de múltiples clases simultáneamente para evitar ambigüedades
 */

// Clase base con atributo privado para demostrar el error de acceso
class CuentaBancaria {
    private double saldo = 1500000.0;

    public double getSaldo() {
        return saldo;
    }
}

// Clase derivada pública
public class ErroresHerencia extends CuentaBancaria {

    public void probarAccesoPrivado() {
        /*
         *  CASO 2: ACCESO A ATRIBUTOS PRIVADOS (ERROR DE COMPILACIÓN)
         * Los miembros declarados como private en la clase base no son visibles ni accesibles
         * directamente desde la clase derivada. Si quito la siguiente línea, arrojará el error:
         * "saldo has private access in CuentaBancaria"
         */
        // System.out.println("Saldo directo: " + saldo);

        // Forma correcta: acceder a través de un método público (getter)
        System.out.println("Acceso correcto al saldo mediante getter: $" + getSaldo());
    }

    public static void main(String[] args) {
        ErroresHerencia demo = new ErroresHerencia();
        System.out.println("--- Ejercicio 4: Análisis de Uso Incorrecto de la Herencia ---");
        demo.probarAccesoPrivado();
    }
}