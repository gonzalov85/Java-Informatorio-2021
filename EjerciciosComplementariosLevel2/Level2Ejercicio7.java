import java.util.*;

public class Level2Ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el primer número: ");
        int num1 = sc.nextInt();
        System.out.println("Ingrese el segundo número: ");
        int num2 = sc.nextInt();
        sc.close();
        System.out.println(fizzBuzzFuncion(num1,num2));

    }

    public static String fizzBuzzFuncion(int num1, int num2) {
        ArrayList<Integer> numeros = new ArrayList<>();

        for (int i = num1; i < num2; i++) {
            numeros.add(i);
        }

        ArrayList<String> fizzBuzz = new ArrayList<>();
        for (int o : numeros) {
            if (o % 2 == 0 && o % 3 == 0) {
                fizzBuzz.add("FizzBuzz");
            } else if (o % 2 == 0) {
                fizzBuzz.add("Fizz");
            } else if (o % 3 == 0) {
                fizzBuzz.add("Buzz");
            } else {
                fizzBuzz.add(String.valueOf(o));
            }
        }
        return fizzBuzz.toString();
    }
}
