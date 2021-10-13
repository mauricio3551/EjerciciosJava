package ejerciciosComplementarios2;

import java.util.ArrayList;
import java.util.Scanner;

public class Ej4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nombre;
        ArrayList<String> alumnos = new ArrayList<String>();
        ArrayList<String> listaUno = new ArrayList<String>();
        ArrayList<String> listaDos = new ArrayList<String>();
        ArrayList<String> listaTres = new ArrayList<String>();

        for (int i = 0; i < 12; i++) {
            System.out.println("Ingresar nombre de alumno: ");
            nombre = input.nextLine();

            alumnos.add(nombre);
        }

        for (int i = 0; i < 4; i++) {
            listaUno.add(alumnos.get(i));
            listaDos.add(alumnos.get(i+4));
            listaTres.add(alumnos.get(i+8));
        }

        System.out.println("Curso 1: " + listaUno);
        System.out.println("Curso 2: " + listaDos);
        System.out.println("Curso 3: " + listaTres);
    }
}
