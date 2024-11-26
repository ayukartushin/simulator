package cycle;
import java.util.Scanner;

public class SumNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число N: ");
        int n = scanner.nextInt();

        int sum = calculateSum(n);
        System.out.println("Сумма чисел от 1 до " + n + " равна " + sum);
    }

    static int calculateSum(int n) {
        int sum = 0;
        //TODO: Сумма чисел от 1 до N
        // Напишите программу,
        // которая принимает число N и выводит сумму всех чисел
        // от 1 до N (включительно).
        // Например, для N = 5 результат должен быть 15
        // (1 + 2 + 3 + 4 + 5).
        return sum;
    }
}
