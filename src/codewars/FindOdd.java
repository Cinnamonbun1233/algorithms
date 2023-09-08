package codewars;

import java.util.HashMap;
import java.util.Map;

/**
 * Задача на Map
 * https://www.codewars.com/kata/54da5a58ea159efa38000836
 */

public class FindOdd {

    public static void main(String[] args) {
        int res = FindOdd.findIt(new int[]{1, 2, 2, 3, 3, 3, 4, 3, 3, 3, 2, 2, 1});
        System.out.println(res);
    }

    public static int findIt(int[] a) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int n : a) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }

        for (Integer key : map.keySet()) {
            if (map.get(key) % 2 != 0) {
                return key;
            }
        }

        return 0;
    }
}