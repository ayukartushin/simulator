package cycle;

import java.util.Scanner;

public class ReverseNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число N: ");
        int n = scanner.nextInt();

        System.out.println(printReverse(n));
    }

    static String printReverse(int n) {
        String result = "";
        //TODO: Вывод чисел от N до 1
        // Напишите программу, которая принимает число N
        // и выводит все числа от N до 1 в обратном порядке.
        // Например, для N = 5 вывод должен быть: 5, 4, 3, 2, 1.
        return result.trim();
    }
}
