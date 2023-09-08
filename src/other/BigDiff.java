package other;

public class BigDiff {

    public static void main(String[] args) {

        int[] array = {7, 2, 10, 9};

        int result1 = bigDiff1(array);
        int result2 = bigDiff2(array);

        System.out.println(result1);
        System.out.println(result2);
    }

    public static int bigDiff1(int[] array) {

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i : array) {

            if (i > max) {
                max = i;
            }

            if (i < min) {
                min = i;
            }
        }

        return max - min;
    }

    public static int bigDiff2(int[] array) {

        int min = array[0];
        int max = array[0];

        for (int i : array) {
            min = Math.min(i, min);
            max = Math.max(i, max);
        }

        return max - min;
    }
}