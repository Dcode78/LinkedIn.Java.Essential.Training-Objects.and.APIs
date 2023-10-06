package exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MultipleExceptions {

    public static void main(String[] args) {

        File file = new File("C:\\Users\\User\\Documents\\numbers.txt");
        try {
            Scanner fileReader = new Scanner(file);
            while (fileReader.hasNext()){
                System.out.println(fileReader.nextDouble());
            }
        }catch (FileNotFoundException | InputMismatchException e){
            System.out.println("Error occurred " + e.getMessage());
            e.printStackTrace();
        }
    }
}
