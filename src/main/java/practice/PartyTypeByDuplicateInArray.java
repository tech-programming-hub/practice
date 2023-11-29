package practice;

import java.util.Arrays;
import java.util.HashSet;

public class PartyTypeByDuplicateInArray {
    public static void main(String[] args) {
        int[] a = { 2, 3, 4, 5};
        String s = getPartyTypeByDuplicate(a, a.length);
        System.out.println(s);
    }

    private static String getPartyTypeByDuplicate(int[] a, int length) {
        //solution 1
        /*if(duplicateFound(a, length)) {
            return "BOYS";
        }
        return "GIRLS";*/


        //solution 2
        HashSet<Integer> color = new HashSet<>();
        for (int i = 0; i < a.length; i++) {
            if (color.contains(a[i])) {
                return "BOYS";
            }
            color.add(a[i]);
        }
        return "GIRLS";
    }

    private static boolean duplicateFound(int[] a, int length) {
        Arrays.sort(a);
        for (int i = 0; i < length-1; i++) {
            if (a[i] == a[i+1]) {
                return true;
            }
        }
        return false;
    }
}
