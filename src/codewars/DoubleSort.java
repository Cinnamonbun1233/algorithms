package codewars; /**
 * Задача на сортировку
 * https://www.codewars.com/kata/57cc79ec484cf991c900018d
 */

import java.util.Arrays;
import java.util.Comparator;

public class DoubleSort {
    public static void main(String[] args) {
        Object[] array = {"Apple", 46, "287", 574, "Peach", "3", "69", 78, "Grape", "423"};
        Object[] newArray = dbSort(array);
        System.out.println(Arrays.toString(newArray));
    }

    public static Object[] dbSort(Object[] a) {
        Comparator<Object> comparator = (o1, o2) -> {
            if (o1 instanceof Integer && o2 instanceof String) {
                return -1;
            }
            if (o1 instanceof String && o2 instanceof Integer) {
                return 1;
            }
            if (o1 instanceof String && o2 instanceof String) {
                return ((String) o1).compareTo((String) o2);
            }
            if (o1 instanceof Integer && o2 instanceof Integer) {
                return ((Integer) o1).compareTo((Integer) o2);
            }
            return 0;
        };
        Arrays.sort(a, comparator);
        return a;
    }
}