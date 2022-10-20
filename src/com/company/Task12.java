package com.company;

import java.util.Scanner;

public class Task12 {

    public static void main(String[] args) {
        double x = 1, y = 0;
        int day = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print(" Enter a number : ");
        y = scanner.nextInt();
        System.out.println();
        while (x < y) {
            x = x + (x / 10);
            System.out.println(x + " kilometers");
            day++;
        }
        System.out.println(" Count of days to x = y : " + day);
    }
}
