package com.lambda;

import java.util.Scanner;
import java.util.function.Function;

public class Activity {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Num:");
        int num = sc.nextInt();
        fact(num);
    }

    static void fact(int num) {
        Function<Integer, Integer> factorial = n -> {
            int result = 1;
            for (int i = 1; i <= n; i++) {
                result *= i;
            }
            return result;
        };

        int result = factorial.apply(num);

        System.out.println(result);
    }
}
