import java.util.Arrays;

public class Lesson3 {

    public static void main(String[] args) {
        taskOne();
        taskTwo();
        taskThree();
        taskFour();
        taskFive();
        taskSix();
        taskSeven();
        taskEight();

    }

    private static void taskEight() {
        System.out.println("Задание 7:");

        int[] array = {1, 2, 3, 4, 5};
        int n = 2;
        turnArray(array, n);

        System.out.println();
    }

    private static void turnArray(int[] array, int n) {
        System.out.println("Было: " + Arrays.toString(array));

        if (n < 0) {
            n = array.length - Math.abs(n);
        }

        for (int j = 0; j < n; j++) {
            int lastElement = array[array.length - 1];
            for (int i = array.length - 1; i > 0; i--) {
                array[i] = array[i - 1];
            }
            array[0] = lastElement;
        }

        System.out.println("Стало: " + Arrays.toString(array));

    }

    private static void taskSeven() {
        System.out.println("Задание 7:");

        int[] array = {1, 1, 1, 1, 3};
        System.out.println("Массив: " + Arrays.toString(array));
        boolean result = checkArray(array);
        System.out.println(result);
        System.out.println();

    }

    private static boolean checkArray(int[] array) {
        if (array.length == 0) {
            //проверка что массив не пустой
            return false;
        }

        int leftSumm = 0;
        int rightSumm = 0;
        for (int i = 0; i < array.length; i++) {
            leftSumm += array[i];

            for (int j = i + 1; j < array.length; j++) {
                rightSumm = rightSumm + array[j];
            }
            if (leftSumm == rightSumm) {
                return true;
            }
            rightSumm = 0;
        }
        return false;
    }

    private static void taskSix() {
        System.out.println("Задание 6:");

        int[] array = {5, 2, -5, 4, 8, 1};
        System.out.println("Массив: " + Arrays.toString(array));

        int min = array[0];
        int max = min;
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println(String.format("Минимум: %s, Максимум: %s", min, max));

        System.out.println();
    }

    private static void taskFive() {
        System.out.println("Задание 5:");

        int[] array = initArray(5, 3);
        System.out.println(Arrays.toString(array));

        System.out.println();

    }

    private static int[] initArray(int len, int initialValue) {

        int[] array = new int[len];

        for (int i = 0; i < array.length; i++) {
            array[i] = initialValue;
        }

        return array;
    }

    private static void taskFour() {
        System.out.println("Задание 4:");

        int arraySize = 5;

        int[][] array = new int[arraySize][arraySize];
        for (int i = 0; i < array.length; i++) {
            array[i][i] = 1;
        }

        int k = arraySize - 1;
        for (int i = 0; i < array.length; i++) {
            array[i][k] = 1;
            k -= 1;
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();
    }

    private static void taskThree() {
        System.out.println("Задание 3:");

        int[] array = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6) {
                System.out.print(array[i] * 2 + " ");
            }
        }

        System.out.println("\n");

    }

    private static void taskTwo() {
        System.out.println("Задание 2:");
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
        System.out.println("Результат: " + Arrays.toString(array));
        System.out.println();
    }

    private static void taskOne() {
        System.out.println("Задание 1:");
        int[] array = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println("Было: " + Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                array[i] = 1;
            } else {
                array[i] = 0;
            }
        }
        System.out.println("Было: " + Arrays.toString(array));
        System.out.println();
    }

}