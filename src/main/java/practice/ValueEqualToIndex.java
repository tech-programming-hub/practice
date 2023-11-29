package practice;

public class ValueEqualToIndex {
    public static void main(String[] args) {
        int[] a = {10, 12, 12, 13, 14, 16};
        System.out.println(findValueToIndex(a));
    }

    private static int findValueToIndex(int[] a) {
        int value = 0;
        for (int i = 0; i < a.length; i++) {
            if (i+1 == a[i]) {
               return a[i];
            }
        }
        return -1;
    }
}
