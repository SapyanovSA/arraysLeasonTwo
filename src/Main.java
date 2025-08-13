import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        //Задача 1
        System.out.println("Задача 1");

        int[] cost = {10_000, 10_000, 30_000, 10_000, 50_000};
        int sum = 0;

        for (int i : cost) {
            sum += i;
        }

        System.out.println("Сумма  затрат за месяц составила " + sum + " руб.");
        System.out.println();

        //Задача 2
        System.out.println("Задача 2");

        int[] cost_1 = {10_000, 20_000, 30_000, 50_000, 40_000};

        Arrays.sort(cost_1);
        int costMin = cost_1[0];
        int costMax = cost_1[cost_1.length - 1];

        System.out.println("Минимальная сумма трат за неделю составила " + costMin + " руб." +
                "Максммальная сумма трат за неделю составила " + costMax + " руб.");
        System.out.println();

        // Задача 3
        System.out.println("Задача 3");

        int[] cost_2 = {100_000, 50_000, 120_000, 70_000, 80_000};
        int sumMonth = 0;

        for (int oneWeek : cost_2) {
            sumMonth += oneWeek;
        }

        double costMiddle = (double) sumMonth / cost_2.length;
        System.out.println("Средняя сумма трат за месяц " + costMiddle + " руб.");
        System.out.println();

        // Задача 4
        System.out.println("Задача 4");

        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};

        for (int index = reverseFullName.length - 1; index >= 0; index--) {

            System.out.print(reverseFullName[index]);
        }

    }
}
