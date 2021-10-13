package ejerciciosComplementarios2.Ej6;

public class Empleado {
    String nombre;
    String apellido;
    int dni;
    int horasTrabajadas;
    int valorPorHora;

    public Empleado(String nombre, String apellido, int dni, int horasTrabajadas, int valorPorHora) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.horasTrabajadas = horasTrabajadas;
        this.valorPorHora = valorPorHora;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getDni() {
        return dni;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public int getValorPorHora() {
        return valorPorHora;
    }
    
    public int calcularSueldo(){
        return(horasTrabajadas * valorPorHora);
    }
    
    @Override
    public String toString(){
        return "{" + "nombre:" + nombre + ", apellido:" + apellido + "}"; 
    }
}
