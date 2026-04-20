package com.pluralsight;

import javax.print.attribute.standard.MediaSize;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class BedtimeStories {
    public static void main(String[] args) {

        Scanner theScanner = new Scanner(System.in);

        System.out.println("Enter the name of the story file to read:");
        System.out.println("(Goldilocks.txt, hansel_and_gretel.txt, mary_had_a_little_lamb.txt)");
        String fileName = theScanner.nextLine();
        try {
            BufferedReader myBufferedReader = new BufferedReader(new FileReader("src/main/resources/"+fileName));

            String line;

            while ((line= myBufferedReader.readLine()) !=null){
                System.out.println(line);
            }
            myBufferedReader.close();


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
