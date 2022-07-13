public class StringWrapper {

	private String x ="";  // Create a class attribute

	// Create a class constructor for the Main class
	public void Main() {
		x = "";  // Set the initial value for the class attribute x
	}
	public void setValue(String args) {
		x = args; 
	}
	public String getValue() {
		return x; // Create an object of class Main (This will call the constructor)
	}
}

