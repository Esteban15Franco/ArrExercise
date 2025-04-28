import java.util.Scanner;

public class OrdenedArrFinalFirst {
    public static void main(String[] args) {
        int[] a = new int[10];
        Scanner s = new Scanner(System.in);

        int total = a.length;

        for (int i = 0; i < total; i++){
            System.out.print("Ingrese un numero: ");
            a[i] = s.nextInt();
        }

        for (int i = 0; i < total/2 ; i++){
            System.out.print(a[i]+" - ");
            System.out.println(a[a.length-1-i]);
        }

    }
}
