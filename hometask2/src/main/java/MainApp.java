import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {

        // Task 1
        // Дано произвольное число. Необходимо узнать, сколько в конце числа нулей.
        Scanner scanner = new Scanner(System.in);

        System.out.println("Task 1");

        System.out.print("\tEnter your number: ");
        int value = scanner.nextInt();

        if (value == 0) {
            System.out.printf("\tThere are '1' zeros at the end of the number '%d'.\n", value);
            return;
        }

        int zero = 0;
        int newValue = value;

        while(value % 10 == 0) {
            value = value / 10;
            zero++;
        }

        System.out.printf("\tThere are '%d' zeros at the end of the number '%d'.\n", zero, newValue);

        // Task 2
        // Необходимо найти интервал числа n (интервал это произведение всех целых чисел от 1 до n)
        System.out.println("Task 2");

        System.out.print("\tEnter your number: ");
        int n = scanner.nextInt();

        if (n == 0) {
            System.out.printf("\tThe interval of the number '%d' is '0'.\n", n);
            return;
        }

        int interval = 1;

        for (int i = 1; i <= n; i++) {
            interval = interval * i;
        }

        System.out.printf("\tThe interval of the number '%d' is '%d'.\n", n, interval);

        // Task 3
        // Пользователь вводит два числа. Необходимо найти среднее арифметическое между заданными числами (сумма чисел / количество чисел)
        System.out.println("Task 3");

        System.out.print("\tEnter first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("\tEnter second number: ");
        double num2 = scanner.nextDouble();

        System.out.printf("\tThe average between the '%f' and '%f' is '%f'.", num1, num2, (num1 + num2) / 2);
    }
}