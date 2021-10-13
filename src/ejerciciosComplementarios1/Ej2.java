package ejerciciosComplementarios1;

import java.util.Scanner;

public class Ej2 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Ingrese num1: ");
    int num1 = input.nextInt();

    System.out.println("Ingrese num2: ");
    int num2 = input.nextInt();

    System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
    System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
    System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));

    if (num2 == 0){
      System.out.println("No se puede dividir por 0");
    }else{
      System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
    }

    System.out.println(num1 + " % " + num2 + " = " + (num1 % num2));
  }
}
