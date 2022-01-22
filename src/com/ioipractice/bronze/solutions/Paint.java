/*
    Author: Prajwal Reddy
    Date: January 22nd, 2022
    Problem: USACO 2015 December Contest, Bronze Problem 1. Fence Painting
    Time Taken ~ 6ms
*/

package com.ioipractice.bronze.solutions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Paint {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(
                new FileReader("src/com/ioipractice/bronze/fin/paint.in")
        );

        StringTokenizer tokens = new StringTokenizer(input.readLine());
        StringTokenizer tokens1 = new StringTokenizer(input.readLine());

        int a = Integer.parseInt(tokens.nextToken());
        int b = Integer.parseInt(tokens.nextToken());

        int c = Integer.parseInt(tokens1.nextToken());
        int d = Integer.parseInt(tokens1.nextToken());

        int painted = 0;

        if (d > a) {
            painted = b - c;
        } else {
            painted = Math.abs(d - c) + Math.abs(b - a);
        }


        PrintWriter pw = new PrintWriter("src/com/ioipractice/bronze/fout/paint.out");
        pw.println(painted);
        pw.close();
    }
}
