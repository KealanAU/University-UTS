import java.util.List;
import java.util.*;

public class Smallest {
	
	//Add your method here.
	public static int smallest(List<Integer> list){  
		
		// List<Integer> list=Arrays.asList(a);  
		
		Collections.sort(list);  
		
		int element=list.get(0);  
		
		return element;  
	}  
	
	
	public static void main(String[] args) {
		//Nothing to see here
	}
	
}