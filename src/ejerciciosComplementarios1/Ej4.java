package ejerciciosComplementarios1;

import java.util.Scanner;

public class Ej4 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Ingrese numero a factorizar:");
    double num = input.nextInt();

    double res = factorial(num);

    System.out.println("El factoria de "+num+" es "+res);

  }

  public static double factorial(double num1){
    double fact = 1;

    if (num1 == 0){
      return 1;
    }else{
      return num1 * (factorial(num1-1));
    }
  }
}
