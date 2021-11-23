import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese una cadena de caracteres:");
        String cadena = input.nextLine();
        System.out.println("Ingrese letra a buscar:");
        String letras = input.nextLine();
        char letra = letras.charAt(0);
        input.close();
        int contador = 0;
        char[] ch = cadena.toCharArray();
        for (int i=0; i < ch.length; i++) {
            if (ch[i] == letra) {
                contador +=1;
            }
        }
        System.out.println(contador);
    }
}
