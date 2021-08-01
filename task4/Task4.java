package task4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Task4 {

    static int minOps(Integer[] arr, int n, int k) {

        Arrays.sort(arr);

        int max = arr[arr.length - 1];
        int res = 0;

        for (int i = 0; i < n; i++) {
            if ((max - arr[i]) % k != 0)
                return -1;
            else
                res += (max - arr[i]) / k;
        }
        return res;
    }

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        try (Scanner scan = new Scanner(new File("C:\\Programming\\Testperfomens\\src\\main\\java\\task4\\newfile.txt"))) {
            while (scan.hasNextLine()) {
                list.add(Integer.valueOf(scan.nextLine()));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        Integer[] arr = list.toArray(new Integer[0]);

        int n = arr.length;
        int k = 6;

        System.out.println(minOps(arr, n, k));

    }
}
