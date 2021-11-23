import java.util.*;
import java.util.stream.*;

public class Ejercicio1 {
    public static void main(String[] args) {
        List<String> palabras = new ArrayList<>();
        palabras.add("Hola");
        palabras.add(null);
        palabras.add("Informatorio");
        palabras.add("");

        List<String> palabrasFiltradas = palabras.stream()
                .filter(palabra -> palabra != "" && palabra != null)
                .collect(Collectors.toList());

        System.out.println(palabrasFiltradas);
    }
}