import java.util.Scanner;

public class Baek2562 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[9];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int max = 0;
        int cont = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > max) {
                max = arr[i];
                cont = i + 1;
            }
        }
        System.out.println(max);
        System.out.println(cont);
    }
}
