import java.io.*;
import java.util.Scanner;

public class InToFile {

    public static void inToFile(String filename) {
        //Read from System.in, write everyhing out to
        //the file given with the name given by the 
        //parameter to the method.
        
        Scanner sc = new Scanner(System.in);
        try{
            FileWriter fw = new FileWriter(filename, true);

            while(sc.hasNextLine()){

                System.out.print("Please enter an action: ");
                
                String a = sc.nextLine();
                if(a.equals("done"))
                {
                    fw.close();  
                }
                else{
                    fw.write(a);
                }
            }
            
        }
        catch (IOException e) 
        {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        //Don't need anything here, but you can run
        //anything you want to do some testing.
    }

}