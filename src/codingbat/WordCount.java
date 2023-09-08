package codingbat; /**
 * Задача Word Count
 * https://codingbat.com/prob/p117630
 */

import java.util.HashMap;
import java.util.Map;

public class WordCount {
    public static void main(String[] args) {
        String[] array = {"c", "b", "a"};
        Map<String, Integer> map = wordCount2(array);
        System.out.println(map);
    }

    public static Map<String, Integer> wordCount1(String[] strings) {
        Map<String, Integer> wordCountMap = new HashMap<>();
        for (String s : strings) {
            if (wordCountMap.containsKey(s)) {
                wordCountMap.put(s, wordCountMap.get(s) + 1);
            } else {
                wordCountMap.put(s, 1);
            }
        }
        return wordCountMap;
    }

    public static Map<String, Integer> wordCount2(String[] strings) {
        Map<String, Integer> map = new HashMap<>();
        for (String s : strings) {
            map.put(s, map.getOrDefault(s, 0) + 1);
        }
        return map;
    }
}