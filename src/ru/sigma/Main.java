package ru.sigma;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.io.BufferedReader;
import java.io.*;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Student08 on 05.05.2015.
 */
public class Main {

    public static void main(String[] args) {
        try {
            //Scanner scan = new Scanner(new File("blabla"));
            BufferedReader reader = new BufferedReader(
                    new InputStreamReader(new FileInputStream("bl2a.txt")));
            String text;
            ArrayList<String> lines = new ArrayList<String>();
            while ((text = reader.readLine()) != null) {
                lines.add(text);
            }


            PrintWriter writer = new PrintWriter(new File("output.txt"));

            for (int i = 0; i <= lines.size() - 1; i++) {
                writer.println(lines.get(i));

            }

            writer.flush();
            reader.close();
        } catch (FileNotFoundException e){
            System.err.println("file not found");
        }

        catch (IOException e){
            //e.printStackTrace();
            //System.out.println("Error1");
           // System.err.println(e.getMessage());
            System.out.println("IO");
        } finally {
            //выполнится в любом случае
        }
    }
    }

