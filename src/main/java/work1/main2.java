package work1;

import java.util.Scanner;

//2. Написать метод, который определяет, является ли год високосным, и возвращает boolean (високосный - true, не високосный - false). Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
public class main2 {
    public static void main(String[] args) {
        highYear();
    }

    private static void highYear() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите год: ");
        int year = scanner.nextInt();
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println("Високосный год");
                } else {
                    System.out.println("Не високосный год");
                }
            } else {
                System.out.println("Високосный год");
            }
        } else {
            System.out.println("Не висакосный год");
        }
    }
}