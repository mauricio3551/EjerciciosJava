package ejerciciosComplementarios2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ej2 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    List numeros = new ArrayList();
    List numerosNuevo = new ArrayList();
    int num;

    for (int i = 0; i < 5; i++) {
      System.out.println("\nAgregar numero:");
      num = input.nextInt();
      numeros.add(num);
    }

    System.out.println("\nAgregar numero al principio:");
    num = input.nextInt();
    numerosNuevo.add(num);
    for (Object n : numeros) {
      numerosNuevo.add(n);
    }
    System.out.println("\nAgregar numero al final:");
    num = input.nextInt();
    numerosNuevo.add(num);

    for (Object n : numerosNuevo) {
      System.out.println(n);
    }
    System.out.println("tamaño de la lista antes: " + numeros.size() +
        " tamaño de la lista despues: " + numerosNuevo.size());
  }
}
