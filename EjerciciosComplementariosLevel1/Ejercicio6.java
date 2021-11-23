import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner variable = new Scanner(System.in);
        System.out.println("Ingrese el primer número:");
        int numero = variable.nextInt();
        System.out.println("Ingrese el segundo número:");
        int exponente = variable.nextInt();
        variable.close();

        int resultado = 1;
        for (int i = 1; i <= exponente; i++) {
            resultado = resultado * numero;
        }
        System.out.println(numero + " elevado a " + exponente + " = " + resultado);
    }
}
