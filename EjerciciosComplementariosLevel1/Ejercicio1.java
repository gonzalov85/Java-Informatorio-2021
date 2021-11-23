import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner variable = new Scanner(System.in);
        System.out.println("Ingrese su nombre:");
        String nombre = variable.nextLine();
        System.out.println("HOLA " + nombre);
        variable.close();
     }
}
