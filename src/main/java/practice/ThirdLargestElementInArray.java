package practice;

import java.util.Arrays;

public class ThirdLargestElementInArray {
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5, 1, 2, 3, 4, 5};
        int ele = findThirdLargest(a, a.length);
        System.out.println(ele);
    }

    private static int findThirdLargest(int[] a, int n) {
        if (n > 2) {
            //solution 1
            /*Arrays.sort(a);
            return a[n-3];*/

            //solution 2
            int firstLargest = a[0];
            for (int i = 0; i < n; i++) {
                if(a[i] > firstLargest) {
                    firstLargest = a[i];
                }
            }
            int secondLargest = Integer.MIN_VALUE;
            for (int i = 0; i < n; i++) {
                if (a[i] < firstLargest && a[i] > secondLargest)  {
                    secondLargest = a[i];
                }
            }
            int thirdLargest = Integer.MIN_VALUE;
            for (int i = 0; i < n; i++) {
                if (a[i] < firstLargest && a[i] < secondLargest && a[i] > thirdLargest){
                    thirdLargest = a[i];
                }
            }
            return thirdLargest;
        }
        return -1;
    }
}
