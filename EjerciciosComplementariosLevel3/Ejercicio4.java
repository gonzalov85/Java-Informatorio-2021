import java.util.*;
import java.util.stream.Collectors;

public class Ejercicio4 {
    public static void main(String[] args) {
        List<Integer> palabras = List.of(1, 2, 4, 4, 4);

        Set<Integer> palabrasSinRepetir = palabras.stream()
                .collect(Collectors.toSet());

        Set<Integer> palabrasFactorial = palabrasSinRepetir.stream()
                .map(palabra-> Ejercicio4.calcularFactorial(palabra))
                .collect(Collectors.toSet());
        
        System.out.println(palabrasFactorial);
    }

    public static Integer calcularFactorial(Integer num){
        int factorial = 1;
        for (int i = 1; i < num; i++) {
             factorial = factorial + factorial*i;
        }
        return factorial;
    }
}
