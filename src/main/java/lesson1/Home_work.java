package lesson1;

public class Home_work{

    public static void main(String[] args) {
        printThreeWorld();
        checkSumSign();
        printColor();
        compareNumbers();

    }

    static void printThreeWorld() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");

    }

    private static void checkSumSign() {
        int a = 5;
        int b = -10;

        System.out.println(a + b);
        if (a + b >= 0) {
            System.out.println("Сумма положительная");
        } else if (a + b <= 0) {
            System.out.println("Сумма отрицательная");
        }

    }

    private static void printColor() {
        int value = -5;
        System.out.println(value);
        if (value < 0) {
            System.out.println("Красный");
        } else if (value > 0) {
            System.out.println("Желтый");
        }
    }

    private static void compareNumbers() {
        int a = 9;
        int b = 7;
        if(a >= b) {
            System.out.println("a >= b");
        }else{
            System.out.println("a < b");
        }

    }
}

