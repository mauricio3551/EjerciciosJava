/*
Se dispone de una lista de Empleados, de cada empleado se conoce:
○ Nombre y Apellido
○ DNI
○ horasTrabajadas
○ valorPorHora
Todos los empleados están cargados en un Set (HashSet), se desea calcular el
sueldo (horasTrabajadas x valorPorHora) de toda esa lista para luego
almacenar en un Map (o Diccionario) donde la clave (key) es el dni y el valor
(value) es el sueldo calculado.
*/

package ejerciciosComplementarios2.Ej6;
import java.util.HashSet;
import java.util.Set;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args){
        Empleado emp1 = new Empleado("mauricio","gutierrez",34656981,4,1000);
        Empleado emp2 = new Empleado("Pepe","pepito",11111111,5,1500);
        Empleado emp3 = new Empleado("Rodrigo","Nose",22222222,6,500);
        
        Set<Empleado> emp = new HashSet<>();
        emp.add(emp1);
        emp.add(emp2);
        emp.add(emp3);

        Map mapEmp = new HashMap();
        emp.forEach(e -> {mapEmp.put(e.dni, e.calcularSueldo());});
        
        System.out.println(mapEmp);
    }
}
