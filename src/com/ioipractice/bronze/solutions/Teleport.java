/*
    Author: Prajwal Reddy
    Date: January 17th, 2022
    Problem: USACO 2018 February Contest, Bronze Problem 1. Teleportation
    Time Taken ~ 12.0ms
*/

package com.ioipractice.bronze.solutions;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Teleport {
    public static void main(String[] args) throws IOException {
        byte[] fileBytes = Files.readAllBytes(Paths.get("src/com/ioipractice/bronze/fin/teleport.in"));
        String input = new String(fileBytes, Charset.defaultCharset());

        String[] numbers = input.split(" ");

        int a = Integer.parseInt(numbers[0]);
        int b = Integer.parseInt(numbers[1]);

        int x = Integer.parseInt(numbers[2]);
        int y = Integer.parseInt(numbers[3]);

        int crowDistance = Math.abs(a - b);

        int distance = Math.abs((Math.min(x, y) - Math.min(a, b))) + Math.abs((Math.max(x, y) - Math.max(a, b)));

        PrintWriter pw = new PrintWriter("src/com/ioipractice/bronze/fout/teleport.out");
        pw.print(Math.min(crowDistance, distance));
        pw.close();
    }
}
