package practice;

import java.util.Arrays;
import java.util.stream.IntStream;

public class FindElements {
    public static void main(String[] args) {
        int a[] = { 34, -3, -90, 24, 5, 3, 78, 96, 3455, 35};
        findElements(a);
    }

    private static void findElements(int[] arr) {
        /*Arrays.sort(arr);
        for (int i = 0; i < arr.length-2; i++) {
            System.out.println(arr[i] + " ");
        }  */
        int first = Integer.MIN_VALUE;
        int second = Integer.MAX_VALUE;
        int n = arr.length;

        for (int i = 0; i < n; i++)
        {
            if (arr[i] > first)
            {
                second = first;
                first = arr[i];
            }
            else if (arr[i] > second)
                second = arr[i];
        }

        for (int i = 0; i < n; i++)
            if (arr[i] < second)
                System.out.print(arr[i] + " ") ;
    }
}
