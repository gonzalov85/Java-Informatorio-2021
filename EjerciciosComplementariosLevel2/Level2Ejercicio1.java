import java.util.Scanner;
import java.util.ArrayList;

public class Level2Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> ciudades = new ArrayList<String>();
        System.out.println("Ingrese su primera ciudad favorita:");
        ciudades.add(0, sc.nextLine());
        System.out.println("Ingrese su segunda ciudad favorita:");
        ciudades.add(1, sc.nextLine());
        System.out.println("Ingrese su tercera ciudad favorita:");
        ciudades.add(2, sc.nextLine());
        sc.close();
        int puesto = 1;
        for(int i = 0; i < ciudades.size(); i++) {
            System.out.println("#"+ (puesto++) +" - " + ciudades.get(i));
        }
     }
}

