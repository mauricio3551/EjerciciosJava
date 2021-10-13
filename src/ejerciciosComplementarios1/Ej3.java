package ejerciciosComplementarios1;

import java.util.Scanner;

public class Ej3 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Ingrese num: ");
    int num = input.nextInt();

    for (int i = 1; i <= num; i++) {
      for (int j = 1; j <= i ; j++) {
        System.out.print(j + " ");
      }
      System.out.println("");
    }
  }
}
