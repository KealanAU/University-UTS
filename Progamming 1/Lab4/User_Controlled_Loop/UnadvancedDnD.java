import java.util.Scanner;

public class UnadvancedDnD {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		boolean boolTest = true;
		while(sc.hasNextLine()){

			System.out.print("Please enter an action: ");
			
			String a = sc.nextLine();
			if( a.equals("x")){
				System.out.println("Bye!");
				System.exit(0);
			}
			else if( a.equals("u")){
				System.out.println("You go one square up.");
			}
			else if( a.equals("d")){
				System.out.println("You go one square down.");
			}
			else if( a.equals("l")){
				System.out.println("You go one square left.");
			}
			else if( a.equals("r")){
				System.out.println("You go one square right.");
			}
			else if( a.equals("s")){
				System.out.println("You search the square for treasure. You find nothing.");
			}
			else if( a.equals("h")){
				System.out.println("You hide, waiting for enemies to come by. It gets boring after about an hour and a half, so you give up.");
			}
			else if( a.equals("e")){
				System.out.println("You eat some food. You regain 0 hit points.");
			}
			else{
				System.out.println("I don't understand.");
			}
		}
	}
}