import java.io.*;
import java.util.*;


public class ReadNumbers {

    public static List<Integer> readFile(String filename) {
        //Create the list and read the data from the file.
        List<Integer> list= new ArrayList<Integer>();

        try {
            BufferedReader br = new BufferedReader(new FileReader(filename));

            while (br.ready()) {
                list.add(Integer.parseInt(br.readLine()));
            }

            br.close();
        }
        catch (FileNotFoundException e) {
            System.err.println("The file doesn't exist.");
        }
        catch (IOException e) {
            System.err.println("Something went wrong on the read.");
        }
        
        return list;
    }

    public static void main(String[] args) {

        List<Integer> numbers = readFile(args[0]);

        System.out.println(numbers);
    }
}
