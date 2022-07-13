import java.io.*;
import java.util.*;

public class SameContent {

    public static boolean sameContent(String filename1, String filename2) {
        //This is the method to complete.
        try {
            BufferedReader br1 = new BufferedReader(new FileReader(filename1));
            BufferedReader br2 = new BufferedReader(new FileReader(filename2));

            // System.out.println(br1.lines());
            // System.out.println(br2.length());
            
            while (br1.ready() && br2.ready()) {
                // System.out.println(br1.readLine());
                // System.out.println(br2.readLine());
                if(br1.readLine().equals(br2.readLine()) == false){
                    return false;
                }
                
            }
            if(br2.ready() || br1.ready()){
                return false;
            }


            br1.close();
            br2.close();
            return true;
            
        }
        catch (FileNotFoundException e) {
            System.err.println("The file doesn't exist.");
        }
        catch (IOException e) {
            return false;
        }
        catch (NullPointerException e) {
            return false;
        }
        return false;
    }

    public static void main(String[] args) {
        if (sameContent(args[0], args[1])) {
            System.out.println("The two files have the same content.");
        }
        else {
            System.out.println("The two files do not have the same content.");
        }
    }
}
