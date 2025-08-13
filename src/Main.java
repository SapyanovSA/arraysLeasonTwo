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

        int[] cost_1 = {30_000, 20_000, 50_000, 40_000, 10_000};
        int maxCost = 0;
        int minCost = 100_000;

        for (int i : cost_1) {

            if (i > maxCost) {
                maxCost = i;
            }

            if (i < minCost) {
                minCost = i;
            }

        }

        System.out.println("Минимальная сумма трат за неделю составила " + minCost
                + " рублей. Максимальная сумма трат за неделю составила " + maxCost + " рублей.");
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

        for (int i = 0; i < reverseFullName.length / 2; i++) {

            char save = reverseFullName[i];
            reverseFullName[i] = reverseFullName[reverseFullName.length - 1 - i];
            reverseFullName[reverseFullName.length - 1 - i] = save;

        }

        for (char j : reverseFullName) {
            System.out.print(j);
        }

    }
}
