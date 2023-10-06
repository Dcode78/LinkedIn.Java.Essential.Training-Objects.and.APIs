package exceptions;

import java.io.File;
import java.io.IOException;

public class TryCatch {

    public static void main(String[] args) {
        File file = new File("user/documents/nonexistantan.txt");
        try {
            file.createNewFile();
        }catch (IOException e){
            System.out.println("Error occurred " + e.getMessage());
            e.printStackTrace();
        }
    }
}
