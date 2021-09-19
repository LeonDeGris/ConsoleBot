package com.company;
import java.io.*;
import java.util.Arrays;

public class ReadFile {
    public static void Read() {
        try (FileInputStream file = new FileInputStream("C:\\Users\\Leon\\Desktop\\Prog\\TextFile.txt")) {

//            System.out.println(Arrays.toString(file.readAllBytes()));
            int i = -1;
            while ((i = file.read()) != -1) {

                System.out.print((char) i);
            }

        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }
    }
}
