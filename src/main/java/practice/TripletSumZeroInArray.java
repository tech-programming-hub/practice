package practice;

public class TripletSumZeroInArray {
    public static void main(String[] args) {
        int[] a = {0, -1, 2, -3, 1};
        System.out.println(findTriplet(a, a.length));
    }

    private static boolean findTriplet(int[] a, int length) {
        for (int i = 0; i < length-1; i++) {
            int firstNum = a[i];
            int secondNum = a[i+1];
            for (int j = i+2; j < length; j++) {
                int thirdNum = a[j];
                if(firstNum + secondNum + thirdNum == 0){
                    return true;
                }
            }
        }
        return false;
    }
}
