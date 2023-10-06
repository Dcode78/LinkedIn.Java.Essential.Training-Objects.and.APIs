package exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class FinallyBlock {

    public static void main(String[] args) {
        File file = new File("C:\\Users\\User\\Documents\\numbers.txt");
        Scanner fileReader = null;
        try{
            fileReader = new Scanner(file);

            while(fileReader.hasNext()){
                System.out.println(fileReader.nextDouble());
            }

        }catch(FileNotFoundException | InputMismatchException e){
            e.printStackTrace();
        } finally {
            System.out.println("Closed the file !");
            fileReader.close();
        }

    }
}
