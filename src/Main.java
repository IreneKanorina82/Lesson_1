import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }

        //задание 1
        Threeewords("Apple");
        Threeewords("Orange");
        Threeewords("Banana");

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
        //findElements();

        //задание 14
        changeMassiv();

    }

    static void Threeewords(String word) {
        System.out.println(word);
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
    static void checkNumbers() {
        int a = 10;
        int b = 1;
        int c = a + b;
        if (c >= 10 && c <= 20) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
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
    static void checkIntPositives() {
        int a = 10;
        if (a >= 0) {
            System.out.println("False");
        } else {
            System.out.println("True");
        }
    }
    //задание 8
    static void printIntString() {
        String str = "Снег идет";
            for (int a = 1; a <= 5; a++) {
                System.out.println(str);
        }
    }
    //задание 9
    static void countYears() {
        int a = 2000;
        if (a % 4 == 0) {
            if (a % 100 == 0) {
                if (a % 400 == 0) {
                    System.out.println("True");
                } else
                    System.out.println("False");
            }
            System.out.println("True");
        } else
            System.out.println("False");
    }
    //задание 10
    static void changeNumbers() {
        int[] arr = {1,1,0,0,1,0,1,1,0,0};
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
        int[] arr = new int [101];
        for (int a = 0; a <= 100; a++) {
            arr[a] = a;
            System.out.println("arr: " + a);
        }
    }
    //задание 12
    static void checkCount() {
        int[] arr = {1,5,3,2,11,4,5,2,4,8,9,1};
        for (int a = 0; a < arr.length; a++) {
            if (arr[a] < 6) {
                arr[a] = arr[a] * 2;
                System.out.println(arr[a]);
            }
            else {
                System.out.println(arr[a]);
            }

            }
        }
    //задание 13
//    static void findElements() {
//        int[] arr = new int [101];
//        for (int a = 0; a <= 100; a++) {
//            arr[a] = a;
//            System.out.println("arr: " + a);
//        }
//    }
    //задание 14
    static void changeMassiv() {
        int[]= int len, int initialValue;
        int[] arr = new int[len];
        for (int a = 0; a < len; a++) {
            arr[a] = initialValue;
                return;
        }
    }
}
