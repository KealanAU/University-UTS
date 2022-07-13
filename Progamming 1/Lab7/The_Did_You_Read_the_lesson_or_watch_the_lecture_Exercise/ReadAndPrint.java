import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class ReadAndPrint {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//Create an ArrayList
		ArrayList<Integer> list = new ArrayList<Integer>();
		//Read in user input, storing it in the 
		//ArrayList until -1 is entered.
		int n;
		while ((n=sc.nextInt()) != -1) { //first time here  
			list.add(n); //second time here
		}

		//Print out the whole ArrayList in one go.
		System.out.println(list);

	}
}