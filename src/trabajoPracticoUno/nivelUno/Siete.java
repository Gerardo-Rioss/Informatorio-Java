package trabajoPracticoUno.nivelUno;

import java.util.Scanner;

public class Siete {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el nombre de su última mascota: ");
        String mascota = scanner.nextLine();
        System.out.println("Ingrese el nombre de la ultima pelicula vista: ");
        String pelicula = scanner.nextLine();
        System.out.println("Nombre de la próxima bebida: " + mascota + " " + pelicula);
        System.out.println();
        scanner.close();
    }
}
