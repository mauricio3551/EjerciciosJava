package Ej4;


import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String[] arg){
    FileWriter archivo = null;
    PrintWriter pw = null;
    List empleados = new ArrayList();
    empleados.add("Jose Jimenez");
    empleados.add("Carlos Carlin");
    empleados.add("Santiago Sanchez");
    empleados.add("Damian Dartes");
    empleados.add("Manuel Manero");

    try{
      archivo = new FileWriter("/home/mauriciode.gutierrez/cosas/Curso Spring/Empleado.txt");
      pw = new PrintWriter(archivo);

      for (Object e : empleados) {
        pw.println(e);
        System.out.println("Agregado " + e);
      }

    }catch (Exception e){
      e.printStackTrace();

    }finally {
      try{
        if (null != archivo){
          archivo.close();
        }
      } catch (IOException e) {
        e.printStackTrace();
      }
    }

  }
}
