import java.util.function.Function;
import java.util.function.IntUnaryOperator;
import java.util.*;
import java.io.*;

public class Processor {

    public boolean isDouble(String value) {
        try {
            Double.parseDouble(value);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
    
    public boolean isInteger(String value) {
        try {
            Double.parseDouble(value);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }



    public static <O> void mapData(String inputFilename, String outputFilename, Function<Integer, O> map) {
        // Stuff goes here
        
        List<O> list= new ArrayList<O>();

        try {

            BufferedReader br = new BufferedReader(new FileReader(inputFilename));

            while (br.ready()) {

                try{

                    int i = Integer.parseInt(br.readLine());                    
                    O k = map.apply(i); 
                    list.add(k);

                }
                catch (ClassCastException e) {
                    System.err.println("Problem casting.");
                }
              catch (FileNotFoundException e) {
                    System.err.println("The file doesn't exist.");
                }  
                catch (NumberFormatException e) {
                    System.err.println("Float");
                }
                catch (IOException e) {
                    System.err.println("Something went wrong on the read.");
                }

                    
                

            }

            br.close();

            FileWriter fw = new FileWriter(outputFilename, true);

            for(int p =0; p < list.size(); p++)
            {
                fw.write(list.get(p) + "\n");

            }
            fw.close(); 
            

        }
        catch (FileNotFoundException e) {
            System.err.println("The file doesn't exist.");
        }
        catch (NumberFormatException e) {
            System.err.println("Float");
        }
        catch (IOException e) {
            System.err.println("Something went wrong on the read.");
        }


    }

    public static void main(String[] args) {
         mapData("inputTest.txt", "outputTest.txt", Function.<Integer>identity());
    }
}
