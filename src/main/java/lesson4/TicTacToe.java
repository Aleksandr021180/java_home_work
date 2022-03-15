package lesson4;

import java.util.Random;
import java.util.Scanner;

public class TicTacToe {
    private static final String HEADER_FIRST_SYMBOL = "♣";
    private static final String SPACE_MAP = " ";
    private static int SIZE = 3;

    private static final char DOT_EMPTY = '•';
    private static final char DOT_HUMAN = 'X';
    private static final char DOT_AI = 'O';

    private static char[][] MAP;
    private static final Scanner in = new Scanner(System.in);
    private static final Random random = new Random();

    private static int turnCount;


    public static void turnGame() {
        do {
            System.out.println("\n\nИГРА НАЧИНАЕТСЯ!");
            init();
            printMap();
            playGame();
        } while (isContinueGame());
        endGame();

    }

    private static void init() {
        turnCount = 0;
        MAP = new char[SIZE][SIZE];

        initMap();
    }

    private static void initMap() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                MAP[i][j] = DOT_EMPTY;

            }
        }
    }

    private static void printMap() {
        printMapHeader();
        printMapBody();
    }

    private static void printMapHeader() {
        System.out.print(HEADER_FIRST_SYMBOL + SPACE_MAP);
        for (int i = 0; i < SIZE; i++) {
            printMapNumber(i);
        }
        System.out.println();
    }

    private static void printMapNumber(int i) {
        System.out.print(i + 1 + SPACE_MAP);
    }

    private static void printMapBody() {
        for (int i = 0; i < SIZE; i++) {
            printMapNumber(i);
            for (int j = 0; j < SIZE; j++) {
                System.out.print(MAP[i][j] + SPACE_MAP);
            }
            System.out.println();
        }
    }

    private static void playGame() {
        while (true) {
            humanTurn();
            printMap();
            if (checkEnd(DOT_HUMAN)) {
                break;
            }

            aiTurn();
            printMap();
            if (checkEnd(DOT_AI)) {
                break;
            }
        }
    }

    private static void humanTurn() {
        System.out.println("ХОД ЧЕЛОВЕКА");
        int columNumber;
        int rowNumber;


        while (true) {
            rowNumber = getValidNumberFromUser() - 1;
            columNumber = getValidNumberFromUser() - 1;

            if (isCellFree(rowNumber, columNumber)) {
                break;

            }
        }

        MAP[rowNumber][columNumber] = DOT_HUMAN;
        turnCount++;

    }

    private static int getValidNumberFromUser() {
        while (true) {
            System.out.print("Введите координату(1-" + SIZE + "): ");
            if (in.hasNextInt()) {
                int n = in.nextInt();
                if (isNumberValid(n)) {
                    return n;
                }
                System.out.println("\nПроверьте значение координаты. Должнобыть от 1 до" + SIZE);

            } else {
                in.next();
                System.out.println("\nВвод допускает лишь целые числа");
            }
        }
    }

    private static boolean isNumberValid ( int n){
        return n >= 1 && n <= SIZE;
    }

    private static boolean isCellFree ( int rowNumber, int columNumber){
        return MAP[rowNumber][columNumber] == DOT_EMPTY;
    }

    private static boolean checkEnd ( char symbol){
        if (checkWin(symbol)) {
            if (symbol == DOT_HUMAN) {
                System.out.println("\nВы победили!");
            } else {
                System.out.println("\nПобедил компьютер!");
            }
            return true;
        }

        if (checkDraw()) {
            System.out.println("Ничья!");
            return true;
        }
        return false;
    }

    private static boolean checkDraw () {
        return turnCount >= SIZE * SIZE;
    }

    private static boolean checkWin ( char symbol){
        if (MAP[0][0] == symbol && MAP[0][1] == symbol && MAP[0][2] == symbol) {
            return true;
        }
        if (MAP[1][0] == symbol && MAP[1][1] == symbol && MAP[1][2] == symbol) {
            return true;
        }
        if (MAP[2][0] == symbol && MAP[2][1] == symbol && MAP[2][2] == symbol) {
            return true;
        }
        if (MAP[0][0] == symbol && MAP[1][0] == symbol && MAP[2][0] == symbol) {
            return true;
        }
        if (MAP[0][1] == symbol && MAP[1][1] == symbol && MAP[2][1] == symbol) {
            return true;
        }
        if (MAP[0][2] == symbol && MAP[1][2] == symbol && MAP[2][2] == symbol) {
            return true;
        }
        if (MAP[0][0] == symbol && MAP[1][1] == symbol && MAP[2][2] == symbol) {
            return true;
        }
        if (MAP[2][0] == symbol && MAP[1][1] == symbol && MAP[0][2] == symbol) {
            return true;
        }
        return false;
    }

    private static void aiTurn () {
        System.out.println("ХОД КОМПЬЮТЕРА");

        int rowNumber;
        int columNumber;

        do {
            rowNumber = random.nextInt(SIZE);
            columNumber = random.nextInt(SIZE);

        } while (!isCellFree(rowNumber, columNumber));

        MAP[rowNumber][columNumber] = DOT_AI;
        turnCount++;

    }

    private static boolean isContinueGame () {
        System.out.println("Хотите продолжить? y\\n");
        return switch (in.next()) {
            case "y", "yes", "+", "да", "конечно" -> true;
            default -> false;
        };
    }
    private static void endGame () {
        in.close();
        System.out.println("Возвращайтесь!");

    }
}