public class MethodErrors {
	
	public static String method1() {
		return "You";
	}
	
	public static String method2() {
		return "have";
	}	
	
	public static String method3() {
		return "solved";
	}
	
	public static int method4(int count) {
		return count;
	}
	
	public static String method5() {
		String Value = "bugs";
		return Value;
	}
	
	public static void main(String[] args) {
		
		System.out.println(method1() + " " + method2() + " " + method3() + " " + method4(5) + " " + method5() + ".");
		
	}
}