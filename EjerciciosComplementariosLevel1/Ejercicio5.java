import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner variable = new Scanner(System.in);
        System.out.println("Ingrese el primer número:");
        int num1 = variable.nextInt();
        System.out.println("Ingrese el segundo número:");
        int num2 = variable.nextInt();
        variable.close();

        int resultado = 0;
        for (int i = 1; i <= num2; i++) {
            resultado += num1; 
        }
        System.out.println(num1 + " x " + num2 + " = " + resultado);
    }
}
