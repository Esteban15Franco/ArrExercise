import java.util.Scanner;

public class StatisticalSystemArr {
    public static void main(String[] args) {
        int[] arr = new int[7];
        Scanner s = new Scanner(System.in);
        int total = arr.length;
        double positive = 0, negative = 0,
                positiveCount = 0, negativeCount = 0, zeroCount = 0;


        for(int i = 0; i < total; i++){
            System.out.print("Ingrese un numero: ");
            arr[i] = s.nextInt();
        }

        for (int j : arr) {
            if (j > 0) {
                positive += j;
                positiveCount++;

            } else if (j < 0) {
                negative += j;
                negativeCount++;
            } else
                zeroCount++;
        }
        double positiveAverage = positive / positiveCount;
        double negativeAverage = negative / negativeCount;

        System.out.printf("Promedio de positivos: %.2f", positiveAverage);
        System.out.printf("\nPromedio de negativos: %.2f", negativeAverage);
        System.out.printf("\nPromedio de ceros: %.2f", zeroCount);
    }
}
