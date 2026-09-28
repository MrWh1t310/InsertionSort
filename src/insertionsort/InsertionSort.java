package insertionsort;

public class InsertionSort {

    public static void sort(Comparable[] a) {

        System.out.println("INSERTION SORT");

        System.out.println("\nArreglo de entrada:");
        show(a);

        for (int i = 1; i < a.length; i++) {

            Comparable actual = a[i];

            System.out.println("\n Iteracion " + i);
            System.out.println("Elemento seleccionado: " + actual);

            System.out.println("Antes de insertar:");
            show(a);

            int j = i;

            while (j > 0 && less(actual, a[j - 1])) {

                System.out.println( actual + " debe ir antes de " + a[j - 1]);

                a[j] = a[j - 1];

                j--;
            }

            a[j] = actual;

            System.out.println("Posicion encontrada: " + j);
            System.out.println("Despues de insertar:");
            show(a);
        }

        System.out.println("ORDENAMIENTO TERMINADO");

        System.out.println("Resultado:");
        show(a);
    }

    private static boolean less(Comparable v, Comparable w) {
        return v.compareTo(w) < 0;
    }

    private static void exch(Comparable[] a, int i, int j) {
        Comparable temporal = a[i];
        a[i] = a[j];
        a[j] = temporal;
    }

    private static void show(Comparable[] a) {
        for (Comparable elemento : a) {
            System.out.print(elemento + " ");
        }
        System.out.println();
    }

    public static boolean isSorted(Comparable[] a) {

        for (int i = 1; i < a.length; i++) {

            if (less(a[i], a[i - 1])) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Integer[] a = {4, 6, 1, 5, 3, 2};

        sort(a);

        System.out.println("\nEl arreglo quedo ordenado? " + isSorted(a));
    }
}