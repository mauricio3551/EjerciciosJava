package ejerciciosComplementarios2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ej1 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    List ciudades = new ArrayList();
    int res;
    int num = 1;

    while (true) {
      System.out.println("Quiere agregar otra ciudad? \n1-Si \n2-No");
      res = input.nextInt();

      if (res == 2) {
        System.out.println("Adios");
        break;
      }

      String ciudad = input.next();
      ciudades.add(ciudad);
    }

    for (Object c : ciudades) {
      System.out.println("#"+ num + " - " + c);
      num++;
    }
  }
}
