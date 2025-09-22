package trabajoPracticoUno.nivelUno;

import java.util.Scanner;

public class Uno {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer nro entero: ");
        int numero1 = scanner.nextInt();

        System.out.print("Ingrese el segundo nro entero: ");
        int numero2 = scanner.nextInt();

        int suma = numero1 + numero2;

        System.out.println("La suma de " + numero1 + " y " + numero2 + " es: " + suma);

        scanner.close();

    }

}
