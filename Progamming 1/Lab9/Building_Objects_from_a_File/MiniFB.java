import java.io.*;
import java.util.*;

public class MiniFB {

    public static List<Person> readInData(String filename) {
        
        ArrayList<String> list = new ArrayList<String>();

        List<Person> objectPersons = new ArrayList<Person>();

        try {
            // Likely a way to do this and the next part all in one loop
            //  but was unable to work out how to move n forward on the loop of a Buffered reader
            BufferedReader br = new BufferedReader(new FileReader(filename));

            while (br.ready()) {
                list.add(br.readLine());
            }

            br.close();
        }
        catch (FileNotFoundException e) {
            System.err.println("The file doesn't exist.");
        }
        catch (IOException e) {
            System.err.println("Something went wrong on the read.");
        }

        for(int i = 0; i < list.size(); i++)
        {
            
            if(list.get(i).equals("Student")){
                objectPersons.add(new Student(list.get(i + 1), list.get(i + 2), Integer.parseInt(list.get(i + 3))));
                i = i + 3;
            }
            else if(list.get(i).equals("Academic")){
                objectPersons.add(new Academic(list.get(i + 1), list.get(i + 2)));
                i = i + 2;
            }
            else if(list.get(i).equals("Programmer")){
                objectPersons.add(new Programmer(list.get(i + 1), list.get(i + 2)));
                i = i + 2;
            }
        }

        return objectPersons;
    }

    public static void main(String[] args) {
        List<Person> people = readInData("testFile.txt");

        System.out.println(people);
    }

}
