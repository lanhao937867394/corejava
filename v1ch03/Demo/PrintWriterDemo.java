import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class PrintWriterDemo {
    
    public static void main(String[] args) {

        PrintWriter out = null;
        try{
            out = new PrintWriter("output.txt", "UTF-8");
        } catch (FileNotFoundException fnfe){

        } catch (UnsupportedEncodingException usee){

        }

        // PrintWriter class provides both write family methods
        // and print family methods. Use print as they are of
        // higher level
        out.print("This is the first line of the file!\n");
        out.println("This is the second line");
        out.printf("This is the %1$drd line!%2$s", 3, "\n");
        out.close();
    }
}