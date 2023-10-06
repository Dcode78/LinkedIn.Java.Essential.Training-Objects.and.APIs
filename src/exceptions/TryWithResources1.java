package exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TryWithResources1 {

    public static void main(String[] args) {


        File inputFile = new File("C:\\Users\\User\\Documents\\numbers.txt");
        File outputFile = new File("C:\\Users\\User\\Documents\\output.txt");

        try(
                Scanner fileReader = new Scanner(inputFile);
                PrintWriter fileWriter = new PrintWriter(outputFile)
        ){

            while(fileReader.hasNext()){

                fileWriter.println(fileReader.nextDouble());
            }
        }catch(FileNotFoundException | InputMismatchException e){
            System.out.println("Error");
            //e.printStackTrace();
            e.getMessage();

        }
    }
}