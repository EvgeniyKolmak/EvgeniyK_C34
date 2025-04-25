package com.kolmak;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String sourceFile = "D:\\EvgeniyK_C34\\hometask12\\src\\main\\resources\\RomeoAndGulieta.txt";
        String romeoFile = "D:\\EvgeniyK_C34\\hometask12\\src\\main\\resources\\Romeo.txt";
        String gulietaFile = "D:\\EvgeniyK_C34\\hometask12\\src\\main\\resources\\Gulieta.txt";


        try(BufferedReader reader = new BufferedReader(new FileReader(sourceFile));
            BufferedWriter writerRomeo = new BufferedWriter(new FileWriter(romeoFile));
            BufferedWriter writerGulieta = new BufferedWriter(new FileWriter(gulietaFile)))
        {
            String line = "";
            boolean flag = false;

            while((line = reader.readLine()) != null) {
                if(line.startsWith("Romeo:")) {
                    writerRomeo.write(line);
                    writerRomeo.newLine();
                    flag = true;
                }
                else if(line.startsWith("Gulieta:")){
                    writerGulieta.write(line);
                    writerGulieta.newLine();
                    flag = false;
                } else {
                    if(flag) {
                        writerRomeo.write(line);
                        writerRomeo.newLine();
                    }
                    else{
                        writerGulieta.write(line);
                        writerGulieta.newLine();
                    }
                }
            }
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}