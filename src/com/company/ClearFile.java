package com.company;
import java.io.*;

public class ClearFile {
    public static void Clear(){

        try {
            FileOutputStream file = new FileOutputStream("C:\\Users\\Leon\\Desktop\\Prog\\TextFile.txt");

            file.write(new byte[0], 0, 0);
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
    }
}
