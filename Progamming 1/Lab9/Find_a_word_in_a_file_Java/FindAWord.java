import java.io.*;
import java.util.*;

public class FindAWord {

    public static boolean contains(String filename, String testWord) {
        //Make this method work!
        try {
            BufferedReader br = new BufferedReader(new FileReader(filename));

            while (br.ready()) {
                if(testWord.equals(br.readLine()) == true){
                    return true;
                }
            }

            br.close();
        }
        catch (FileNotFoundException e) {
            System.err.println("The file doesn't exist.");
        }
        catch (IOException e) {
            System.err.println("Something went wrong on the read.");
        }

        return false;
    }

    public static void main(String[] args) {
        
        if (contains(args[0], args[1])) {
            System.out.println("The file contains the word.");
        }
        else {
            System.out.println("The file does not contain the word.");
        }
    }
}
