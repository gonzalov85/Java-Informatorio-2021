import java.util.ArrayList;
import java.util.Collections;

public class Level2Ejercicio3 {
    public static void main(String[] args) {
        ArrayList<Integer> cartas = new ArrayList<Integer>();
        cartas.add(0, 2);
        cartas.add(1, 3);
        cartas.add(2, 4);
        cartas.add(3, 5);
        cartas.add(4, 6);
        cartas.add(5, 7);
        cartas.add(6, 8);
        cartas.add(7, 9);
        cartas.add(8, 10);

        Collections.sort(cartas);
        System.out.println("Cartas Ordenadas:");
        System.out.println(cartas.toString());

        Collections.reverse(cartas);
        System.out.println("\nCartas orden inverso:");
        System.out.println(cartas.toString());

        Collections.shuffle(cartas);
        System.out.println("\nCartas Mezcladas:");
        System.out.println(cartas.toString());
    }
}
