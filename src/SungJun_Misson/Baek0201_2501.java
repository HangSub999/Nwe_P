package SungJun_Misson;

import java.util.Scanner;

public class Baek0201_2501 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            if (N % i + 1 == 0) {
                arr[i] = i + 1;
            }
        }
        System.out.println(arr[K - 1]);
    }
}
