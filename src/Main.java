import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
        task9();
        task10();
        task1Additional();
        task2Additional();
        scanner.close();
    }

    // 1. Написать программу для вывода названия поры года по номеру месяца.
    //    При решении используйте оператор switch-case.
    private static void task1() {
        System.out.println("\n--------------- Task 1 ---------------");
        System.out.println("Enter a month number from 1 to 12");
        int monthNumber = scanner.nextInt();

        switch (monthNumber) {
            case 1, 2, 12:
                System.out.println("Month number " + monthNumber + " is Winter");
                break;
            case 3, 4, 5:
                System.out.println("Month number " + monthNumber + " is Spring");
                break;
            case 6, 7, 8:
                System.out.println("Month number " + monthNumber + " is Summer");
                break;
            case 9, 10, 11:
                System.out.println("Month number " + monthNumber + " is Autumn");
                break;
            default:
                System.out.println("You entered the wrong number");
        }
    }

    // 2. Написать программу для вывода названия поры года по номеру месяца.
    //    При решении используйте оператор if-else-if.
    private static void task2() {
        System.out.println("\n--------------- Task 2 ---------------");
        System.out.println("Enter a month number from 1 to 12");
        int monthNumber = scanner.nextInt();

        if (monthNumber == 1 || monthNumber == 2 || monthNumber == 12) {
            System.out.println("Month number " + monthNumber + " is Winter");

        } else if (monthNumber == 3 || monthNumber == 4 || monthNumber == 5) {
            System.out.println("Month number " + monthNumber + " is Spring");

        } else if (monthNumber == 6 || monthNumber == 7 || monthNumber == 8) {
            System.out.println("Month number " + monthNumber + " is Summer");

        } else if (monthNumber == 9 || monthNumber == 10 || monthNumber == 11) {
            System.out.println("Month number " + monthNumber + " is Autumn");
        } else {
            System.out.println("You entered the wrong number");
        }
    }

    // 3. Для введенного числа t (температура на улице) вывести
    // Если t>–5, то вывести «Тепло».
    // Если –5>= t > –20, то вывести «Нормально».
    // Если –20>= t, то вывести «Холодно».
    private static void task3() {
        System.out.println("\n--------------- Task 3 ---------------");
        System.out.println("Enter a number indicating the temperature outside");
        int t = scanner.nextInt();

        if (t > -5) {
            System.out.println("Тепло");
        } else if (t > -20) {
            System.out.println("Нормально");
        } else {
            System.out.println("Холодно");
        }
    }

    // 4. По введенному номеру определить цвет радуги (1 – красный, 4 – зеленый и т. д.)
    private static void task4() {
        System.out.println("\n--------------- Task 4 ---------------");
        System.out.println("Enter a number indicating the rainbow color number from 1 to 7");
        int colorNumber = scanner.nextInt();

        switch (colorNumber) {
            case 1 -> System.out.println("Red");
            case 2 -> System.out.println("Orange");
            case 3 -> System.out.println("Yellow");
            case 4 -> System.out.println("Green");
            case 5 -> System.out.println("Light blue");
            case 6 -> System.out.println("Blue");
            case 7 -> System.out.println("Purple");
            default -> System.out.println("You entered the wrong number");
        }
    }

    // 5. При помощи цикла for вывести на экран нечетные числа от 1 до 99
    private static void task5() {
        System.out.println("\n--------------- Task 5 ---------------");

        for (int i = 1; i < 100; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    // 6. Необходимо вывести на экран числа от 5 до 1
    private static void task6() {
        System.out.println("\n--------------- Task 6 ---------------");

        for (int i = 5; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    // 7. Напишите программу, где пользователь вводит любое целое положительное число.
    // А программа суммирует все числа от 1 до введенного пользователем числа.
    private static void task7() {
        System.out.println("\n--------------- Task 7 ---------------");
        System.out.println("Enter any positive integer");
        int num = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            sum += i;
        }
        System.out.println("The sum of the numbers from 1 to the entered number is " + sum);
    }

    // 8.Необходимо, чтоб программа выводила на экран такую последовательность: 7 14 21 28 35 42 49 56 63 70 77 84 91 98
    private static void task8() {
        System.out.println("\n--------------- Task 8 ---------------");

        int j = 7;
        while (j < 100) {
            System.out.print(j + " ");
            j += 7;
        }
        System.out.println();
    }

    // 9. Вывести 10 первых чисел последовательности 0, -5,-10,-15..
    private static void task9() {
        System.out.println("\n--------------- Task 9 ---------------");

        for (int i = 0; i > -50; i -= 5) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    // 10. Составьте программу, выводящую на экран квадраты чисел от 10 до 20 включительно.
    private static void task10() {
        System.out.println("\n--------------- Task 10 ---------------");

        for (int i = 10; i <= 20; i++) {
            int square = i;
            square *= i;
            System.out.print(square + " ");
        }
        System.out.println();
    }

    // Дополнительное задание
    // 1. Выведите на экран первые 11 членов последовательности Фибоначчи.
    private static void task1Additional() {
        System.out.println("\n--------------- Task 1 Additional ---------------");
        System.out.println("\nЧисла Фибоначчи");

        int num1 = 0;
        int num2 = 1;
        int num3;

        System.out.print(num1 + " " + num2 + " ");
        for (int i = 1; i <= 9; i++) {
            num3 = num1 + num2;
            System.out.print(num3 + " ");
            num1 = num2;
            num2 = num3;
        }
        System.out.println();
    }

    // 2. Напишите программу, которая выводит на консоль таблицу умножения
    private static void task2Additional() {
        System.out.println("\n--------------- Task 2 Additional ---------------");
        System.out.println("\n\tТаблица умножения");

        for (int i = 0; i <= 10; i++) {
            System.out.print("\n");
            for (int k = 1; k <= 10; k++) {
                System.out.print("   \t");
                int sum = i * k;
                System.out.print( i + " * " + k + " = " + sum);
            }
        }
    }
}