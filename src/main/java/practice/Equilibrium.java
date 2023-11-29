package practice;

public class Equilibrium {

    public static void main(String[] args) {
        int[] arr1 = {-7, 1, 5, 2, -4, 3, 0};
        int[] arr2 = {1, 5, 2, 3, 10, 3, 2, 5, 1};
        System.out.println(getEquilibrium(arr2));
    }
    private static int getEquilibrium(int[] a) {
        int leftSum = 0;
        int totalSum = 0;
        for (int j : a) {
            totalSum = totalSum + j;
        }
        for(int i = 1; i< a.length; i++){
            leftSum = leftSum + a[i-1];
            if(leftSum == (totalSum-leftSum-a[i])) {
                return i;
            }
        }
        return -1;
    }
}
