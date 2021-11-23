import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = null;
        char c[] = null;
        System.out.println("Ingrese una cadena de texto:");
        s = sc.nextLine();
        c = s.toCharArray();
        sc.close();

        for (int i = 0; i < c.length; i++) {
            c[i]=(char) (c[i]-32);
        }
        for (int j = 0; j < c.length; j++) {
            System.out.print(c[j]);
        } 
     }
}
