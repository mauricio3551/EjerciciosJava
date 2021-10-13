package ejerciciosComplementarios1;

import java.util.Scanner;

public class Ej7 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    String pal = input.nextLine();

    char palArray[] = pal.toCharArray();

    for (int i = 0; i < palArray.length; i++) {
      if (palArray[i] >= 'a' && palArray[i] <= 'z') {
        palArray[i] = (char) ((int) palArray[i] - 32);
      }
    }

    System.out.print("La palabra en mayuscula es : ");

    for (int i = 0; i < palArray.length; i++) {
      System.out.print(palArray[i]);
    }
  }
}
