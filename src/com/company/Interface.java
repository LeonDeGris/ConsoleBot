package com.company;
import java.util.Scanner;

public class Interface {
    public static String talkWithBot(){
        Scanner scan = new Scanner(System.in);
        System.out.println("\n Hello, user! \n");
        System.out.println("Chose your action:");
        System.out.println("1. Read File");
        System.out.println("2. Clear File");
        System.out.println("3. Complete File");
        int action = scan.nextInt();

        if (action == 1){
            ReadFile.Read();
        }
        else if (action == 2){
            ClearFile.Clear();
            System.out.println("\nWell done, my friend. Your file is clear.");
        }
        else if (action == 3){
            CompleteFile.Complete();
            System.out.println("Good job!");
        }
        else {
            System.out.println("\nAction with such number doesn't exist! Try again!");
        }
        return talkWithBot();
    }
}
