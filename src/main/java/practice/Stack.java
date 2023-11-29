package practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Stack {
    public static void main(String[] args) {
        int b = 39/5;
        int a[] = new int[5];
        System.out.println(b);
        a[5] = b;
        System.out.println(a[5]);



        java.util.Stack<Integer> obj = new java.util.Stack<Integer>();
        obj.push(3);
        obj.push(2);
        obj.pop();
        obj.push(5);
        System.out.println(obj);

        TreeSet<String> set = new TreeSet<String>();
        set.add("apple");
        set.add("banana");
        set.add("orange");



    }

    public List<Integer> process(List<Integer> numbers, Function<Integer, Integer> func){
        List<Integer> list = new ArrayList<>();
        for (Integer num: numbers) {
            list.add(func.apply(num));
        }

        return list;

    }

    public List<Integer> process1(List<Integer> numbers, Function<Integer, Integer> func){
        return numbers.stream().map(func).collect(Collectors.toList());

    }
}
