import java.io.*;
import java.util.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;

public class ScannerPathReadFromFile{

    // 2
    public static void main(String[] args) throws IOException{

        /*
        There are two ways to surpress the compiler's exception error
        1. use a try catch block
        2. tag the method using the throws clause
        */
        Scanner file = null;

        // 1
        try{

            // Both line will work, Scanner has separate constructors for]
            // String and Charset
            file = new Scanner(Path.of("toRead.txt"), StandardCharsets.UTF_8);
            file = new Scanner(Path.of("toRead.txt"), "UTF-8");
        } catch (IOException io){

        }

        file = new Scanner(Path.of("toRead.txt"), StandardCharsets.UTF_8);
        for (int i = 0; file.hasNextLine(); i++){
            String strToPrint = String.format("The %1$dth line is: %2$s\n", i + 1, file.nextLine());
            System.out.print(strToPrint);
        }
        file.close();

    }
}