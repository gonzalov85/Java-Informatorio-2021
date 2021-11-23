import java.util.*;
import java.util.stream.Collectors;

public class Ejercicio2 {
    public static void main(String[] args) {
        List<Integer> palabras = List.of(1, 2, 3, 4, 5);

        List<Integer> palabrasPotencia = palabras.stream()
                .map(palabra-> Ejercicio2.elevarCuadrado(palabra))
                .collect(Collectors.toList());

        System.out.println(palabrasPotencia);
    }
    public static Integer elevarCuadrado (Integer num){
        return (int)Math.pow(num, 2);
    }
}
