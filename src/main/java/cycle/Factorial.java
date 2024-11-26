package cycle;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число N: ");
        int n = scanner.nextInt();

        long factorial = calculateFactorial(n);
        System.out.println("Факториал числа " + n + " равен " + factorial);
    }

    static long calculateFactorial(int n) {
        //TODO: Факториал числа
        // Напишите программу, которая принимает число N
        // и выводит его факториал (N!).
        // Например, для N = 5 результат должен быть 120
        // (5! = 5 × 4 × 3 × 2 × 1).
        return 0L;
    }
}
