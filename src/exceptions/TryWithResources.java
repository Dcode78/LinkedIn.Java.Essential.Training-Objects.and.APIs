package exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TryWithResources {

    public static void main(String[] args) {
        String pathToFile = "C:\\Users\\User\\Documents\\numbers";

        File inputFile = new File(pathToFile + ".txt");
        File outputFile = new File(pathToFile + "out.txt");

        try(
            Scanner fileReader = new Scanner(inputFile);
            PrintWriter fileWriter = new PrintWriter(outputFile);
            ){

            while(fileReader.hasNext()){
                double d = fileReader.nextDouble();
                d = d + 1.0;
                fileWriter.println(d);
            }
        }catch(FileNotFoundException | InputMismatchException e){
            //e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }
}