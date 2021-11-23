import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner variable = new Scanner(System.in);
        System.out.println("Ingrese un número:");
        int numero = variable.nextInt();
        variable.close();
        int factorial = 1;
        for (int i = 1; i < numero; i++) {
             factorial = factorial + factorial*i;
        }
        System.out.println("El factorial de " + numero + " es: " + factorial);
    }
}
