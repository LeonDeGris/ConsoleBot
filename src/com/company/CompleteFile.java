package com.company;
import java.io.*;
import java.util.Scanner;

public class CompleteFile {
    public static void Complete(){
        try(FileWriter writer = new FileWriter("C:\\Users\\Leon\\Desktop\\Prog\\TextFile.txt", true))
        {
            Scanner scan = new Scanner(System.in);
            System.out.println("Complete it, pls: \n");
            String text = scan.nextLine();
            writer.write(text);

        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
    }
}
