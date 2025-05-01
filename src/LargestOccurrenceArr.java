import java.util.Scanner;

public class LargestOccurrenceArr {
    public static void main(String[] args) {
        int[] arr = new int[10];
        int[] concurrenceArr = new int[10];
        int total = arr.length;
        int max = 0, indice = 0;

        Scanner s = new Scanner(System.in);

        for (int i = 0; i < total; i++){
            System.out.print("Ingrese un numero: ");
            arr[i] = s.nextInt();
        }

        for(int i = 0; i < total; i++){
            int count = 0;
            for (int k : arr) {
                if (arr[i] == k) {
                    count++;
                }
            }
            concurrenceArr[i] = count;
        }

        for (int i = 0; i < concurrenceArr.length; i++){
            if (max < concurrenceArr[i]){
                max = concurrenceArr[i];
                indice = i;

            }
        }
        System.out.println("La mayor concurrencia es: "+max);
        System.out.println("El numero con mayor concurrencia es: "+arr[indice]);
        System.out.println("El elemento que mas se repite es "+arr[indice]+" y " +
                "su concurrencia es de "+max);
    }
}
