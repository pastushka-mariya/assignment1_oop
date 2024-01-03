package Recursive_output_of_numbers;

import java.util.Scanner;

public class RecursiveNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число A: ");
        int A = scanner.nextInt();

        System.out.print("Введите число B: ");
        int B = scanner.nextInt();

        if (A < B) {
            printAscending(A, B);
        } else {
            printDescending(A, B);
        }

        scanner.close();
    }

    private static void printAscending(int start, int end) {
        if (start > end) {
            return;
        }

        System.out.print(start + " ");
        printAscending(start + 1, end);
    }

    private static void printDescending(int start, int end) {
        if (start < end) {
            return;
        }

        System.out.print(start + " ");
        printDescending(start - 1, end);
    }
}

