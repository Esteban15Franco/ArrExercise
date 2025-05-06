import java.util.Scanner;

public class PrintHistogram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arreglo = new int[12];

        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("Ingrese un numero de 1 a 6: ");
            arreglo[i] = scanner.nextInt();
        }

        String[] arregloHistograma = new String[6];

        for (int i = 0; i < arregloHistograma.length; i++) {
            int aux = i + 1;
            StringBuilder histograma = new StringBuilder(aux + ": ");
            for (int k : arreglo) {
                if (aux == k) {
                    histograma.append("*");
                }
            }
            arregloHistograma[i] = histograma.toString();
        }

        for (String s : arregloHistograma) {
            System.out.println(s);
        }

    }
}