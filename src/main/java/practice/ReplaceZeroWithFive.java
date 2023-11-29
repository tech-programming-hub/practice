package practice;

public class ReplaceZeroWithFive {
    public static void main(String[] args) {
        int n = 10001;
        System.out.println(replaceZeroToFive(n));
    }

    private static int replaceZeroToFive(int n) {
        if(n == 0) {
            return 5;
        }else {
            return replaceZeroToFiveRec(n);
        }

        /*int newDigit = 0;
        if(n%10 == 0) {
            newDigit = (n/10)*10 +5;
            n = n/10;
            replaceZeroToFive(n);
            *//*if (n >= 1) {
                replaceZeroToFive(n);
            }*//*
        }else{

        }


        System.out.println(newDigit);*/
    }

    private static int replaceZeroToFiveRec(int n) {
        if(n ==0) {
            return 0;
        }
        int remainder = n%10;
        if (remainder == 0) {
            remainder = 5;
        }
        return replaceZeroToFiveRec(n/10)*10+remainder;
    }
}
