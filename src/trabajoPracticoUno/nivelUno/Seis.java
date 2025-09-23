package trabajoPracticoUno.nivelUno;

import java.util.Scanner;

public class Seis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el nro de filas: ");
        int filas = scanner.nextInt();

        for (int i = 1; i <= filas; i++) {

            for (int j = 1; j <= filas - i; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        scanner.close();
    }
}
