import java.util.Scanner;

public class SmallestSwap {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		//Let the looping begin! (and declare the array)
		//While this can be done in two loops,
		//if you're not sure, do the three
		//steps that require loops as separate loops.
		//Always remember, working is better than
		//perfect.\

		int intArray[];    //declaring array
		intArray = new int[n];
		int location = 0;
		// add numbers to array
		for(int k=0; k < n; k++){
			intArray[k] = sc.nextInt();
		}
		
		for(int i = 0; i < intArray.length; i++){
			
			if(intArray[location] > intArray[i]){
				location = i;	
			}
		}
		
		int tempNumber = intArray[0];
		intArray[0] = intArray[location];
		intArray[location] = tempNumber;
		
		for(int j = 0; j < intArray.length; j++){
			System.out.println(intArray[j]);
		}

	}
}