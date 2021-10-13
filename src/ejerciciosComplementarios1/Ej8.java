package ejerciciosComplementarios1;

import java.util.Scanner;

public class Ej8 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Ingrese nombre y apellido: ");
    String nombApell = input.nextLine();

    System.out.println("Ingrese edad: ");
    int edad = input.nextInt();

    System.out.println("Ingrese direccion: ");
    String direc = input.next();

    System.out.println("Ingrese ciudad: ");
    String ciudad = input.next();

    System.out.println(nombApell + "-" + edad + "-" + direc + "-" + ciudad );
  }
}
