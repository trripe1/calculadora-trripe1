/**
 * Calculadora sencilla.
 * Proyecto de práctica de Git y GitHub.
 */
public class Calculadora {

    public static int sumar(int a, int b) {
        return a + b;
    }

    public static int restar(int a, int b) {
        return a - b;
    }

    public static int multiplicar(int a, int b) {
        return a * b;
    }

    public static int dividir(int a, int b) {
        return a / b;
    }

    public static void main(String[] args) {
        System.out.println("Calculadora v2.0");
        System.out.println("5 + 3 = " + sumar(5, 3));
        System.out.println("5 - 3 = " + restar(5, 3));
        System.out.println("5 * 3 = " + multiplicar(5, 3));
        System.out.println("6 / 3 = " + dividir(6, 3));
    }
}
