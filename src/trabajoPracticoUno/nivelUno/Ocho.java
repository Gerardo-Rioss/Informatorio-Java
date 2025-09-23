package trabajoPracticoUno.nivelUno;

import java.util.Scanner;

public class Ocho {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el primer nro real: ");
        double real1 = scanner.nextDouble();
        System.out.println("Ingrese el segundo nro real: ");
        double real2 = scanner.nextDouble();
        double mutiplicacionReal = real1 * real2;
        System.out.println("Ingrese el primer nro entero: ");
        int n1 = scanner.nextInt();
        System.out.println("Ingrese el segundo nro entero: ");
        int n2 = scanner.nextInt();
        int mutiplicacionEntero = n1 * n2;

        double sumaMultiplicaciones = mutiplicacionReal + mutiplicacionEntero;
        System.out.println("Suma de las multiplicaciones de reales");
        System.out.println("\nResultados:");
        System.out.println("Multiplicación de reales: " + mutiplicacionReal);
        System.out.println("Multiplicación de enteros: " + mutiplicacionEntero);
        System.out.println("Suma de las multiplicaciones: " + sumaMultiplicaciones);

        scanner.close();
    }

}
