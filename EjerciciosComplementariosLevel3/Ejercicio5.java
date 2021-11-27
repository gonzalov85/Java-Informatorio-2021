
import java.time.LocalDate;
import java.time.Period;
import java.util.*;
import java.util.stream.Collectors;

public class Ejercicio5 {
    public static void main(String[] args) {
        List<Alumno> alumnos = List.of(

            new Alumno("Szyslak", "Moe", LocalDate.of(1967,12,25)),
            new Alumno("Leonard", "Lenny", LocalDate.of(1972,5,12)),
            new Alumno("Carlson", "Carl", LocalDate.of(1973,8,23)),
            new Alumno("Patiño", "Bob", LocalDate.of(1965,4,22)),
            new Alumno("Flanders", "Ned", LocalDate.of(1955,10,2)));

            Map<String, Integer> alumnosEdad = alumnos.stream()
            .collect(Collectors.toMap(alumno -> alumno.getNombre().concat(" ")
            .concat(alumno.getApellido()),
            alumno -> calcularEdad(alumno)));

        System.out.println(alumnosEdad);
    }

    private static Integer calcularEdad(Alumno alumno){
        return Period.between(alumno.getFechaDeNacimiento(), LocalDate.now()).getYears();
    }

    static class Alumno {
        String apellido;
        String nombre;
        LocalDate fechaDeNacimiento ;

        public Alumno(String apellido, String nombre, LocalDate fechaDeNacimiento) {
            this.apellido = apellido;
            this.nombre = nombre;
            this.fechaDeNacimiento = fechaDeNacimiento;

        }

        public String getApellido(){
            return this.apellido;
        }

        public String getNombre(){
            return this.nombre;
        }

        public LocalDate getFechaDeNacimiento(){
            return this.fechaDeNacimiento;
        }
    }
}