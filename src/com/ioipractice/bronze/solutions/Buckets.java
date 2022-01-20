/*
    Author: Prajwal Reddy
    Date: January 20th, 2022
    Problem: USACO 2019 US Open Contest, Bronze Problem 1. Bucket Brigade
    Time Taken ~ 20.0ms
*/

package com.ioipractice.bronze.solutions;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.StringTokenizer;

public class Buckets {
    public static void main(String[] args) throws IOException {
        byte[] fileBytes = Files.readAllBytes(Paths.get("src/com/ioipractice/bronze/fin/buckets.in"));
        String input = new String(fileBytes, Charset.defaultCharset());

        StringTokenizer tokens = new StringTokenizer(input);
        String[][] positions = new String[10][10];

        int[] barn = {-1, -1};
        int[] rock = {-1, -1};
        int[] lake = {-1, -1};

        for (int i = 0; i < 10; i++) {
            String current = tokens.nextToken();
            for (int j = 0; j < 10; j++) {
                positions[i][j] = String.valueOf(current.charAt(j));
                if (positions[i][j].equals("B")) {
                    barn[0] = i;
                    barn[1] = j;
                } else if (positions[i][j].equals("R")) {
                    rock[0] = i;
                    rock[1] = j;
                } else if (positions[i][j].equals("L")) {
                    lake[0] = i;
                    lake[1] = j;
                }
            }
        }

        int distance = Math.abs(lake[1] - barn[1]) + Math.abs(lake[0] - barn[0]);
        int modifier = -1;

        if ((rock[0] == barn[0] || rock[1] == barn[1]) && (rock[0] == lake[0] || rock[1] == lake[1])) {
            modifier += 2;
        }

        PrintWriter pw = new PrintWriter("src/com/ioipractice/bronze/fout/buckets.out");
        pw.print(distance + modifier);
        pw.close();
    }
}
