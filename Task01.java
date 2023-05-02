package Homework_Java_1;

import java.io.Console;
import java.util.Scanner;

/**
 * Task01
 */
public class Task01 {

    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Введите число n: ");
        int number1 = iScanner.nextInt();
        int result_sum = 0;
        int result_pow = 1;
        for (int i = 1; i <= number1; i++){
            result_sum += i;
            result_pow *= i;
        }
        System.out.printf("Троеугольное числа равно: %s", result_sum);
        System.out.println();
        System.out.printf("!N числа равно: %s", result_pow);
        iScanner.close(); 
    }
}