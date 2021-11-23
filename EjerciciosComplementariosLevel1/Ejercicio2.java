import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner variable = new Scanner(System.in);
        System.out.println("Ingrese el primer número:");
        int num1 = variable.nextInt();
        System.out.println("Ingrese el segundo número:");
        int num2 = variable.nextInt();
        variable.close();
        System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
        System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
        System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
        System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
        System.out.println(num1 + " % " + num2 + " = " + (num1 % num2)); 
     }
}