import java.util.*;

public class Level2Ejercicio6 {
    public static void main(String[] args) {

        Empleado empleado1 = new Empleado("Javier Aguirre", 22547454, 20, 50.00f);
        Empleado empleado2 = new Empleado("Pedro Gomez", 30222555, 10, 40.00f);
        Empleado empleado3 = new Empleado("Carlos Perez", 10222777, 20, 60.00f);

        HashSet<Empleado> empleados = new HashSet<>();

        empleados.add(empleado1);
        empleados.add(empleado2);
        empleados.add(empleado3);

        Map<Integer, Float> sueldos = new HashMap<>();

        for (Empleado o : empleados) {
            sueldos.put(o.dni, o.calcularSueldo());
        }
        
        System.out.println(sueldos.toString());
    }

    public static class Empleado {
        String nombreYApellido;
        int dni;
        int horasTrabajadas;
        float valorPorHora;

        public Empleado(String nombre, int dni, int horas, float valorPorHora) {
            this.nombreYApellido = nombre;
            this.dni = dni;
            this.horasTrabajadas = horas;
            this.valorPorHora = valorPorHora;
        }

        public float calcularSueldo() {
            return this.horasTrabajadas * this.valorPorHora;
        }
    }
}
