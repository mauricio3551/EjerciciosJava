package ejerciciosComplementarios2;

import java.util.ArrayList;
import java.util.Arrays;

public class Ej5 {
  public static void main(String[] args) {
    ArrayList<Integer> array1 = new ArrayList<Integer>(Arrays.asList(6,7,8,4,5));
    ArrayList<Integer> array2 = new ArrayList<Integer>(Arrays.asList(350,345,550,600,320));
    ArrayList<Integer> totales = new ArrayList<Integer>();
    int sum = 0;

    for (int i = 0; i < array1.size(); i++) {
      totales.add(array1.get(i) * array2.get(i));
      sum += (array1.get(i) * array2.get(i));
    }

    System.out.println(totales);
    System.out.println(sum);

  }
}
