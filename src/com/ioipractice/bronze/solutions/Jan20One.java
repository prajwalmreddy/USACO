/*
    Author: Prajwal Reddy
    Date: January 17th, 2022
    Problem: USACO 2020 January Contest, Bronze Problem 1. Word Processor
    Time Taken ~ 19.0ms
*/

package com.ioipractice.bronze.solutions;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.StringTokenizer;

public class Jan20One {
    public static void main(String[] args) throws IOException {
        byte[] fileBytes = Files.readAllBytes(Paths.get("src/com/ioipractice/bronze/fin/word.in"));
        String input = new String(fileBytes, Charset.defaultCharset());

        StringTokenizer tokens = new StringTokenizer(input);
        String[] words = new String[tokens.countTokens()];

        for (int i = 0; i < words.length; i++) {
            words[i] = tokens.nextToken();
        }

        int characters = Integer.parseInt(words[1]);
        int lineLength = 0;
        StringBuilder output = new StringBuilder();

        for (int i = 2; i < words.length; i++) {
            String current = words[i];

            if ((lineLength + current.length()) > characters) {
                output = new StringBuilder(output.substring(0, output.length() - 1));
                output.append("\n");
                lineLength = 0;
            }

            output.append(current).append(" ");
            lineLength += current.length();
        }

        output = new StringBuilder(output.substring(0, output.length() - 1));

        PrintWriter pw = new PrintWriter("src/com/ioipractice/bronze/fout/word.out");
        pw.print(output);
        pw.close();
    }
}
