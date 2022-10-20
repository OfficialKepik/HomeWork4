package com.company;

public class Task10 {
    public static void main(String[] args) {
        int num = 1;
        boolean answer = false;
        while (answer != true) {
            int check = 0;
            num++;
            for (int i = 1; i < 21; i++) {
                if (num % i == 0) {
                    check++;
                } else break;
                if (check == 20) {
                    answer = true;
                }
            }
        }
        System.out.println("Answer : " + num);
    }
}
