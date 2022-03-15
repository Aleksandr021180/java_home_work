package lesson3;

public class Home_work3 {
    public static void main(String[] args) {

        invertArray();
        fillArray();
        changeArray();
        fillDiagonal();
        MethodAccept(3, 5);
        minAndMax();

    }

    /*Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
    С помощью цикла и условия заменить 0 на 1, 1 на 0;
     */
    public static void invertArray() {

        int[] arr = {1, 0, 1, 0, 0, 1};

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == 1) {

                System.out.println(0);
            } else {
                System.out.println(1);
            }
        }
    }
//    Задать пустой целочисленный массив длиной 100. С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100;

    private static void fillArray() {

        int[] arr = new int[100];

        for (int i = 0; i < arr.length; i++) {

            arr[i] = i + 1;

            System.out.print(arr[i] + " ");

        }
    }
/* Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом,
и числа меньшие 6 умножить на 2;
 */

    private static void changeArray() {

        int[] w = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

        for (int i = 0; i < w.length; i++) {

            if (w[i] < 6) {
                w[i] = w[i] * 2;

                System.out.println(w[i] + " ");
            }
        }
    }

    /*Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
 и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей,
     если обе сложно). Определить элементы одной из диагоналей можно по следующему принципу:
    индексы таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];
     */

    private static void fillDiagonal() {

        int[][] arr = new int[4][4];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i == j) {
                    arr[i][j] = 1;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    /*Написать метод, принимающий на вход два аргумента: len и initialValue,
    и возвращающий одномерный массив типа int длиной len,
    каждая ячейка которого равна initialValue;
     */

    private static void MethodAccept(int len, int initialValue) {
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = i;
            System.out.println("len[" + i + "] = " + arr[i]);
        }
    }
    //    Задать одномерный массив и найти в нем минимальный и максимальный элементы ;

    private static void minAndMax() {

        int[] arr = new int[5];
        int max = arr[0];
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            System.out.println(max);
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println(min);
    }
}






























