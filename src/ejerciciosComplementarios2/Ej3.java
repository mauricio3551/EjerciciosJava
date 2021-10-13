package ejerciciosComplementarios2;

import java.util.ArrayList;
import java.util.Collections;

public class Ej3 {
  public static void main(String[] args) {
    ArrayList<Integer> numeros = new ArrayList<Integer>();

    for (int i = 1; i < 13; i++) {
      numeros.add(i);
    }

    for (Object n : numeros) {
      System.out.println(n);
    }

    System.out.println("-------------------------------------------------");

    for (int i = numeros.size()-1; i >= 0; i--) {
      System.out.println(numeros.get(i));
    }

    System.out.println("-------------------------------------------------");

    Collections.shuffle(numeros);
    for (Object n : numeros) {
      System.out.println(n);
    }

    System.out.println("-------------------------------------------------");


  }
}
