import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        //задание 1
        Threewords();

        //задание 2
        checkSumSign();

        //задание 3
        printColor();

        //задание 4
        compareNumbers();

        //задание 5
        checkNumbers();

        //задание 6
        checkPositives();

        //задание 7
        checkIntPositives();

        //задание 8
        printIntString();

        //задание 9
        countYears();

        //задание 10
        changeNumbers();

        //задание 11
        countNumbers();

        //задание 12
        checkCount();

        //задание 13
        findElements();

        //задание 14
        changeMassiv(2, 2);

    }

    static void Threewords() {
        String str = new String("Apple/Orange/Banana");
        String strArr[] = str.split("/");
        for (String temp : strArr) {
            System.out.println(temp);
        }
    }

    //задание 2
    static void checkSumSign() {
        int a = 5;
        int b = 7;
        int c = a + b;
        if (c >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    //задание 3
    static void printColor() {
        int value = -10;
        if (value <= 0) {
            System.out.println("Красный");
        }
        if (value > 0 && value <= 100) {
            System.out.println("Желтый");
        }
        if (value > 100) {
            System.out.println("Зеленый");
        }
    }

    //задание 4
    static void compareNumbers() {
        int a = 20;
        int b = 30;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    //задание 5
    static boolean checkNumbers() {
        int a = 10;
        int b = 1;
        int c = a + b;
        boolean i;
        if (c >= 10 && c <= 20) {
            i = true;
            System.out.println(i);
        } else {
            i = false;
            System.out.println(i);
        }
        return i;
    }

    //задание 6
    static void checkPositives() {
        int a = 10;
        if (a >= 0) {
            System.out.println("Положительное число");
        } else {
            System.out.println("Отрицательное число");
        }
    }

    //задание 7
    static boolean checkIntPositives() {
        int a = 10;
        boolean i;
        if (a >= 0) {
            i = false;
            System.out.println(i);
        } else {
            i = true;
            System.out.println(i);
        }
        return i;
    }

    //задание 8
    static void printIntString() {
        String str = "Снег идет";
        for (int a = 1; a <= 5; a++) {
            System.out.println(str);
        }
    }

    //задание 9
    static boolean countYears() {
        int a = 2000;
        if (a % 4 == 0) {
            if (a % 100 == 0) {
                if (a % 400 == 0) {
                    return true;
                } else
                    return false;
            }
            return true;
        } else
            return false;
    }


    //задание 10
    static void changeNumbers() {
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int a = 0; a < arr.length; a++) {
            if (arr[a] == 0) {
                arr[a] = 1;
            } else {
                arr[a] = 0;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    //задание 11
    static void countNumbers() {
        int[] arr = new int[100];
        for (int a = 0; a <= 99; a++) {
            arr[a] = a;
            System.out.println("arr: " + a);
        }
    }

    //задание 12
    static void checkCount() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int a = 0; a < arr.length; a++) {
            if (arr[a] < 6) {
                arr[a] = arr[a] * 2;
                System.out.println(arr[a]);
            } else {
                System.out.println(arr[a]);
            }
        }
    }

    //задание 13
    static void findElements() {
        int a = 5;
        int[][] matrix = new int[a][a];
        for (int b = 0; b < a; b++) {
            for (int c = 0; c < a + 1; c++) {
                if (b == c || b + c == a - 1) {
                    matrix[b][c] = 1;
                }
            }
        }
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }

    //задание 14
    static void changeMassiv(int len, int initialValue) {
        int[] arr = new int[len];
        for (int a = 0; a < arr.length; a++) {
            arr[a] = initialValue;
        }
        System.out.println(Arrays.toString(arr));
    }
}
