package day02;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <= 10; i++) {
            System.out.println("Enter Integer" + i + ": ");
            int num = scanner.nextInt();

            long factorial = 1;

            for (int j = 1; j <= num; j++) {
                factorial *= j;
            }
            System.out.println("Factorial of " + num + " = " + factorial);
        }
        scanner.close();
    }
}
