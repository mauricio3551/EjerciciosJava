package ejerciciosComplementarios2.Ej7;
import java.util.ArrayList;

public class Numero {
    ArrayList lista = new ArrayList();
    int num1;
    int num2;
    
    public boolean esValido(int num1, int num2, boolean band){
        if (num1 > num2){
            band = false;
            return band;
        }else{
            band = true;
            return band;
        }
    }
    
    public void lista(int num1, int num2){
        for(int i = num1; i < (num2); i++){
            if (i % 2 == 0 && i % 3 != 0){
                lista.add("Fizz");
            }else if (i % 2 != 0 && i % 3 == 0){
                lista.add("Buzz");
            }else if (i % 2 == 0 && i % 3 == 0){
                lista.add("FizzBuzz");
            }else{
                lista.add(i);
            }
        }
    }
    
    public void mostrarLista(){
        for (int i = 0; i < lista.size(); i++){
            System.out.println(lista.get(i));
        }
    }
}
