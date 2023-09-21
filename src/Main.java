import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random(0);
        System.out.println("Введите строк: ");
        int rows = scanner.nextInt();
        System.out.println("Введите кол-во элементов строки: ");
        int cols = scanner.nextInt();
        int sum = 0;
        int[][] arr = new int[rows][cols];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = random.nextInt(10);
                sum += arr[i][j]; // Вычисление суммы элементов массива
            }
        }

        System.out.println(Arrays.deepToString(arr)); // Вывод массива на экран
        //
        double averange = (double)sum/(rows*cols); // Вычисление среднеарифметического значения
        System.out.print("Сумма элементов массива: " + sum); // Печать суммы
        System.out.println();
        System.out.printf("Среднее арифметическое значение: %.2f", averange); // Печать среднеарифметического значения

        // Вычисление мин. и макс. значения
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] < min)
                    min = arr[i][j];
                if (arr[i][j] > max)
                    max = arr[i][j];
            }
        }
        System.out.println();
        System.out.printf("MIN = %d, MAX = %d", min,max);

        // Сортировка массива
        for (int ii = 0; ii < rows; ii++) {
            for (int jj = 0; jj < cols; jj++) {

                for (int i = 0; i < rows; i++) {
                    for (int j = 0; j < cols; j++) {

                        if(arr[i][j] > arr[ii][jj]) {
                            int buffer = arr[ii][jj];
                            arr[ii][jj] = arr[i][j];
                            arr[i][j] = buffer;
                        }
                    }
                }
            }
        }
        System.out.println();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(arr[i][j] + "\t");

            }
            // System.out.println();
        }

    }
}