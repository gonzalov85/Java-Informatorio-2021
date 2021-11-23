import java.util.ArrayList;

public class Level2Ejercicio2 {
    public static void main(String[] args) {
        ArrayList<Integer> enteros = new ArrayList<Integer>();
        enteros.add(0,11);
        enteros.add(1,22);
        enteros.add(2,33);
        enteros.add(3,44);
        enteros.add(4,55);
        System.out.println("Elementos antes de agregar:");
        for(int i = 0; i < enteros.size(); i++) {
            System.out.print(enteros.get(i) + " ");
        }
        System.out.println("\nLongitud del array antes de agregar:");
        System.out.println(enteros.size());
        enteros.add(0,66);
        enteros.add(5,77);
        System.out.println("Elementos después de agregar:");
        for(int i = 0; i < enteros.size(); i++) {
            System.out.print(enteros.get(i) + " ");
        }
        System.out.println("\nLongitud del array después de agregar:");
        System.out.println(enteros.size());
     }
}

