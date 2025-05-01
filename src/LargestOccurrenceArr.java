import java.util.Scanner;

public class LargestOccurrenceArr {
    public static void main(String[] args) {
        int[] arr = new int[10];
        int[] arrValores = new int[10];
        int total = arr.length;
        Scanner s = new Scanner(System.in);

        for (int i = 0; i < total; i++){
            System.out.print("ingrese un numero: ");
            arr[i] = s.nextInt();
        }

    }
}
