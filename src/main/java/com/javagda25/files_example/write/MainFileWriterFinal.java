package com.javagda25.files_example.write;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class MainFileWriterFinal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        // try with resources
//        try () {

        try (PrintWriter printWriter = new PrintWriter(new FileWriter("katalog/nazwa.txt", true))) {
            for (int i = 0; i < 10; i++) {
                scanner.next();
                printWriter.println("hello!");
                printWriter.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
