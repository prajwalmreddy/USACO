/*
    Author: Prajwal Reddy
    Date: January 17th, 2022
    Problem: USACO 2016 January Contest, Bronze Problem 1. Promotion Counting
    Time Taken ~ 15.0ms
 */

package com.ioipractice.bronze.solutions;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.StringTokenizer;

public class Jan16One {
    public static void main(String[] args) throws IOException {
        byte[] fileBytes = Files.readAllBytes(Paths.get("src/com/ioipractice/bronze/fin/promote.in"));
        String input = new String(fileBytes, Charset.defaultCharset());

        StringTokenizer tokens = new StringTokenizer(input);
        int[] numbers = new int[tokens.countTokens()];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(tokens.nextToken());
        }

        int platinumPromoted = numbers[7] - numbers[6];
        int goldPromoted = numbers[5] - numbers[4] + platinumPromoted;
        int silverPromoted = numbers[3] - numbers[2] + goldPromoted;

        PrintWriter pw = new PrintWriter("src/com/ioipractice/bronze/fout/promote.out");
        pw.println(platinumPromoted);
        pw.println(goldPromoted);
        pw.println(silverPromoted);
        pw.close();
    }
}
