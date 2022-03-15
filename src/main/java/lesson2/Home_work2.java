package lesson2;

public class Home_work2 {
    public static void main(String[] args) {



        checkSumSign(5,7);
        outNamber();
        testOutNamber();
        testOutCycle();
        System.out.println(testPrintYear(3045));
    }

    /*Написать метод, принимающий на вход два целых числа и проверяющий,
    что их сумма лежит в пределах от 10 до 20 (включительно),
    если да – вернуть true, в противном случае – false
     */
    private static boolean checkSumSign(int a, int b) {

        System.out.println(a + b);

        if (a + b >= 10 && a + b <= 20) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        return false;
    }

    /*Написать метод, которому в качестве параметра передается целое число,
    метод должен напечатать в консоль, положительное ли число передали или отрицательное.
    Замечание: ноль считаем положительным числом
     */
    private static void outNamber() {
        int a = -6;
        System.out.println(a);
        if (a >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }

    /*Написать метод, которому в качестве параметра передается целое число. М
    етод должен вернуть true, если число отрицательное, и вернуть false если положительное
     */
    private static void testOutNamber() {
        int a = 0;
        System.out.println(a);
        if (a >= 0) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

    /*Написать метод, которому в качестве аргументов передается строка и число,
    метод должен отпечатать в консоль указанную строку, указанное количество раз
     */
    private static void testOutCycle() {

        final int LIMIT_OF_CYCLE = 6;

        for (int i = 0; i < LIMIT_OF_CYCLE; i++) {

            System.out.println("5");
        }
    }

    /*Написать метод, который определяет, является ли год високосным,
    и возвращает boolean (високосный - true, не високосный - false). К
    аждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный
     */
    private static boolean testPrintYear(int i) {

        if ((i % 4 == 0) && ((i%100 != 0) || (i%400 == 0))) {
            return true;

        }

        return false;
    }
}












