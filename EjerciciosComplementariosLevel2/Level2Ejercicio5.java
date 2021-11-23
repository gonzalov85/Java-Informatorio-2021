import java.util.Scanner;
import java.util.ArrayList;

public class Level2Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> horas = new ArrayList<Integer>();
        ArrayList<Integer> pago = new ArrayList<Integer>();
        System.out.println("Ingrese horas trabajadas del día 1:");
        horas.add(0, sc.nextInt());
        System.out.println("Ingrese horas trabajadas del día 2:");
        horas.add(1, sc.nextInt());
        System.out.println("Ingrese horas trabajadas del día 3:");
        horas.add(2, sc.nextInt());
        System.out.println("Ingrese valor por hora del día 1:");
        pago.add(0, sc.nextInt());
        System.out.println("Ingrese horas trabajadas del día 2:");
        pago.add(1, sc.nextInt());
        System.out.println("Ingrese horas trabajadas del día 3:");
        pago.add(2, sc.nextInt());
        sc.close();
        ArrayList<Integer> totales = new ArrayList<Integer>();

        for(int i = 0; i < horas.size(); i++) {
            totales.add(horas.get(i)*pago.get(i));
        }
        System.out.println(totales.toString());
        int total = 0;
        for(int i = 0; i < totales.size(); i++) {
            total += totales.get(i);
        }
        System.out.println("Total Final: $" + total);
     }
}
