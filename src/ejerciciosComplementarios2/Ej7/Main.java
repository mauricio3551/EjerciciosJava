package ejerciciosComplementarios2.Ej7;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Numero numero = new Numero();
        int num1;
        int num2;
        
        boolean band = false;
        
        do{
            System.out.println("Ingresa primer numero:");
            num1 = scan.nextInt();
            System.out.println("Ingresa segundo numero:");
            num2 = scan.nextInt();
            
            band = numero.esValido(num1, num2, band);
            if (band == false){
                System.out.println("El primer numero debe ser menor que el segundo");
            }
        }while (band == false);
        
        numero.lista(num1, num2);
        numero.mostrarLista();
    }
}
