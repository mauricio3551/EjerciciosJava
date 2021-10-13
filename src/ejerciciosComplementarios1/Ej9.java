package ejerciciosComplementarios1;

import java.util.Scanner;

public class Ej9 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int sum = 0;

    String pal = input.nextLine();
    String caracter = input.next();

    for (int i = 0; i < pal.length(); i++) {
      if ((caracter.toCharArray()[0]) == (pal.toCharArray()[i])){
        sum ++;
      }
    }

    System.out.println(sum);

  }
}

