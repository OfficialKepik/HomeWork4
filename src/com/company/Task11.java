package com.company;

public class Task11 {
    public static void main(String[] args) {
        int countF = 0, countB = 0, countH = 0;
        for (int i = 1; i < 1001; i++) {
            if (i % 3 == 0) {
                System.out.println("fizz");
                countF++;
                if (i % 5 == 0) {
                    System.out.println("buzz");
                    countB++;
                    if (i % 15 == 0) {
                        System.out.println("hiss");
                        countH++;
                    }
                }
            } else if (i % 5 == 0) {
                System.out.println("buzz");
                countB++;
                if (i % 15 == 0) {
                    System.out.println("hiss");
                    countH++;
                }
            } else System.out.println(i);
        }
        System.out.println("Count of Fizz : " + countF);
        System.out.println("Count of Buzz : " + countB);
        System.out.println("Count of Hiss : " + countH);
    }
}
