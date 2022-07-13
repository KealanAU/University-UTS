public class Contains {
	
	//Write your method here.
	public static boolean contains(int[] a, int b){
		for(int i=0; i<a.length; i++){
			if(a[i] == b){
				return true;
			}
		}
		return false;
	}
	
	//Don't need to touch anything below here, but it
	//won't hurt the tests - as long as it works.
	public static void main(String[] args) {
		
		int[] testArray = {5, 7, 2, 8, 33, 1, 20, 34, 21};
		
		for (int i = 0; i < 25; i++) {
			if (contains(testArray, i)) {
				System.out.println("The array contains " + i);
			}
			else {
				System.out.println("The array does not contain " + i);
			}
		}
		
	}
	
}