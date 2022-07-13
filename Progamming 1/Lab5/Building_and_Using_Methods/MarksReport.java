public class MarksReport {
	
	public static void main(String[] args) {
		
		StudentDatabase database = new StudentDatabase(StudentDatabase.readStudentsFromFile(args[0]));

		System.out.println("There are " + database.studentCount() + " students.");
		System.out.println("The average mark is " + database.averageMark() +".");
		System.out.println("The best student is " + database.bestStudent().studentName() + " with a mark of " + database.bestStudent().studentMark() + ".");
		System.out.println("The worst student is " + database.worstStudent().studentName() + " with a mark of " + database.worstStudent().studentMark() + ".");
	}
	
}
