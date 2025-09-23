package trabajoPracticoUno.nivelUno;

import java.util.Scanner;

public class Cinco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el primer nro entero: ");
        int n1 = scanner.nextInt();
        System.out.print("Ingrese el segundo nro entero: ");
        int n2 = scanner.nextInt();
        int suma = n1 + n2;
        System.out.println("La suma de los numeros es: " + suma);
        if (n2 == 0) {
            System.out.println("No se puede determinar la divisivilidad");
        } else {
            if (n1 % n2 == 0) {
                System.out.println(n1 + " SI es divisible por " + n2);
            } else {
                System.out.println(n1 + " NO es divisible por " + n2);
            }
        }

        scanner.close();
    }

}
