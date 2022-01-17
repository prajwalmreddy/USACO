/*
    Author: Prajwal Reddy
    Date: January 17th, 2022
    Problem: USACO 2020 December Contest, Bronze Problem 1. Do You Know Your ABCs?
    Time Taken ~ 27.0ms
*/

package com.ioipractice.bronze.solutions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Dec20One {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine(); // 2 2 11 4 9 7 9

        String[] numbers = input.split(" ");
        int[] letters = new int[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            letters[i] = Integer.parseInt(numbers[i]);
        }

        Arrays.sort(letters);

        int a = letters[0];
        int b = letters[1];
        int c = letters[letters.length - 1] - a - b;

        System.out.println(a + " " + b + " " + c); // 2 2 7
    }
}
