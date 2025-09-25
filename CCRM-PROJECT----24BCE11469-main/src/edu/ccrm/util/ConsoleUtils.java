package edu.ccrm.util;

import java.util.Scanner;

public class ConsoleUtils {
    private static final Scanner scanner = new Scanner(System.in);

    public static String readLine(String prompt) {
        System.out.print(prompt + ": ");
        return scanner.nextLine();
    }

    public static int readInt(String prompt) {
        System.out.print(prompt + ": ");
        return Integer.parseInt(scanner.nextLine());
    }

    public static double readDouble(String prompt) {
        System.out.print(prompt + ": ");
        return Double.parseDouble(scanner.nextLine());
    }
}
