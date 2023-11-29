package practice;

import java.util.stream.Stream;

public class ImplementQueueUsingArray {
    // 1 x insert element in queue
    // 2 pop the element
    public static void main(String[] args) {
        int q = 4;
        long queries = 12132142;
        addOrRemoveElementInArray(q, queries);
    }

    private static void addOrRemoveElementInArray(int q, long queries) {
        int[] arr = new int[q];
        int index = 0;
        int indexToRemove = 0;
        String query = queries+"";
        String[] a = query.split("");
        boolean insertNext = false;
        //12132142
        for (String s : a) {
            int value = Integer.parseInt(s);
            if (value == 1) {
                insertNext = true;
                continue;
            }
            if (insertNext) {
                arr[index] = value;
                index = index + 1;
                insertNext = false;
                continue;
            }
            if (value == 2) {
                if (arr.length - 1 >= 0) System.arraycopy(arr, 1, arr, 0, arr.length - 1);
                index = index - 1;
            }
        }
        for (int j : arr) {
            if (j != 0) {
                System.out.println(j + " ");
            }
        }
    }
}
