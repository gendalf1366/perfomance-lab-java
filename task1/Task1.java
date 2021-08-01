package task1;

import java.util.*;

public class Task1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt() - 1;

        //создание массива с n колличеством
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        System.out.println(Arrays.toString(new int[]{arr[0]}));

        int temp = arr[m];
        for (int i = m; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = temp;

        System.out.println(Arrays.toString(new int[]{temp}));

    }
}
