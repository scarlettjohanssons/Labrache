package com.company;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        System.out.print("Крицький Ілля Юрійович ІПЗ-33\n ");
        FileWriter fw = new FileWriter( "output.txt" );
        FileReader fr = new FileReader( "input.txt" );
        Scanner sc = new Scanner(fr);
        String s1 = sc.next();
        String s2 = sc.next();
        while (sc.hasNext()) {
            if (s2.toLowerCase().charAt(0)==s1.toLowerCase().charAt(s1.length()-1)) fw.write(s1+" "+ s2+ "\n");
            s1 = s2;
            s2 = sc.next();
        }
        fw.close();
        fr.close();
    }
}
