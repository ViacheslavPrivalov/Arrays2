import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        extraTask5();
        extraTask6();
        extraTask7();
        extraTask8();
        extraTask9();
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void task1() {
        System.out.println("Задача1");
        int[] arr = generateRandomArray();
        int sum = 0;
        for (final int pay : arr) {
            sum += pay;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");
    }

    public static void task2() {
        System.out.println("Задача2");
        int[] arr = generateRandomArray();
        int min = 200_000;
        int max = 100_000;
        for (final int pay : arr) {
            if (pay < min) {
                min = pay;
            }
            if (pay > max) {
                max = pay;
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + min + " рублей. " +
                "Максимальная сумма трат за день составила " + max + " рублей");
    }

    public static void task3() {
        System.out.println("Задача3");
        int[] arr = generateRandomArray();
        int sum = 0;
        for (final int pay : arr) {
            sum += pay;
        }
        double avg = sum / arr.length;
        System.out.println("Средняя сумма трат за месяц составила " + avg + " рублей");
    }

    public static void task4() {
        System.out.println("Задача4");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
        System.out.println();
    }

    public static void extraTask5() {
        System.out.println("Extra task 5");
        int[][] matrix = new int[3][3];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if ((i + j) % 2 == 0) {
                    matrix[i][j] = 1;
                } else {
                    matrix[i][j] = 0;
                }
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void extraTask6() {
        System.out.println("Extra task 6");
        int[] arr = {5, 4, 3, 2, 1};
        int[] arrNew = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arrNew[i] = arr[arr.length - i - 1];
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arrNew));
    }

    public static void extraTask7() {
        System.out.println("Extra task 7");
        int[] arr = {5, 4, 3, 2, 1};
        System.out.println(Arrays.toString(arr));
        int a, b; //временные переменные
        int n = (int) Math.round(arr.length / 2.0);  // середина массива
        for (int i = 0; i < n; i++) {
            a = arr[i];
            b = arr[arr.length - 1 - i];
            arr[i] = b;
            arr[arr.length - 1 - i] = a;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void extraTask8() {
        System.out.println("Extra task8"); //не понял отличие 8 задачи от 9
        int[] arr = {-6, 2, 5, -8, 8, 10, 4, -7, 12, 1};
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            int diff = -2 - arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] == diff) {
                    System.out.println(arr[i] + " " + arr[j]);
                }
            }
        }
    }

    public static void extraTask9() {
        System.out.println("Extra task9");
        int[] arr = {-6, 2, 5, -8, 8, 10, 4, -7, 12, 1};
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == -2) {
                    System.out.println(arr[i] + " " + arr[j]);
                }
            }
        }
    }
}