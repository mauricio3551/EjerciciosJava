package Ej3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args) {
    FileReader fr = null;
    BufferedReader br = null;

    try {
      fr = new FileReader("/home/mauriciode.gutierrez/cosas/Curso Spring/Alumnos.txt");
      br = new BufferedReader(fr);

      String line;
      while ((line = br.readLine()) != null){
        System.out.println(line);
      }

    } catch (FileNotFoundException e) {
      e.printStackTrace();

    } catch (IOException e) {
      e.printStackTrace();

    }finally {

      try {
        if (null != fr){
          fr.close();
        }

      }catch (Exception e2){
        e2.printStackTrace();
      }
    }

  }
}
