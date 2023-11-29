package practice;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StringSentence {
    public static void main(String[] args) {
        String s = stringSentence("sentence4 i1 am2 a3");
        System.out.println(s);
    }

    private static String stringSentence(String s) {
        String toReturn  = "";
        String[] strings = s.split(" ");
        Map<String, String> map = Arrays.stream(strings)
                .collect(Collectors.toMap(str -> str.substring(str.length()-1), Function.identity()));
        TreeMap sortedMap = new TreeMap(map);
        for(Object entry: sortedMap.values()) {
            toReturn = toReturn + " " + (entry.toString().substring(0, entry.toString().length()-1));
        }
        return toReturn;
    }
}
