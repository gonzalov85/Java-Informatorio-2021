import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        int numero;
        Scanner variable = new Scanner(System.in);
        System.out.println("Ingrese un número entero:");
        numero = variable.nextInt();
        variable.close();

        for (int i = 1; i <= numero; i++) {
            System.out.println("");
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
        }
        System.out.println("");
     }
}