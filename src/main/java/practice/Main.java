package practice;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main
{

    public static void main(String[] args) {

        Map map = new HashMap();
        Set se = new HashSet();
        /*try{
            int a[] = {1, 2, 3, 4};
            for (int i = 0; i <4; i++) {
                System.out.println("hellooooo");
            }
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println();
        }catch (Exception e){
            System.out.println("hello in ecs");
        }*/

        Test obj = new Test();
        int a = 2;
        double b = 3.2;
        obj.add(a, b);
        obj.add(b, a);
        System.out.println(obj.x+ " "+ obj.y);
        /*int leftSum = 0;
        int rightSum = 0;
            int a[] = {-7, 1, 5, 2, -4, 3, 0};
//        Iterate a loop over the array.
        for (int i = 0; i < a.length; i++) {
            // For each index, find the sum of elements towards the left and right of the current index.
            leftSum = leftSum+a[i];
//        If the lsum and rsum is equal, the current index is an equilibrium index.
//        Else, return -1.
        }*/


    }
}

class Test extends Exception {
    int x;
    double y;

    void add(int a, int b){
        x = a+b;
    }
    void add(double c, double d) {
        y = c+d;
    }
    Test()  {
        this.x = 0;
        this.y = 0;
    }
}
