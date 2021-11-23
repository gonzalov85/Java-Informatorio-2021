import java.util.ArrayList;

public class Level2Ejercicio4 {
    public static void main(String[] args) {
        ArrayList<String> alumnos = new ArrayList<String>();
        alumnos.add("Diego");
        alumnos.add("Alberto");
        alumnos.add("Romina");
        alumnos.add("Carlos");
        alumnos.add("Javier");
        alumnos.add("Eduardo");
        alumnos.add("Juan");
        alumnos.add("Ximena");
        alumnos.add("Marcelo");
        alumnos.add("Pablo");
        alumnos.add("Ezequiel");
        alumnos.add("Laura");

        ArrayList<String> lista1 = new ArrayList<String>(alumnos.subList(0, 4));
        ArrayList<String> lista2 = new ArrayList<String>(alumnos.subList(4, 8));
        ArrayList<String> lista3 = new ArrayList<String>(alumnos.subList(8, 12));

        System.out.println("Lista original: " + alumnos.toString());
        System.out.println("Lista1: " + lista1.toString());
        System.out.println("Lista2: " + lista2.toString());
        System.out.println("Lista3: " + lista3.toString());
    }
}
