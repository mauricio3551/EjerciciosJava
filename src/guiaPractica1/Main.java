package guiaPractica1;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    holaMundo();
    System.out.println("\n-------------------------------------------------\n");
    imprimir3Numeros();
    System.out.println("\n-------------------------------------------------\n");
    calificacion();
    System.out.println("\n-------------------------------------------------\n");
    diaDeLaSemana();
    System.out.println("\n-------------------------------------------------\n");
    multiplicacion();
    System.out.println("\n-------------------------------------------------\n");
    pregunta();
  }

  public static void holaMundo(){
    System.out.println("Hola Informatorio 2020!!");
  }

  public static void imprimir3Numeros(){
    Scanner input = new Scanner(System.in);

    int a = input.nextInt();
    int b = input.nextInt();
    int c = input.nextInt();

    System.out.println("El primer numero ingresado es: " + a +
        "\nEl segundo numero ingresado es: " + b +
        "\nEl tercer numero ingresado es: " + c);
  }

  public static void calificacion(){
    Scanner input = new Scanner(System.in);

    int calif = input.nextInt();

    if (calif >= 93 && calif <= 100){
      System.out.println("Excelente");

    }else if (calif >= 85 && calif <= 92){
      System.out.println("Sobresaliente");

    }else if (calif >= 75 && calif <= 84){
      System.out.println("Distinguido");

    }else if (calif >= 60 && calif <= 74){
      System.out.println("Bueno");

    }else if (calif >= 0 && calif <= 59){
      System.out.println("Desaprobado");

    }
  }

  public static void diaDeLaSemana(){
    Scanner input = new Scanner(System.in);

    int dia = input.nextInt();

    if (dia == 1){
      System.out.println("Lunes");

    }else if (dia == 2){
      System.out.println("Martes");

    }else if (dia == 3){
      System.out.println("Miercoles");

    }else if (dia == 4){
      System.out.println("Jueves");

    }else if (dia == 5){
      System.out.println("Viernes");

    }else if (dia == 6){
      System.out.println("Sabado");

    }else if (dia == 7){
      System.out.println("Domingo");

    }else{
      System.out.println("Error");
    }
  }

  public static void multiplicacion(){
    Scanner input = new Scanner(System.in);

    int num = input.nextInt();

    for (int i = 1; i <= 10; i++) {
      System.out.println(num + " * " + i + " = " + (num * i));
    }
  }

  public static void pregunta(){
    Scanner input = new Scanner(System.in);

    int res;
    int num;

    while (true){
      System.out.println("Quiere agregar un numero? \n1-Si \n2-No");
      res = input.nextInt();

      if (res == 2){
        System.out.println("Adios");
        break;
      }

      System.out.println("Agregar numero: ");
      num = input.nextInt();

      System.out.println("Usted agrego el: " + num + "\n");
    }
  }
}
