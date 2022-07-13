import java.util.Scanner;

public class Marks {
	public static void main(String[] args) {
		//It all goes in here
		Scanner sc = new Scanner(System.in);

		System.out.print("How many students are there? ");

		int n = Integer.parseInt(sc.nextLine());

		String[][] studentDB = new String[n][2];

		for(int i=0; i < studentDB.length ; i++){
			
			int j = i + 1;

			String studentName = "Enter name of student " + j +": ";
			String studentAge = "Enter mark " + j +": ";

			System.out.print(studentName);
			studentDB[i][0] = sc.nextLine();

			System.out.print(studentAge);
			studentDB[i][1] = sc.nextLine(); 

		}

		double avgMark = 0;
		int bestStudentLocation = 0;
		int worstStudentLocation = 0;

		for(int k=0; k < studentDB.length; k++){
			int tempNumber = Integer.parseInt(studentDB[k][1]);
			if(tempNumber > Integer.parseInt(studentDB[bestStudentLocation][1])){
				bestStudentLocation = k;
			}

			if(tempNumber < Integer.parseInt(studentDB[worstStudentLocation][1])){
				worstStudentLocation = k;
			}

			avgMark = avgMark + tempNumber;

		}
		avgMark = avgMark/ studentDB.length;

		String avgMarkString = "The average mark is: " + avgMark;
		String bestStudent = "The best student is " + studentDB[bestStudentLocation][0];
		String worstStudent = "The worst student is " + studentDB[worstStudentLocation][0];


		System.out.println(avgMarkString);
		System.out.println(bestStudent);
		System.out.println(worstStudent);
	}
}