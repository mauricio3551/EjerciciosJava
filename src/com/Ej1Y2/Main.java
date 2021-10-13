package com.Ej1Y2;

import java.util.Scanner;

public class Main {

    public static int suma(int num1, int num2){
        int resultado = num1 + num2;
        return resultado;
    }

    public static int factorial(int num1){
        int fact = 1;

        if (num1 == 0){
            return 1;
        }else{
            return num1 * (factorial(num1-1));
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Ingresar numero 1:\n");
        int num1 = input.nextInt();

        System.out.println("Ingresar numero 2:\n");
        int num2 = input.nextInt();

        int res = suma(num1, num2);

        System.out.println("El resultado de la suma "+num1+" y "+num2+" es "+res);

        System.out.println("--------------------------------------------------------------------\n");

        System.out.println("Ingrese numero a factorizar:\n");
        num1 = input.nextInt();

        res = factorial(num1);

        System.out.println("El factoria de "+num1+" es "+res);


    }
}
