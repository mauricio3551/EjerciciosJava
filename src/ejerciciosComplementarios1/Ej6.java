package ejerciciosComplementarios1;

import java.util.Scanner;

public class Ej6 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Ingrese num1: ");
    int num1 = input.nextInt();

    System.out.println("Ingrese num2: ");
    int num2 = input.nextInt();

    int res = num1;

    for (int i = 1; i < num2; i++) {
      res *= num1;
    }

    System.out.println(num1 + " ^ " + num2 + " = " + res);
  }
}
