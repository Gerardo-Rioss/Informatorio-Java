package trabajoPracticoUno.nivelUno;

import java.util.Scanner;

public class Dos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer nro entero: ");
        int numero1 = scanner.nextInt();

        System.out.print("Ingrese el segundo nro entero: ");
        int numero2 = scanner.nextInt();

        int suma = numero1 + numero2;

        boolean par = suma % 2 == 0;
        if (par) {
            System.out.println("El resultado: " + suma + " es par.");
        } else {
            System.out.println("El resultado: " + suma + " no es par.");
        }
        scanner.close();
    }
}
