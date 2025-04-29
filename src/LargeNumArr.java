import java.util.Scanner;

public class LargeNumArr {
    public static void main(String[] args) {
        int[] arr = new int[7];
        Scanner s = new Scanner(System.in);
        int max = 0, total = arr.length;

        for (int i = 0; i < total; i++){
            System.out.print("Digite un numero entre 11-99: ");
            arr[i] = s.nextInt();

            if (arr[i] < 11 || arr[i] > 99){
                System.err.println("ERROR: fuera de rango");
                System.exit(-1);
            }
        }

        for (int j : arr) {
            max = j > max ? j : max; //Tambien seria valido max = Math.max(j, max)
        }
        System.out.println("Maximo => "+max);
    }
}
