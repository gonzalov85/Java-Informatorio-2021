import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        String nom, ape, edad, dire, ciu;
        Scanner variable = new Scanner(System.in);
        System.out.println("Ingrese su nombre:");
        nom = variable.nextLine();
        System.out.println("Ingrese su apellido:");
        ape = variable.nextLine();
        System.out.println("Ingrese su edad:");
        edad = variable.nextLine();
        System.out.println("Ingrese su dirección:");
        dire = variable.nextLine();
        System.out.println("Ingrese su ciudad de residencia:");
        ciu = variable.nextLine();
        variable.close();
        System.out.println(ciu + " - " + dire + " - " + edad + " - " + nom + " " + ape);
    }
}
