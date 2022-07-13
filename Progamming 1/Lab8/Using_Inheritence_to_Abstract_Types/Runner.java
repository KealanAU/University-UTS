import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Runner {
	

// System.out.print("Enter any number: ");

// // This method reads the number provided using keyboard
// int num = scan.nextInt();

	//Fill out this method to read in the data as
	//described, and return a List of a suitable type.
	private static List<Person> readInPeople() {
		//stuff goes here
		Scanner scan = new Scanner(System.in);
		System.out.print("How many people are there? ");
		int numPeople = scan.nextInt();
		scan.nextLine();
		List<Person> list = new ArrayList<Person>();

		while(list.size() != numPeople){
			System.out.println("What type of person is it?");
			System.out.println("1. Student");
			System.out.println("2. Academic");
			System.out.println("3. Code Monkey");
			
			int choice = 0;
			
			while(choice == 0 ){
				System.out.print("Enter a choice: ");
				choice = scan.nextInt();
				scan.nextLine();
			}
			if(choice == 1){
				System.out.print("What is the person's name? ");
				String name = scan.nextLine();
				System.out.print("What degree are they studying? ");
				String studying = scan.nextLine();
				System.out.print("What year are they in? ");
				int year = scan.nextInt();
				// System.out.println(name + studying + year);
				scan.nextLine();
				list.add(new Student(name, studying, year));
			}
			else if(choice == 2){
				System.out.print("What is the person's name? ");
				String name = scan.nextLine();
				System.out.print("What subject do they teach? ");
				String studying = scan.nextLine();
				// System.out.println(name + studying);
				list.add(new Academic(name, studying));
			}
			else if(choice == 3){
				System.out.print("What is the person's name? ");
				String name = scan.nextLine();
				System.out.print("What programming language do they like? ");
				String studying = scan.nextLine();
				// System.out.println(name + studying);
				list.add(new CodeMonkey(name, studying));
			}

		}
		return list;
	}
	
	public static void main(String[] args) {
		List< Person > people = readInPeople();
		
		for (Person persons : people) {
			//Print out each person on a new line.
			System.out.println(persons.toString());
		}
	}
}
