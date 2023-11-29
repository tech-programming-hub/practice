package practice;

public class MinimumIndexDistanceInArray {
    public static void main(String[] args) {
        int a[]= {2, 5, 3, 5, 4, 4, 2, 3};
        int x = 3;
        int y = 2;
        int index = findMinimumIndexDistance(a, a.length, x, y);
        System.out.println(index);

    }

    private static int findMinimumIndexDistance(int[] a, int length, int x, int y) {
        //find index of x and y
        int indexOfX = -1;
        int indexOfY = -1;
        int loopCount = 0;
        for (int i = 0; i < length; i++) {
            loopCount = loopCount + 1;
            if (a[i] == x) {
                indexOfX = i;
            }
            if (a[i] == y) {
                indexOfY = i;
            }
        }
        if (indexOfX > -1 && indexOfY > -1 && loopCount == length) {
            return indexOfX > indexOfY ? indexOfX-indexOfY : indexOfY-indexOfX;
        }
        return -1;
    }
}
