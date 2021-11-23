import java.util.*;
import java.util.stream.Collectors;

public class Ejercicio3 {
    public static void main(String[] args) {
        List<String> palabras = List.of("Batman", "Aquaman", "Flash", "Batgirl",
         "Wonder Woman", "brainiac");

         List<String> palabrasFiltradas = palabras.stream()
                .filter(palabra -> palabra.startsWith("B") || palabra.startsWith("b"))
                .collect(Collectors.toList());

        System.out.println(palabrasFiltradas);
    }
}
